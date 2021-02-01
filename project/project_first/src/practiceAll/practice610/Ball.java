package practiceAll.practice610;

public class Ball implements IBall {
    static final int X = 111;
    public void play() {
        System.out.println("匿名内部类：");
        System.out.println("Ball中的paly");
        System.out.println(X);
    }

    public void playBall(Ball ball) {
        ball.play();

    }

    //    public class Inner_m implements IBall {
    public class Inner_m {
        public void play() {
            System.out.println("**********************");
            System.out.println("成员内部类m");
            System.out.println("打篮球");
            System.out.println(X);
        }
    }

    public class Inner_n implements IBall {
        public void play() {
            System.out.println("**********************");
            System.out.println("成员内部类n");
            System.out.println("打篮球");
        }
    }

    public void info() {
        //方法内部类前面不可以加访问修饰符
        class Inner_f implements IBall {
            public void play() {
                System.out.println("**********************");
                System.out.println("方法内部类：");
                System.out.println("打乒乓球");
            }
        }
        IBall iball1 = new Inner_f();
        iball1.play();
    }

}
