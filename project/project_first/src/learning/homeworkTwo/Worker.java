package learning.homeworkTwo;

public class Worker {
//    姓名、工号、年龄、性别、所属部门、职务信息
    private String stringWorkerName;
    private String stringWorkerNum;
    private int intWokerAge;
    private String stringWorkerSex;
    private String stringWorkerDepart;
    private Department departmentInfo = new Department();
    private Job jobInfo = new Job();

    public Worker() {}

    public Worker(String stringWorkerName, String stringWorkerNum, int intWorkerAge, String stringWorkerSex, String stringWorkerDepart,
                  String stringDepartNum,String stringDepartName, String stringJobName) {
        this.setStringWorkerName(stringWorkerName);
        this.setStringWorkerNum(stringWorkerNum);
        this.setIntWokerAge(intWorkerAge);
        this.setStringWorkerSex(stringWorkerSex);
        this.setStringWorkerDepart(stringWorkerDepart);
        this.setDepartmentInfo(stringDepartNum,stringDepartName);
        this.setJobInfo(stringJobName);
    }

    public String getStringWorkerName() {
        return stringWorkerName;
    }

    public void setStringWorkerName(String stringWorkerName) {
        this.stringWorkerName = stringWorkerName;
    }

    public String getStringWorkerNum() {
        return stringWorkerNum;
    }

    public void setStringWorkerNum(String stringWorkerNum) {
        this.stringWorkerNum = stringWorkerNum;
    }

    public int getIntWokerAge() {
        return intWokerAge;
    }

    public void setIntWokerAge(int intWorkerAge) {
        if(intWorkerAge>65 || intWorkerAge<18)
            intWorkerAge = 18;
        this.intWokerAge = intWorkerAge;
    }

    public String getStringWorkerSex() {
        return stringWorkerSex;
    }

    public void setStringWorkerSex(String stringWorkerSex) {
        if (!(stringWorkerSex.equals("男") || stringWorkerSex.equals("女")))
            stringWorkerSex = "男";
        this.stringWorkerSex = stringWorkerSex;
    }

    public String getStringWorkerDepart() {
        return stringWorkerDepart;
    }

    public void setStringWorkerDepart(String stringWorkerDepart) {
        this.stringWorkerDepart = stringWorkerDepart;
    }

    public Department getDepartmentInfo() {
        return departmentInfo;
    }

    public void setDepartmentInfo(String stringDepartNum,String StringDepartName) {
        //this.departmentInfo = new Department();
        this.departmentInfo.setStringDepartNum(stringDepartNum);
        this.departmentInfo.setStringDepartName(StringDepartName);
    }

    public Job getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(String stringJobName) {
        this.jobInfo = new Job(stringJobName);
    }

    public void showWorkerInfo(Worker worker)
    {
        System.out.println("姓名："+worker.getStringWorkerName());
        System.out.println("工号："+worker.getStringWorkerNum());
        System.out.println("性别："+worker.getStringWorkerSex());
        System.out.println("年龄："+worker.getIntWokerAge());
        System.out.println("职务："+worker.getDepartmentInfo().getStringDepartName()+worker.getJobInfo().getStringJobName());
        System.out.println("==============================");
    }
}
