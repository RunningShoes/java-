package practiceAll.practice610;

public class Test610 {

    public static void main(String [] args){

        IBall iball1 = new Ball();

        iball1.play();


        //成员内部类
        IBall iball2 = new Ball();
        Ball.Inner_m Inner_m1 = new Ball().new Inner_m();
        Inner_m1.play();
        Ball ball_m = new Ball();


        //带继承接口的成员内部类
        IBall iball3 = new Ball().new Inner_n();
        iball3.play();
        //若不用接口访问
//        方法1：
        Ball.Inner_n Inner_n1 = new Ball().new Inner_n();
        Ball ball_n = new Ball();
        ball_n.play();

        Ball ball_n2 = new Ball();
        Ball.Inner_n Inner_n2 = new Ball().new Inner_n();
        Inner_n2 = ball_n2.new Inner_n();
        Inner_n2.play();


        //方法内部类

        Ball ball_method = new Ball();
        ball_method.info();

        //匿名内部类
        Ball ball_kk = new Ball();
        ball_kk.playBall(new Ball(){
            public void play(){
                System.out.println("打排球");
            }
            public void ppp(){
                System.out.println("1234");
            }
        });


    }
}
