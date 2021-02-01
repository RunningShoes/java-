package practiceAll.Practice43;

public final class Waxberry extends Fruit{

    private String Color;

    public Waxberry() {
    }

    public Waxberry(String shape, String taste, String color) {
        super(shape, taste);
        Color = color;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void eat() {
        System.out.println("杨梅酸甜适中，非常好吃！");
    }

    public final void face(){
        System.out.println("杨梅："+this.getShape()+"、"+Color+"，果肉"+this.getTaste());
    }

    @Override
    public String toString() {
        return "杨梅：果实为"+this.getShape()+", 果肉为"+this.getColor()+", "+this.getColor();
    }
}
