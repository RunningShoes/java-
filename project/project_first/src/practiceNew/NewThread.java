package practiceNew;

public class NewThread extends Thread {
    private Thread t;
    private String threadName;
    public  static  int count = 0;

    public synchronized void increase(){
        count++;
    }

    public void  run() {
        System.out.println("Running:" + threadName);
        try {
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50);
                increase();
                System.out.println("count :" + count);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }



    public void start() {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }

    public NewThread(String name) {
        threadName = name;
        System.out.println("CreatringThread:" + threadName);
    }

    public static void main(String[] args) {
        NewThread nt1 = new NewThread("Thread1");
        nt1.start();
        NewThread nt2 = new NewThread("Thread2");
        nt2.start();

    }


}
