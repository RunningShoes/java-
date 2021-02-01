package practiceAll.practice52;

public class Test52 {
    public static void main(String [] args){
        Car one=new Car("a","b");
        Car two=new Car("a","b");
        one.use();
        System.out.println("Car1和Car2的引用比较："+one.equals(two));
        System.out.println("==================================");
        Taxi taxi1=new Taxi("蓝色","张小泉","长生");
        taxi1.use();
        taxi1.ride();
        System.out.println("==================================");
        HomeCar homeCar1=new HomeCar("紫色","孙二两",7);
        homeCar1.display();
        homeCar1.display(5);
    }

}
