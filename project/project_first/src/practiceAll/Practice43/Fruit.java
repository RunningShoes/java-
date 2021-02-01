package practiceAll.Practice43;

public class Fruit {

    private String shape;
    private String taste;

    public Fruit() {
        System.out.println("haha");
    }

    public Fruit(String shape, String taste) {
        this.shape = shape;
        this.taste = taste;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }


    public void eat() {
        System.out.println("水果可以供人食用");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        Fruit fruit = (Fruit) obj;
//        if ((fruit.getShape() == getShape()) && (getTaste() == fruit.getTaste()))
//            return true;
//        else
//            return false;

        return shape.equals(fruit.shape) &&
                taste.equals(fruit.taste);
    }

}
