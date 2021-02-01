package practiceAll.homework72;


import java.util.Scanner;

public class TestHw72 {

    public TestHw72() {
    }

    public void printMessage() {
        System.out.println("*************欢迎来到太阳马戏团************");
        System.out.println("*************   请选择表演者   ***********");
        System.out.println("*************     1.棕熊     ***********");
        System.out.println("*************     2.狮子     ***********");
        System.out.println("*************     3.猴子     ***********");
        System.out.println("*************     4.鹦鹉     ***********");
        System.out.println("*************     5.小丑     ***********");
    }

    public int numGet() {
        int input = 0;
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag == true) {
            try {
                input = sc.nextInt();
                flag=false;
            } catch (Exception e) {
                sc.next();
                System.out.println("输入错误,请输入数字");
            }
        }
        return input;
    }

    public static void main(String[] args) {

        TestHw72 one = new TestHw72();
        int input = 100;
        while (input > 0) {
            one.printMessage();
            input = one.numGet();

            switch (input) {
                case 0:
                    input = 0;
                    break;
                case 1:
                    Bear bear = new Bear("Bill", 1);
                    bear.act();
                    break;
                case 2:
                    Lion lion = new Lion("Lain", 2, "灰色", "公狮");
                    lion.act();
                    break;
                case 3:
                    Monkey monkey = new Monkey("Tom", 1, "金丝猴");
                    monkey.act();
                    break;
                case 4:
                    Parrot parrot = new Parrot("Rose", 1, "牡丹玫瑰");
                    parrot.act();
                    break;
                case 5:
                    Clown clown = new Clown("kahle", 5);
                    clown.act();
                    break;
                default:
                    System.out.println("请输入数字范围：0-5");
                    break;

            }
            if(input ==0)
                break;
            System.out.println("*************是否继续观看(1/0)***********");
            input = one.numGet();
            while(input!=0 &&input!=1) {

                System.out.println("请输入0：不在观看，1：观看");
                input = one.numGet();
            }
        }
    }
}



