package practiceAll.Practice43;

public class Banana extends Fruit {

    private String varity;

    public Banana() {
    }

    public Banana(String shape, String taste, String varity) {
        super(shape, taste);
        this.varity = varity;
    }

    public String getVarity() {
        return varity;
    }

    public void setVarity(String varity) {
        this.varity = varity;
    }

    public void advantage() {
        System.out.println("果型：" + this.getShape() + "，果肉：" + this.getTaste());
    }

    public void advantage(String Color) {
        System.out.println("香蕉颜色为：" + Color);
    }

}
