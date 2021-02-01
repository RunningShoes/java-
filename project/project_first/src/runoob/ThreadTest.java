package runoob;

public class ThreadTest implements Runnable {

    private int sleepTime;

    public ThreadTest() {
        sleepTime = (int) (Math.random() * 600);
    }

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() +
                    " going to sleep for " + sleepTime);
            Thread.sleep(sleepTime);
        } catch (InterruptedException ex) {
            ex.getLocalizedMessage();
        }
        System.out.println(Thread.currentThread().getName() + " finished");
    }

    public static void main(String[] args) {
        ThreadTest task = new ThreadTest();
        Thread thread1 = new Thread(task, "thread1");
        Thread thread2 = new Thread(task, "thread1");
        Thread thread3 = new Thread(task, "thread1");
        thread1.start();
        thread2.start();
        thread3.start();
        System.out.println("\"Threads started, main ends\"");



        /*生产者和消费者之间的问题*/
        //1.线程同步锁旗帜标
//        Tickets t = new Tickets(10);
//        try {
//            new Consumer1(t).start();
//            new Producer1(t).start();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        //2.数据共享内存
//        Tickets t1 = new Tickets(10);//共享这个对象
//        new Consumer(t1).start();
//        new Producer(t1).start();

        //3.wait(),notify()   : Tickets3  Producer3 Consumer3
        Tickets3 t2 = new Tickets3(10);
        new Consumer3(t2).start();
        new Producer3(t2).start();

    }

}

class Tickets3 {
    int num = 0;
    int size;
    int i = 0;
    boolean available = false;

    public Tickets3(int size) {    //构造函数，传入总票参数
        this.size = size;
    }
    public synchronized void put() {
        if (available == true) {
            try {
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Producer puts ticket" + (++num));
        available = true;
        notify();    //存票后唤醒售票线程开始售票
    }
    public synchronized  void sell(){
        if(available){
            System.out.println("Consumer buys ticket" + (num));
            available=false;
            notify();
            if(num==size)
                num=size+1;
        }else{
            try {
                wait();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
//        if(!available) {    //如果没有存票，则售票线程等待
//            try {
//                wait();
//            } catch(Exception e) {
//
//            }
//        }
        System.out.println("Consumer buys ticket" + (num));
        available = false;
        notify();
        if(num == size)
            num = size + 1;    //在售完最后一张票后，
        //设置一个结束标志，number>size表示售票结束
    }
}
class Consumer3 extends Thread{
    Tickets3 t = null;
    int i = 0;
    public Consumer3(Tickets3 t){
        this.t = t;
    }
    public void run(){
        while(i<t.size){
            t.sell();
        }
    }
}


class Producer3 extends Thread {
    Tickets3 t = null;
    public Producer3(Tickets3 t) {
        this.t = t;
    }
    public void run() {
        //如果存票数小于限定总量，则不断存入票
        while(t.num < t.size)
            t.put();
    }
}


class Tickets {
    int number = 0;    //票号
    int size;    //总票数
    boolean available = false;    //表示目前是否有票可售

    public Tickets(int size) {    //构造函数，传入总票参数
        this.size = size;
    }
}

class Producer extends Thread {
    Tickets t = null;

    public Producer(Tickets t) {
        this.t = t;
    }

    public void run() {
        while (t.number < t.size) {
            System.out.println("Producer puts ticket" + (++t.number));
            t.available = true;
        }
    }
}

class Consumer extends Thread {
    Tickets t = null;
    int i = 0;

    public Consumer(Tickets t) {
        this.t = t;
    }

    public void run() {
        while (i < t.size) {
            if (t.available == true && i <= t.number)
                System.out.println("Consumer buys ticket" + (++i));
            if (i == t.number)
                t.available = false;
        }
    }
}


class Producer1 extends Thread {
    Tickets t = null;

    public Producer1(Tickets t) {
        this.t = t;
    }

    public void run() {
        while (t.number < t.size) {
            synchronized (t) {    //申请对象t的锁旗标
                System.out.println("Producer puts ticket" + (++t.number));
                t.available = true;
            } //释放对象t的锁旗标
        }
    }
}

class Consumer1 extends Thread {
    Tickets t = null;
    int i = 0;

    public Consumer1(Tickets t) {
        this.t = t;
    }

    public void run() {
        while (i < t.size) {
            synchronized (t) {
                //申请对象t的锁旗标
                if (t.available == true && i <= t.number)
                    System.out.println("Consumer buys ticket" + (++i));
                if (i == t.number)
                    t.available = false;
            }
        }    //释放对象t的锁旗标
    }
}


class Exeception1 extends Throwable{
    String name;

    public Exeception1(String name) {
        super(name);
        this.name = name;
        System.out.println();
    }


}

