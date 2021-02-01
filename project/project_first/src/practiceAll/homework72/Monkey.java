package practiceAll.homework72;

public class Monkey extends Animal implements IAct{

    public String kind;

    public Monkey() {
    }

    public Monkey(String name, int age, String kind) {
        super(name, age);
        this.kind = kind;
    }

    @Override
    public void love() {
        System.out.println("爱好：喜欢模仿人的行为");
    }

    @Override
    public void skil() {
        System.out.println("技能：其独轮车过独木桥");
    }

    @Override
    public void act() {
        super.printName();
        super.printage();
        this.printKind();
        this.love();
        this.skil();
    }

    public void printKind(){
        System.out.println("品种:"+this.kind);
    }
}
