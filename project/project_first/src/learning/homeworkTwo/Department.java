package learning.homeworkTwo;

public class Department {
    /**
     *        提示：部门类的属性有四个，分别是部门编号，部门名称，员工数组 和 统计变量 ，
     *
     *                  具体是市场部还是人事部，是通过部门类的对象来表示的，如果是市场部的对象，
     *
     *                  那么添加并统计的就是市场部的人数，同样如果是人事部的对象，
     *
     *                  添加并统计的就是人事部的人数
     */
    private String stringDepartNum ;
    private String stringDepartName;
    private String stringWorkArray [];
    private int intWorkerCountNum ;
    

    public Department() {}
    public Department(String stringDepartNum,String stringDepartName,Worker [] workerArray)
    {
        this.setStringDepartNum(stringDepartNum);
        this.setStringDepartName(stringDepartName);
        this.setStringWorkArray(workerArray,stringDepartName);
        this.setIntWorkerCountNum(stringWorkArray);
    }

    public Department(String stringDepartNum,String stringDepartName)
    {
        setStringDepartName(stringDepartNum);
    }

    public String getStringDepartNum() {
        return stringDepartNum;
    }

    public void setStringDepartNum(String stringDepartNum) {
        this.stringDepartNum = stringDepartNum;
    }

    public String getStringDepartName() {
        return stringDepartName;
    }

    public void setStringDepartName(String stringDepartName) {
        this.stringDepartName = stringDepartName;
    }

    public String[] getStringWorkArray() {
        return stringWorkArray;
    }


    public void setStringWorkArray(Worker [] workerArray,String stringDepartName) {
        if(workerArray.length == 0)
        {
            System.out.println("部门没有员工存在");
            return ;
        }
        else
        {
            stringWorkArray = new String[20];
            int j =0 ;
            for(int i=0;i<workerArray.length;i++)
            {
                if(workerArray[i]!=null && workerArray[i].getStringWorkerDepart().equals(stringDepartName))
                {
                    this.stringWorkArray[j] = workerArray[i].getStringWorkerName();
                    j++;
                }
            }
        }
        this.stringWorkArray = stringWorkArray;
    }

    public int getIntWorkerCountNum() {
        return intWorkerCountNum;
    }

    public void setIntWorkerCountNum(String [] stringWorkArray) {
        for(int i =0; i<stringWorkArray.length;i++)
        {
            if (stringWorkArray[i] == null) {
                this.intWorkerCountNum = i;
                break;
            }
        }
    }

    public void showDepartNum()
    {
        System.out.println(this.getStringDepartName()+"总共有"+this.getIntWorkerCountNum()+"名员工");
    }
}
