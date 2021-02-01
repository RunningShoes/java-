package practiceAll.Practice223;

public class Motor {
    public String brand;
    public String Color;
    public int wheelNum;
    public int chairNum;
    public String name;

    public Motor()
    {
        this.wheelNum = 2;
        this.chairNum = 1;
        this.name = "非机动车";
    }

    public Motor(String brand,String Color){
        this.brand = brand;
        this.Color = Color;
        this.wheelNum = 2;
        this.chairNum = 1;
        this.name = "非机动车";
    }

    public void show(){
        System.out.println("这是一辆"+this.Color+"的，"+this.brand+"的"+this.name+",有"+this.wheelNum+"个轮子，" +
                "有"+this.chairNum+"个座椅");
    }

}
