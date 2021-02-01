package HomeWork;

/**
 *
 */
public class RankAlgorithm {

    public void bubleRank(int [] arr,int num)
    {
        /**
         * @冒泡排序重点：
         * 1.两个循环
         * 2.内循环找数组中最大的数并放到最后，外循环重复多次找最大的数
         */
        int temp = 0;

        System.out.print("arr before: ");
        for(int i:arr)
        {

            System.out.print(i + " ");
        }

        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println();
        System.out.print("arr after: ");
        for(int i:arr)
        {

            System.out.print(i + " ");
        }
    }

    public void selectRank(int  [] arr,int num)
    {
        /**
         * @选择排序和冒泡排序相似，找最小值放到第一位
         */
        int temp = 0;

        System.out.print("arr before: ");
        for(int i:arr)
        {
            System.out.print(i + " ");
        }

//        for (int i=0;i<arr.length;i++)
//        {
//            int min = arr[i];
//            for(int j=i+1;j<arr.length;j++)
//            {
//                if(arr[j]<arr[i])
//                {
//                    temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;
//                }
//            }
//        }
/*
从小到大
// */
//        for(int i=0;i<arr.length;i++)
//        {
//            int minIndex = i;
//            for(int j=i+1;j<arr.length;j++)
//            {
//                if (arr[j]<arr[minIndex])
//                {
//                    minIndex = j;
//                }
//            }
//            if(minIndex!=i)
//            {
//                temp = arr[i];
//                arr[i] = arr[minIndex];
//                arr[minIndex] = temp;
//            }
//        }
/*
从大到小
 */
        for(int i=arr.length-1;i>=0;i--)
        {
            int minIndex = i;
            for(int j=0;j<i;j++)
            {
                if (arr[j]<arr[minIndex])
                {
                    minIndex = j;
                }
            }
            if(minIndex!=i)
            {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

        System.out.println();
        System.out.print("arr after: ");
        for(int i:arr)
        {
            System.out.print(i + " ");
        }
    }

    /**
     * 快速排序
     * @param arr
     * @param num
     */
    public void quickRank(int  [] arr,int num)   //非递归排序
    {
        int temp = 0;

        System.out.print("arr before: ");
        for(int i:arr)
        {
            System.out.print(i + " ");
        }
        quickRank2(arr,0,num-1);

        System.out.println();
        System.out.print("arr after: ");
        for(int i:arr)
        {
            System.out.print(i + " ");
        }
    }


    /**
     * 基准值选取方法：quiackRank2为三分法，quickRank3为随机法
     */
    public void quickRank2(int  [] a,int l,int r)
    {
        if(l>=r)
            return;

        int i = l ;
        int j = r;
//        int key = (l+r)/2;
        int key = l;
        int value = a[key];
        int temp = 0;

        while(i<j)
        {
           while(i<j && a[j]>value)
               j--;
           if(i<j)
           {
               a[i] = a[j];
               i++;
           }

           while(i<j && a[i]<value)
               i++;
           if(i<j)
           {
               a[j] = a[i];
               j--;
           }

        }

        a[i] = value;
        key=i;
        quickRank2(a,l,key-1);
        quickRank2(a,key+1,r);

    }



    /**
     * 希尔排序：先分组，每一组进行插入排序；改变组别大小再分组再进行插入排序即可
     * @param arr
     * @param num
     */
    public void shellRank(int  [] arr,int num)
    {
        int temp = 0;

        System.out.print("arr before: ");
        for(int i:arr)
        {
            System.out.print(i + " ");
        }

        int gap = num/2;
        for(;gap>0;gap/=2)
        {
//            for(int i = 0;i<num-gap;i++)
//            {
//                int j = i;
//                while(j<num-gap)
//                {
//                    if(arr[j]>arr[j+gap])
//                    {
//                        arr[j] = arr[j]+arr[j+gap];
//                        arr[j+gap] = arr[j] - arr[j+gap];
//                        arr[j] = arr[j] -arr[j+gap];
//                    }
//                    j+=gap;
//                }
//            }
            for(int k= 0;k<gap;k++)    //每个子序列起始值是a[k]
            {
                for(int i=k;i<arr.length;i+=gap)
                {
                    for(int j=i;j>k;j-=gap)
                    {
                        if(arr[j]<arr[j-gap]){
                            temp = arr[j-gap];
                            arr[j-gap] = arr[j];
                            arr[j] = temp;
                        }else
                            break;
                    }
                }
            }
            if(gap == 1)
                break;
        }

        System.out.println();
        System.out.print("arr after: ");
        for(int i:arr)
        {
            System.out.print(i + " ");
        }
    }

    /**
     *
     * @param arr
     * @param num
     * 插入排序，如同整理牌面一样
     */
    public void insertRank(int  [] arr,int num)
    {
        int temp = 0;

        System.out.print("arr before: ");
        for(int i:arr)
        {
            System.out.print(i + " ");
        }

        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1; j>0; j--)      //类比于发牌,内层循环用于新摸到手的牌同已经有的牌进行对比
            {
                if(arr[j]<arr[j-1])
                {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }else{
                    break;
                }
            }
        }

        System.out.println();
        System.out.print("arr after: ");
        for(int i:arr)
        {
            System.out.print(i + " ");
        }
    }


    public void mergeRank(int [] arr,int num)
    {

    }
}


