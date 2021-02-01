package practiceAll.Practice223;

public class Bicycle extends Motor{

    public Bicycle()
    {
        this.name = "自行车";
    }

    public Bicycle(String brand,String Color,int wheelNum,int chairNum)
    {
        super(brand,Color);
        this.name = "自行车";
        this.wheelNum = wheelNum;
        this.chairNum = chairNum;
    }


    public String toString(Object obj)
    {
        if(obj == null) {
//            obj = new Bicycle("捷安特xxxx", "黄色xxx", 1111, 1111);
            return "hhh";
        }
        System.out.println("haha");
        this.show();

        return this.Color;
    }

}
