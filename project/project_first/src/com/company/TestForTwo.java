package com.company;

public class TestForTwo {
    public static void main (String [] args)
    {
        int num = 10;
        int [] result = new int [num];

        int rankArray[] = {100,-20,30,4,3,55,2,-34,3,42};

//        fib111(num);
        rank(rankArray,num);
    }

    public static void rank(int [] array,int num)
    {
        int temp = 0;

        for (int i=0;i<num;i++)
        {
            for (int j=i;j<num;j++)
            {
                if(array[i]>array[j])
                {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }

        for (int kk:array)
        {
            System.out.println(kk);
        }
    }

    public static void fib111(int num)
    {
        int [] result = new int [num];

        for(int i=0;i<num;i++)
        {
            result[i] = 0;
        }

        if(num == 1)
        {
            result[0] = 1;;
        }
        else if(num==1)
        {
            result[0] = 1;
            result[1] = 1;
        }
        else
        {
            result[0] = 1;
            result[1] = 1;
            for(int j=2;j<num;j++)
            {
                result[j] = result[j-1] + result[j-2];
            }
        }

        for (int j=0;j< result.length;j++)
        {
            System.out.println(result[j]);
        }
    }

//    public int [] fib2(int num)
//    {
//
//    }
}
