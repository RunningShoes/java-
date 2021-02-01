package HomeWork;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        Score one = new Score();
//        int input = 100;
//        int input1 =111 ;

        // one.funRun();
//        Scanner sc =new Scanner(System.in);
//
//        int [] arr = {1,2,3,4,5,6,7,8,9,10};
//        int arr1[]=new int [10];
//        for (int i:arr)
//        {
//            arr1[i-1] = sc.nextInt();
//
//            System.out.println("arr1["+(i-1)+"]:"+arr1[i-1]);
//        }


//        int number=0;
//        Scanner input=new Scanner(System.in);
//        while(true){
//            if(input.hasNextInt()){
//                System.out.println("判断之后");
//                number=input.nextInt();
//                System.out.println("number = "+ number);
//            }else{
////                String s = input.nextLine();
//                String s = input.next();
//                System.out.println("输入不合法，当前行内容是 "+s);
//                System.out.println("请输入数字");
//            }
//        }


        int temp = 0;
        RankAlgorithm rank = new RankAlgorithm();


//        int [] arr = {10,2,33,47,6,3,-5,-7,1,8};
        int[] arr = {-10, 2, 33, 47, 6, 3, -5, -7, 1, 8};

        for (int i : arr)
            System.out.print(i + " ");


//        int [] arr1={1 ,-7 ,-5 ,2 ,3 ,-44,44,3,54,-32,4,54,66,-2,4,-7,-7,-44};
//        rank.bubleRank(arr,arr.length);
//        rank.selectRank(arr,arr.length);
//        rank.insertRank(arr,arr.length);
//        rank.shellRank(arr,arr.length);
        rank.quickRank(arr, arr.length);


        /**
         * 测试包装类
         */
        Float f1 = new Float(5.5);
        Integer intOne = 5;
        Integer intTwo = 5;
        System.out.println(f1);

        if (intOne.equals(5))
            System.out.println("ha");

        System.out.println(intOne.toString());


        System.out.println((int) (Math.random() * 1000));
//
//        String str1 = "hello world";
//        String str2 = new String("hello world");
//        String str3 = "hello world";
//        String str4 = new String("hello world");
//        System.out.println(str1==str2);
//        System.out.println(str1==str3);
//        System.out.println(str2==str4);


        int array[] = new int[5];
//        Arrays.fill(arr,10);
        Arrays.sort(arr);

        for (int i : arr)
            System.out.println(i);

        arr = Arrays.copyOf(arr, arr.length + 4);
        Arrays.sort(arr);
        int k = arr.length;
////        Arrays.fill(arr,k,k+3,100);

        System.out.println("长度：" + arr.length);
        Arrays.fill(arr, 10, 13, 100);
        for (int i : arr)
            System.out.print(i + " ");

//        Date date = new Date();
//        System.out.println(date.getTime());
//        System.out.println(date.toString());
//
//        System.out.printf("全部日期和时间信息：%tc%n", date);
//        f的使用

//
//        //d的使用
//        System.out.printf("月/日/年格式：%tD%n", date);
//        //r的使用
//        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n", date);
//        //t的使用
//        System.out.printf("HH:MM:SS格式（24时制）：%tT%n", date);
//        //R的使用
//        System.out.printf("HH:MM格式（24时制）：%tR", date);

        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]: " + args[i]);
        }

        System.out.println();
        Integer t100 = new Integer(100);
        System.out.println(t100);

        int tt = t100;
        System.out.println(tt);

        double td = t100.doubleValue();
        System.out.println(td);

        Integer tttt = new Integer(1234);
        String str = Integer.toString(tttt);
        int str2int = Integer.parseInt(str);

        System.out.println(str2int);
        System.out.println(str);



    }



}
