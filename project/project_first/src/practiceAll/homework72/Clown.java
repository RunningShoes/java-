package practiceAll.homework72;

public class Clown extends Animal implements IAct{

//    public String clownName;

    public Clown() {
    }

    public Clown(String name, int age) {
        super(name, age);
//        this.clownName = clownName;
    }

    public void printage(){
        System.out.println("艺龄："+super.age+"年");    //直接访问父类
    }

    @Override
    public void love() {
        ;
    }

    @Override
    public void skil() {
        System.out.println("技能："+"脚踩高跷进行魔术表演");
    }

    @Override
    public void act() {
        super.printName();
        this.printage();
        this.printColothes();
        this.skil();
    }

    public  void printColothes(){
        System.out.println("着装："+"身穿五彩服，头戴彩色帽子，脸上画着彩妆");
    }
}
