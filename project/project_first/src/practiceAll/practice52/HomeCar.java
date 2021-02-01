package practiceAll.practice52;

public final class HomeCar extends Car{
    public int num;

    public HomeCar() {
    }

    public HomeCar(String color, String userName, int num) {
        super(color, userName);
        this.num = num;
    }

    public void display(){
        System.out.println(userName+"拥有的"+this.getColor()+"私家车有"+this.num+"个座位");
    }

    public void display(int num){
        System.out.println("私家车有"+num+"个座位。");
    }
}
