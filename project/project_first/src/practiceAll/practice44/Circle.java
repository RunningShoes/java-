package practiceAll.practice44;


import java.text.DecimalFormat;

public class Circle extends Shape {

    public double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public void area(){
        double s = Math.PI*r*r;

        DecimalFormat format = new DecimalFormat("#.0");
        String scaled = format.format(s);

        System.out.println("圆的面积为："+scaled);
    }

}
