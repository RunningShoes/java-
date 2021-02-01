package runoob;

public class ThreadTestDemo {


    public static void main(String[] args) {
//        Thread one = new Thread("one");
//        Thread two = new Thread("two");
//
//        one.start();
//        two.start();

//        System.out.println(one.getName());
//        System.out.println(one.getId());
//        System.out.println(one.getState());
//
//        System.out.println(two.getName());
//        System.out.println(two.getId());
//        System.out.println(two.getState());

//        ThreadEx t1 =  new ThreadEx("t1");
//        ThreadEx t2 =  new ThreadEx("t2");
//
//        t1.start();
//        t2.start();


//        ThreadEx one = new ThreadEx();
//        Thread t1 = new Thread(one);
//        Thread t2 = new Thread(one);
//
//        t1.start();
//        t2.start();
//        try {
//            t1.sleep(1000);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }





    }
}




class ThreadEx extends Thread {

    public ThreadEx() {
    }

    public ThreadEx(String name) {
        super(name);
    }

    public void run() {
        System.out.println(this.getName() + "running");
    }

}

class ThreadNew implements Runnable {
    private String name;

    public ThreadNew(String name) {
        super();
        this.name = name;
    }


    public void run() {
        System.out.println(name + "running");
    }
}