package learning.practise;
import learning.practise.User;

public class Test {

    public static void main(String [] args) {
        User one = new User();
        User two = new User();
        Manager one_m = new Manager();
        String str;


        one.setName("Lucy");
        one.setPassword("123456");
        two.setName("Mike");
        two.setPassword("123456");
        one.showData();
        two.showData();
        one_m.checkUser(one, two);
    }
}


