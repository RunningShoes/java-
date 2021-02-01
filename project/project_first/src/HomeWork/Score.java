package HomeWork;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Score {

    final int INTARRAYLENGTH = 11;
    int intArrayScore[] = new int[INTARRAYLENGTH];

    /*
    输入界面
     */
    public void InputPagePring()
    {
        System.out.println("**********************************************");
        System.out.println("      1--初始化数学成绩");
        System.out.println("      2--求成绩平均值");
        System.out.println("      3--统计成绩大于85的人数");
        System.out.println("      4--修改指定位置处的成绩");
        System.out.println("      5--打印输出");
        System.out.println("      0--退出");
        System.out.println("**********************************************");

    }

    /*
    保留一位小数
     */
    public double scale(Double doubleValue)
    {
        DecimalFormat format = new DecimalFormat("#.0");
        String scaled = format.format(doubleValue);
        return Double.parseDouble(scaled);
    }

    /*
    1--成绩初始化
     */
    public void ScoreInput()
    {
        int num = 0;
        int flag = 0;
        System.out.println("请输入要存储的数学成绩的数量：");
        Scanner sc = new Scanner(System.in);

        try {
            num = sc.nextInt();
        }catch (Exception e)
        {
            System.out.println("输入错误：");
            return;
        }

        if(num<=0 || num>this.INTARRAYLENGTH-1)
        {
            System.out.println("存储的学生成绩数需要大于0");
            return;
        }

        this.intArrayScore[INTARRAYLENGTH-1] = num;

        for(int i=0;i<num;i++)
        {
            //Scanner sc1 = new Scanner(System.in);
            flag =0 ;
            System.out.println("请输入第"+(i+1)+"个成绩：");
            try {
                this.intArrayScore[i] = sc.nextInt();
            }catch (Exception e)
            {
                sc.next();
                System.out.println("输入不是数字：");
                flag = 1;
            }

            while(flag ==1)
            {
                //Scanner sc2 = new Scanner(System.in);
                flag =0 ;
                System.out.println("请输入第"+(i+1)+"个成绩：");
                try {
                    this.intArrayScore[i] = sc.nextInt();
                }catch (Exception e)
                {
                    sc.next();
                    System.out.println("输入不是数字：");
                    flag = 1;
                }
            }

            while(this.intArrayScore[i] <0 || this.intArrayScore[i]>100)
            {
                System.out.println("成绩不能小于0");
                System.out.println("请输入第"+(i+1)+"个数字：");
                this.intArrayScore[i] = sc.nextInt();
            }
        }
    }
    /*
    2--成绩平均值
     */
    public void ScoreMean()
    {
        int sum = 0;
        double mean = 0.0d;

        if(intArrayScore[INTARRAYLENGTH-1] == 0)
        {
            System.out.println("成绩数组未初始化");
            return;
        }

        for(int i=0;i<intArrayScore[INTARRAYLENGTH-1] ;i++)
        {
            sum += intArrayScore[i];
        }

        mean = (double)((sum)/(intArrayScore[INTARRAYLENGTH-1]));

        System.out.println("平均成绩是"+this.scale(mean));

    }


    /*
    3--统计大于85分的人数
     */

    public void CountNum()
    {
        int sum = 0;

        if(this.intArrayScore[INTARRAYLENGTH-1] == 0)
        {
            System.out.println("成绩数组未初始化");
            return;
        }


        for(int i=0;i<this.intArrayScore[INTARRAYLENGTH-1] ;i++)
        {
            if(this.intArrayScore[i]>=85)
            sum += 1;
        }

        System.out.println("成绩大于85的人数是："+sum);

    }

    /*
    4.修改制定位置的成绩
     */
    public int inputGet(int judgeNum)
    {
        int num = 0;
        int flag = 0;

        Scanner sc = new Scanner(System.in);
        /*输入类型检查*/
        try{
            num = sc.nextInt();
        }catch(Exception e)
        {
            flag = 1;
            System.out.println("输入数字类型不对，请重新输入");
        }

        while(flag == 1)
        {
            flag = 0;
            Scanner sc1 = new Scanner(System.in);
            try{
                num = sc1.nextInt();
            }catch(Exception e)
            {
                flag = 1;
                System.out.println("输入数字有类型不对，请重新输入");
            }

            if((flag == 0) && (num<0 || num> INTARRAYLENGTH-1)&&(judgeNum==0)) /*输入位置范围*/
            {
                System.out.println("数字输入超出范围(0-个数-1)");
                flag = 1;
            }
            else if((flag == 0) && (num<0 || num>100) && (judgeNum==1)) //输入成绩检查
            {
                System.out.println("数字输入超出范围(0-100)");
                flag = 1;
            }else if((flag == 0) && (num>5 || num<0) && (judgeNum==3))   //输入编号检查
            {
                System.out.println("数字输入超出范围(0-5)");
                flag  = 1;
            }
        }

      return num;

    }

    public void modifyScore()
    {
        int num = 0;
        int score = 0;
        int flag = 0;

        if(this.intArrayScore[INTARRAYLENGTH-1]==0)
        {
            System.out.println("成绩数组没有初始化");
            return;
        }
        System.out.println("修改前：");
        this.scorePrint();
        System.out.println("请输入要修改数据的位置（从0开始）");
        num = this.inputGet(0);
        System.out.println("请输入要修改的成绩：");
        score = this.inputGet(1);

        this.intArrayScore[num] = score;
        System.out.println("修改后：");

        for (int i=0;i<INTARRAYLENGTH-1;i++)
        {
            System.out.print(intArrayScore[i]+"  ");
        }
    }


    /*5--打印全部成绩*/
    public void scorePrint()
    {
        if(this.intArrayScore[INTARRAYLENGTH-1]==0)
        {
            System.out.println("成绩数组没有初始化");
            return;
        }
        System.out.println("成绩为：");
        for (int i=0;i<this.intArrayScore[INTARRAYLENGTH-1];i++)
        {
            System.out.print(this.intArrayScore[i]+"  ");
        }
        System.out.println();
    }

    public void funRun()
    {
        int input;
        this.InputPagePring();
        System.out.println("请输入对应的数字进行操作：");
        input = this.inputGet(3);
        while(input!=0)
        {
            switch (input)
            {
                case 1:
                    this.ScoreInput();
                    break;
                case 2:
                    this.ScoreMean();
                    break;
                case 3:
                    this.CountNum();
                    break;
                case 4:
                    this.modifyScore();
                    break;
                case 5:
                    this.scorePrint();
                    break;
                default:
                    System.out.println("请重新输入数字");
            }
            this.InputPagePring();
            System.out.println("请输入对应的数字进行操作：");
            input =  this.inputGet(3);
        }
        System.out.println("退出程序");
    }
}
