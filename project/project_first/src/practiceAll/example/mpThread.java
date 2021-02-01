package practiceAll.example;

//thread
class MyThread extends Thread {

    public int printNum(int i) {
        return i;
    }

    public void run() {

        System.out.println(this.getName() + "该线程正在运行！");
        for (int i = 1; i <= 10; i++)
            System.out.println(this.getName() + "正在打印" + this.printNum(i));
    }
}
//Runnable

class TestRun implements Runnable {
    int i = 5;

    public void run() {

        while (i >= 0) {
            System.out.println(Thread.currentThread().getName() + "runnable创建的该线程正在运行！" + i--);

        }
    }

}

class Cat implements Runnable {
    public void run() {
        int i = 5;
        while (i >= 0) {
            System.out.println(Thread.currentThread().getName() + "  创建的该线程正在运行！" + i--);
        }
    }
}


class Dog implements Runnable {
    public void run() {
        int i = 5;
        while (i >= 0) {
            System.out.println(Thread.currentThread().getName() + "  创建的该线程正在运行！" + i--);
//            try{
//                Thread.sleep(1000);
//            }catch(Exception e){
//                e.printStackTrace();
//            }

        }
    }
}

class Alphabet implements Runnable {
    @Override
    public void run() {
        char ch = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.println((char) (ch + i));
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


public class mpThread {

    public static void main(String[] args) {

        /**
         * Thread相关的组成
         */
//        MyThread oneT = new MyThread();
//        MyThread twoT = new MyThread();
//        oneT.start();
//        twoT.start();


        /**
         * Runnable多线程的用法
         */
//        TestRun runOne = new TestRun();
//        Thread run2Thre = new Thread(runOne);
//        run2Thre.start();
//
//       // TestRun runOne2 = new TestRun();
//        Thread run2Thre2 = new Thread(runOne);  //多个线程处理同一个资源的情况
//        run2Thre2.start();


        /**
         * 练习
         */
        int i = 0;
        Cat cat = new Cat();
        Thread tc = new Thread(cat);

        Dog dog = new Dog();
        Thread td = new Thread(dog);

        while (i < 4) {
            i++;
            System.out.println("main thread");
        }
        tc.setPriority(Thread.MAX_PRIORITY);
        td.setPriority(Thread.MIN_PRIORITY);
        tc.start();

//        try {
//            tc.sleep(1000);     //这种sleep的用法也可以
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        try {
//            tc.join();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        td.start();


        System.out.println(Thread.currentThread().getPriority());
        System.out.println(tc.getPriority());

        /**
         * 练习2
         */
//        Alphabet one_A = new Alphabet();
//        Thread th1 = new Thread(one_A);
//
//        th1.start();

    }


}
