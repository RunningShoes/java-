package com.company;

public class ClassForBase {
    /**
     * java基础学习相关
     * @param arr,arr
     * author qlh
     * @version 1.0
     */
    public static void rankFun(int arr [])
    {
        int length = arr.length;
        int min = 0;
        int temp = 0;

        ClassForBase asd = new ClassForBase();
        asd.printStar();

        for(int i=0;i<length;i++)
        {

            for (int j=i+1;j<length;j++)
            {
                if(arr[j]<arr[i])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void fun_test(){

        System.out.println("fun_test");
        TestForOne one = new TestForOne();
        //one.testFunFib1();
        //one.testFunFib2();

        int ArrayInt [][];
        int att [][] = new int [3][] ;
        att[0] = new int [4];
        att[1] = new int [4];
        att[2] = new int [4];

        ArrayInt = new int[3][4];

        //int arr [] = new int[10];
       int arr[] = {12,21,1,14,35,6,17,8,92,10};

       ClassForBase.rankFun(arr);
       long aa = ClassForBase.fac(40);
       System.out.println("fac : "+aa);

       ClassForBase.mutiParameter(1000,arr);

//       for(int n:arr) {
//           System.out.println(n);
//       }
//
//
//       System.out.println(one.maxNumber(arr));
    }

    public void printStarTest()
    {
        System.out.println("*********1234*******");
    }
    public void printStar()
    {
        printStarTest();
        System.out.println("****************");
    }

    public static void mutiParameter(int a,int ...n)
    {
        System.out.print(a);
        System.out.println();
        for(int kk:n)
        {
            System.out.println(kk);
        }
    }

    public static long fac(int n)
    {
        long total = 1l;
        long sum = 0l;
        for (int i=1;i<=n;i++)
        {
            total=1;
            for (int j =1;j<=i;j++)
            {
                total *= j;
            }
            sum = total +sum;
        }
        System.out.println(sum);
        return sum;
    }

}
