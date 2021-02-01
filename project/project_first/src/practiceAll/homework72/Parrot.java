package practiceAll.homework72;

public class Parrot extends Animal implements IAct{

    public  String kind;

    public Parrot() {
    }

    public Parrot(String name, int age, String kind) {
        super(name, age);
        this.kind = kind;
    }

    @Override
    public void love() {
        System.out.println("爱好：喜欢吃坚果和松子");
    }

    @Override
    public void skil() {
        System.out.println("技能：擅长模仿");
    }

    @Override
    public void act() {
        super.printName();
        super.printage();
        this.love();
        this.skil();
    }
}
