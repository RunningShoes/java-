package practiceNew;

import java.util.Scanner;

public class test {

    public int i=1;
    public test() {
    }

    Integer intTemp = new Integer(10);


    public static void main(String [] args){
        /*
        内部类相关
         */
//        test one = new test();
//        one.fun1();
//        System.out.println(args.length);
//        test.Yahaha oneY=one.new Yahaha(2,2.2);
//        oneY.show();
//        System.out.println(one.intTemp);
//        test.Yahaha twoY = new test().new Yahaha(1,3.2);
//
//        one.showYahaha(twoY);
//
//        short a=100;
//        short b=100;
//        System.out.println(one instanceof test);


        /*
        继承与多台
         */
//        ExtendsTest one = new ExtendsTest(123,"123",456,"456");
//        one.fun1();
        NewClass two = new ExtendsTest(0,"123",100,"str2");
        two.fun1();

        int pp = 0;
        pp=Math.abs(-3);
//        ExtendsTest three = (ExtendsTest) two;
//        three.fun1();

    }

    public void fun1(){
        System.out.println("good");
    }

    public void fac(){
        int arr[]=new int[100];

    }

    public class Yahaha{
        public int keluoluo;
        private double num = 0.0;

        public Yahaha() {
        }

        public Yahaha(int keluoluo, double num) {
            this.keluoluo = keluoluo;
            this.num = num;
        }

        public double getNum() {
            return num;
        }

        public void setNum(double num) {
            this.num = num;
        }
        public void show(){
            test test1=new test();
            System.out.println("类内部类");
            System.out.println(test1.i);
            test.this.fun1();

        }
    }

    public void showYahaha(Yahaha one){
         class ShowYahaha{
            public void fun11(Yahaha one){
                System.out.println(one.keluoluo+"asdasdadad"+one.num);
            }

        }
        ShowYahaha oneS = new ShowYahaha();
         oneS.fun11(one);
    }

}

class NewClass {
    public int a = 0;
    private String str1 = "Newclass";

    public NewClass() {
    }

    public NewClass(int a, String str1) {
        this.a = a;
        this.str1 = str1;
    }

    public void fun1(){
        System.out.println(str1);
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }
}

class NewClass2{

}

class ExtendsTest extends NewClass{

    public int b = 100;
    private String str2 = "str";

    public ExtendsTest() {
    }

    public ExtendsTest(int a, String str1, int b, String str2) {
        super(a, str1);
        this.b = b;
        this.str2 = str2;
    }

    public void fun1(){

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入受as：");
        try{
            a=sc.nextInt();
        }catch (Exception e){
            System.out.println("请重新输入：");
            sc.next();
        }
        System.out.println("请输入受b：");
        try{
            b=sc.nextInt();
        }catch (Exception e){
            System.out.println("请重新输入：");
            sc.next();
        }

        System.out.println(this.b);
        System.out.println(super.a);
    }
}

