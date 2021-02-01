package com.company;

import java.util.Scanner;

public class HomeWorkOne {
    /**
     * @author:qlh
     * @functional:homework
     * @param args
     */
    public static void main(String [] args)
    {
        float score[] = new float [100];
        int num = 100;
        float mean = 0.0f;

        HomeWorkOne One = new HomeWorkOne();
        One.printStart();
        while(true)
        {
            System.out.println("请输入对应的数字进行操作：");
            Scanner s = new Scanner(System.in);
            try
            {
                num = s.nextInt();
            }catch (java.util.InputMismatchException e)
            {
                System.out.println("请重新输入参数：");
            }

            if(num==0)
            {
                System.out.println("退出程序\n");
                break;
            }
            switch (num) {
                case 1:
//                    One.scoreInit(score);
                    score = One.scoreInit();
                    break;
                case 2:
                    One.scoreMean(score);
                    break;
                case 3:
                    One.countMoreThan85(score);
                    break;
                case 4:
                    One.modifyByIndex(score);
                    break;
                case 5:
                    One.scoreDisplay(score);
                    break;
                default:
                    System.out.println("输入数字错误");
            }
        }

    }

    public void printStart()
    {
        System.out.println("****************************************");
        System.out.println("     1--初始化数学成绩");
        System.out.println("     2--求成绩的平均值");
        System.out.println("     3--统计成绩大于85分的人数");
        System.out.println("     4--修改指定位置处的成绩");
        System.out.println("     5--打印输出全部成绩");
        System.out.println("     0--退出");
        System.out.println("****************************************");

    }



//    public void scoreInit(float score []) {
//        int length = 0;
//        System.out.println("请输入需要存储的成绩个数：\n");
//        Scanner s = new Scanner(System.in);
//        length = s.nextInt();
//        float score1 [];
//
//        if(length <=0)
//        {
//            System.out.println("输入成绩个数错误。\n");
//            return
//        }
//        float score1 [] = new float [length];
//
//        for (int i = 0; i < length; i++)
//        {
//            System.out.println("请输入第"+(i+1)+"个数据：");
//            Scanner s1 = new Scanner(System.in);
//            if (s1.nextFloat()>=0.0)
//                score[i] = s1.nextFloat();
//            else
//            {
//                System.out.println("输入成绩有问题，请重新输入：");
//                i--;
//            }
//        }
//    }


    public float[] scoreInit() {
        int length = 0;
        System.out.println("请输入需要存储的成绩个数：");
        Scanner s = new Scanner(System.in);
        length = s.nextInt();
        float score [] ;

//        if(length <=0)
//        {
//            System.out.println("输入成绩个数错误。\n");
//            return score1;
//        }
        score  = new float [length];
        for (int i = 0; i < length; i++)
        {
            System.out.println("请输入第"+(i+1)+"个数据：");
            score[i] = s.nextFloat();
            if (score[i]>=0.0)
                ;
            else
            {
                System.out.println("输入成绩有问题，请重新输入：");
                i--;
            }
        }
        return score;
    }

    public void scoreMean(float arr [])
    {
        float mean = 0.0f;
        float sum = 0.0f;
        for(int i=0;i<arr.length;i++)
            sum+=arr[i];
        mean = sum / arr.length;

        System.out.println("数学平均成绩为"+mean+"分");
    }

    public void countMoreThan85(float arr [])
    {
        int num = 0;
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > 85.0)
                num += 1;
        }
        System.out.println("成绩大于85分的人数为"+num);
    }

    public void modifyByIndex(float arr [])
    {
        System.out.println("修改前：");
        scoreDisplay(arr);

        System.out.println("请输入要修改的成绩的位置：");
        int num = 0;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        if( num<0 || num>=arr.length) {
            System.out.println("输入的位置有问题");
            return ;
        }

        System.out.println("请输入新的数据：");
        float newScore = 0.0f;
        newScore = s.nextFloat();
        if (newScore<0.0) {
            System.out.println("输入的新数据不正确");
            return ;
        }
        else
            arr[num] = newScore;

        System.out.println("修改后");
        scoreDisplay(arr);

    }


    public void scoreDisplay(float arr [])
    {
        int length = arr.length;
        System.out.println("成绩为：");
        for(int i=0;i<length;i++)
        {
            System.out.print(arr[i] + "   ");
        }
        System.out.println();
    }

}
