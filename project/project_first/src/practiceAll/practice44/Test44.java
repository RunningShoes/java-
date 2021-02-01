package practiceAll.practice44;

public class Test44 {

    public static void main(String[] args) {
        //创建类的实例，并分别对圆的半径和矩形的长宽进行赋值

        //调用area（）方法，输出结果
        Shape one =new Ractangle(6.0,5.0);
        Shape two = new Circle(3.5);
//        if(one instanceof Rectangle){
//            one.area();
//        }
        one.area();
        two.area();
    }
}
