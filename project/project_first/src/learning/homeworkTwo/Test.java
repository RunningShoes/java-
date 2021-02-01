package learning.homeworkTwo;

public class Test {
    public static void main(String [] args)
    {

        Job job1 = new Job("经理","P0001");
        Job job2 = new Job("助理","P0002");
        Job job3 = new Job("职员","P0003");

        Worker workerArray[] = new Worker[20];
        workerArray[0] = new Worker("张鸣","S001",29,"男","人事部",
                                    "P0001","人事部","经理");
        workerArray[1] = new Worker("李艾爱","S002",21,"女","人事部",
                                    "P0002","人事部","助理");
        workerArray[2] = new Worker("孙超","S003",29,"男","人事部",
                                    "P0003","人事部","职员");
        workerArray[3] = new Worker("张妹妹","S004",29,"女","市场部",
                                    "P0003","市场部","职员");
        workerArray[4] = new Worker("蓝迪","S005",37,"男","市场部",
                                    "P0001","市场部","经理");
        workerArray[5] = new Worker("米粒","S006",24,"女","市场部",
                                    "P0003","市场部","职员");
        workerArray[6] = new Worker("米粒1","S006",24,"女","市场部",
                "P0003","市场部","职员");
        workerArray[7] = new Worker("米粒1","S006",24,"女","市场部",
                "P0003","市场部","职员");

//         public Department(String stringDepartNum,String stringDepartName,Worker [] workerArray,String [] stringWorkArray)
        Department departmentOne = new Department("D0001","人事部",workerArray);
        Department departmentTwo = new Department("D0002","市场部",workerArray);

        for(int i=0;i< workerArray.length;i++)
        {
            if(workerArray[i]!=null)
                workerArray[i].showWorkerInfo(workerArray[i]);

        }

        departmentOne.showDepartNum();
        departmentTwo.showDepartNum();




    }

}

