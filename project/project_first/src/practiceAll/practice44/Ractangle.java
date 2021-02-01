package practiceAll.practice44;


public class Ractangle extends Shape{

    public double length;
    public double wide;

    public Ractangle() {
    }

    public Ractangle(double length, double wide) {
        this.length = length;
        this.wide = wide;
    }

    public void area(){
        double s = length*wide;
        System.out.println("矩形的面积是"+s);
    }
}
