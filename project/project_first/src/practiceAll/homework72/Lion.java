package practiceAll.homework72;

public class Lion extends Animal implements IAct {
    private String color;
    private String sex;

    public Lion() {
    }

    public Lion(String name, int age, String color, String sex) {
        super(name, age);
        this.setColor(color);
        this.sex = sex;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public void love() {
        System.out.println("爱好：喜欢吃肉类");
    }

    @Override
    public void skil() {
        System.out.println("技能：擅长钻火圈");
    }

    @Override
    public void act() {
        super.printName();
        super.printage();
        this.printSex();
        this.printColor();
        this.love();;
        this.skil();
    }

    public void printSex(){
        System.out.println("性别："+this.getSex());
    }

    public void printColor(){
        System.out.println("毛色："+this.getColor());
    }
}
