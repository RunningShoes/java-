package practiceAll.Practice43;

public class Test43 {

    public static void main(String[] args) {
        // 实例化2个父类对象，传入两组相同的参数值
        Fruit fruit1=new Fruit("圆","可口");
        Fruit fruit2=new Fruit("圆","可口");
        fruit1.eat();
        System.out.println("fruit1和fruit2 引用比较结果："+fruit1.equals(fruit2));
        System.out.println("————————————————————————————————————————");
        // 实例化子类对象，并传入相关参数值
        Waxberry W1=new Waxberry("紫红色","圆形","酸甜");
        // 调用子类face方法和eat方法
        W1.face();
        W1.eat();
        // 测试重写toString方法，输出子类对象的信息
        System.out.println(W1.toString());
        System.out.println("——————————————————————————————————————————————");
        // 实例化Banana类对象，并传入相关参数值
        Banana b1= new Banana("仙人焦","短圆","香甜");
        b1.advantage();
        b1.advantage("黄色");
        // 调用子类的advantage和它的重载方法

        Banana b44 = new Banana();
    }
}
