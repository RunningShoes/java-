package learning.practise;

public class Manager {

    public void checkUser(User one,User two)
    {
        if(one.getName().equals(two.getName()) && one.getPassword().equals(two.getPassword()))
        {
            System.out.println("用户名、密码一致");
        }
        else
            System.out.println("用户名或者密码不一致");
    }
}




