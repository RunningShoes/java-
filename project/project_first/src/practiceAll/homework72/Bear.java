package practiceAll.homework72;

public class Bear extends Animal implements IAct{

    public Bear() {
    }

    public Bear(String name, int age) {
        super(name, age);
    }

    @Override
    public void love() {
        System.out.println("爱好：喜欢卖萌");
    }

    @Override
    public void skil() {
        System.out.println("技能：挽着花篮，打着雨伞，自立走秀");
    }

    @Override
    public void act() {
        super.printName();
        super.printage();
        this.love();
        this.skil();
    }
}
