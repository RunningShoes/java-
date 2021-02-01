package com.company;

import com.sun.deploy.security.SelectableSecurityManager;
import sun.lwawt.macosx.CSystemTray;

import java.util.Scanner;

public class TestForOne {


    public static void main(String[] args) {

        int [] kk = {0,0,0,0,0,0,0,0,0,0};
        int kk1[] = new int[10];
        int [] kk2 = new int [10];
        for(int i=0;i<30;i++) {
            int number = (int) (Math.random() * 10);
            //System.out.println(number);
            if(i>=0&i<10)
            {
                kk[i] = number;
                System.out.println("kk[i] = "+kk[i]);
            }
            else if (i>=10 & i<20)
            {
                kk1[i-10]=number;
                System.out.println("kk1[i] = "+kk1[i-10]);
            }
            else if (i>=20 & i<30)
            {
                kk2[i-20]=number;
                System.out.println("kk2[i] = "+ kk2[i-20]);
            }
        }


        //testFunFib1();



    }
        /*
        Scanner s1 = new Scanner(System.in);
        int b = s1.nextInt();
        char ch = s1.next().charAt(0);
        System.out.print("字符串：\n");
        String str1 = s1.next();
          */
    public void testFunFib1()
    {
        /*打印全部的fib数列*/
        System.out.print("请输入一个数\n");
        Scanner s1 = new Scanner(System.in);
        int i = s1.nextInt();
        int count = 1;
        int count_pre1 = 1;
        int count_pre2 = 1;
        for (int temp = 1; temp <= i; temp++) {
            if (i == 1 | i == 2) {
                //System.out.print("aaaa\n");
                //System.out.println("count = " + count);

            } else {
                //System.out.print("bbbb\n");
                count = count_pre1 + count_pre2;
                count_pre2 = count_pre1;
                count_pre1 = count;
            }
        }
        System.out.println("count = "+count+'\n');
    }

    public void testFunFib2()
    {
        /*打印全部的fib数列*/
        System.out.println("请输入一个数字\n");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        long  count1 = 1l, count2 =1l,count3=1l;
        int i=1;
        while(num>=i)
        {
            if (i==1 | i==2 )
            {
                System.out.println("count = "+count1);
            }
            else
            {
                count3 = count2 + count1;
                count1 = count2;
                count2 = count3;
                System.out.println("count = "+count3);
            }
            ++i;
        }
    }

    public int maxNumber(int [] arr)
    {
        int max = -1;
        if(arr.length==0)
        {
            System.out.println("有问题存在");
            return max;
        }else
        {
            max = arr[0];
            int i = 0;
            while(i<arr.length)
            {
                if(arr[i]>=max)
                {
                    max = arr[i];
                }
                i++;
            }
        }
        return max;
    }
}
