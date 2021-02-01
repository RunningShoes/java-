package ServerAndClient;

import java.util.ArrayList;

public class Tickets {
    public int size;
    public int buyNum = 0;
    public int producerNum = 0;
//    boolean avaiable = false;
    public int avaiable = 0;

    int num=1;
    Character ch = 'a';

    public Tickets(int size) {
        this.size = size;
    }

    public synchronized void sell() {//卖方
        while (this.size - producerNum > 0) {
//            if(avaiable==true)
            if(avaiable!=0)
            {
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            producerNum=producerNum+2;
            System.out.print(Thread.currentThread().getName());
            System.out.println("Producer "+ producerNum+", total tickets remain " +(size- this.producerNum>0?size- this.producerNum:0) +" to produce");
//            avaiable = true;
            avaiable = 2;
            notify();

        }
    }
    public synchronized void buy() {
        while (this.size - buyNum > 0) {
            if(avaiable ==0){
                try {
                    wait();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                buyNum++;
                avaiable =avaiable-1;
                notify();
                System.out.print(Thread.currentThread().getName());
                System.out.println("Consume"+ buyNum+", already buy " + this.buyNum);
            }
        }
    }


    public static void main(String[] args) {
        Tickets one = new Tickets(3);
//        Con buy = new Con(one);
//        Pro sell = new Pro(one);
//
//        Thread buy1 = new Thread(buy, "buy");
//        Thread buy2 = new Thread(buy, "buy2");
//        Thread sell1 = new Thread(sell, "sell");
//
//        sell1.start();
//        buy1.start();
//        buy2.start();

        int [][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13}};
        int [] arr1 = {1,2,8,9};

        System.out.println(arr.length);
        System.out.println(arr[0].length);

        ArrayList<Integer> arrlist = new ArrayList();

    }

}

class Con implements Runnable {
    Tickets t;

    public Con(Tickets t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.buy();
        //System.out.print("Consumer:");
    }
}

class Pro implements Runnable {
    Tickets t;

    public Pro(Tickets t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.sell();
        //System.out.print("Producer:");
    }


}