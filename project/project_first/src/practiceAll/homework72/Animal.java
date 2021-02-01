package practiceAll.homework72;

abstract public class Animal {
    String name;
    int age;
    abstract public void love();


    public Animal() {
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void  printName(){
        System.out.println("表演者："+this.name);
    }

    public void printage(){
        System.out.println("年龄："+this.age+"岁");
    }

}
