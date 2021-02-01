package practiceAll.practice513;

public class Test513 {
    public static void main(String [] args){

        IFly ifly1 = new Plane();
        IFly ifly2 = new Bird();
        IFly ifly3 = new Ballon();

        ifly1.fly();
        ifly2.fly();
        ifly3.fly();
    }
}
