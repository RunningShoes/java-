package practiceAll.Practice223;

public class ElectricVehicle extends Motor{

    public String chargeName;

    public ElectricVehicle(){
        this.name = "电动车";
    }

    public ElectricVehicle(String chargeName)
    {
        this.name = "电动车";
        this.chargeName = chargeName;
    }

    public void show()
    {
        System.out.println("这是一辆"+this.chargeName+"牌的" + this.name);
    }
}
