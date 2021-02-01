package runoob;

public class NewThread {
    public static void main(String [] args) {
        Thread th1 = new Thread("haha");
        System.out.println(th1.getName());
        System.out.println(th1.getPriority());
        System.out.println(th1.getId());
        System.out.println(th1.isAlive());
        System.out.println(th1.getState());
        System.out.println("======");
        th1.start();
        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getThreadGroup());
        System.out.println(th1.isAlive());
        System.out.println(th1.getState());
        try
        {th1.wait(10000);
            System.out.println(th1.isAlive());
            System.out.println(th1.getState());
        }
        catch(Exception e){
            e.getMessage();
        }
        th1.stop();
        th1.interrupt();
        System.out.println(th1.isAlive());
        System.out.println(th1.getState());

        System.out.println(Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getThreadGroup());
    }
}
