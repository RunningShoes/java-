package learning.homeworkTwo;

public class Job {

    private String stringJobName;
    private String stringJobNum;

    public Job(){}
    public Job(String stringJobName,String stringJobNum)
    {
        this.setStringJobName(stringJobName);
        this.setStringJobNum(stringJobNum);
    }
    public Job(String stringJobName)
    {
        this.setStringJobName(stringJobName);
    }

    public String getStringJobName() {
        return stringJobName;
    }

    public void setStringJobName(String stringJobName) {
        this.stringJobName = stringJobName;
    }

    public String getStringJobNum() {
        return stringJobNum;
    }

    public void setStringJobNum(String stringJobNum) {
        this.stringJobNum = stringJobNum;
    }
}
