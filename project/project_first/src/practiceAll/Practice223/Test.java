package practiceAll.Practice223;

public class Test {

    public static void main(String [] args)
    {
        Motor one =new Motor("天宇","红颜色");
        Bicycle two= new Bicycle("捷安特","黄色",2,1);
        ElectricVehicle three = new ElectricVehicle("飞鸽");
        Bicycle test = null;

        one.show();
        two.show();
        three.show();
        System.out.println(two.toString(test));
    }
}
