package com.company;

import sun.lwawt.macosx.CSystemTray;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        System.out.println("helo word\n");
        int a = 0x1234af;
        float pp = 1.23f;
        long ll = 100;
        boolean b1 = false;
        int b =3;
        double d1 = 1.23e5;

        String str2 = "\u005d\u005fABDF";
        System.out.println(str2);
        char ch = (char)65536;
        final int MAX_VALUE = 44;
        String str1 = "string";
        System.out.println(a);
        System.out.println(pp);
        System.out.println(str1);
        System.out.println(ll);
        System.out.println(d1);
        System.out.println(ch);
        if (b1 == true)
            ClassForBase.fun_test();
        else
            System.out.println("good");
    */
        /*
        int n=98;
        //定义一个char类型的变量ch，将变量n赋值给ch，然后输出ch的值
        char ch= (char)n;
        System.out.println("ch="+ch);
        System.out.println();
        long var=190000000;
        System.out.println("var="+var);
        System.out.println();
        //定义一个长整型变量var，值为190000000，并输出
        double d=var;
        System.out.println("d="+d);
        //定义一个double类型的变量d，将变量var的值赋值给d*/


        float a = 4.5f;
        int a1 =3;
        System.out.println(a/a1);
        System.out.println((double)(a/a1));
        System.out.println(((int)a)/a1);

        System.out.println(13/5.0);


        ClassForBase one = new ClassForBase();
        ClassForBase.fun_test();


    }
}
