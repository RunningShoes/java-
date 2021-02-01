package learning.practise;

public class User {
    private String name;
    private String password;

    public User() {
    }

    public void show()
    {
        System.out.println("good");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void showData(){
        System.out.println("用户名："+this.getName());
        System.out.println("密  码："+this.getName());
    }
}
