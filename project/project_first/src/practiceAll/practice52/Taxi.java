package practiceAll.practice52;

public class Taxi extends Car{
    private String company;

    public Taxi() {
    }

    public Taxi(String color, String userName, String company) {
        super(color, userName);
        this.company = company;
    }

    public final void ride(){
        System.out.println(this.userName+"出租车是所属于在"+company);
    }

    public void use(){
        System.out.println("出租车是提高市民生活质量的重要条件之一");
    }

    @Override
    public String toString() {
        return this.userName +"家有一台"+this.getColor()+"的出租车";
    }
}
