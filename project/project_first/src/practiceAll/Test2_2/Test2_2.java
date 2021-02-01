package practiceAll.Test2_2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

abstract class Anmial{
    private String name;
    private String kind;

    public Anmial(){
    }

    public Anmial(String name, String kind) {
        this.name = name;
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract public void show();
}

class Cat extends Anmial{
    public Cat() {
        super();
    }

    public Cat(String kind,String name){
        super(kind,name);
    }

    public void show() {
        System.out.println(this.getKind()+this.getName()+"在做游戏");
    }
}

class Dog extends Anmial{
    public Dog() {
        super();
    }

    public Dog(String kind,String name){
        super(kind,name);
    }

    public void show() {
        System.out.println(this.getKind()+this.getName()+"在做游戏");
    }
}

class AnimalPlay {
    public void fun1(List<? extends Anmial> T){
        for(Anmial i:T)
            i.show();

        System.out.println("=============================");

        Iterator it = T.iterator();
        while(it.hasNext())
            ((Anmial)it.next()).show();
    }
}

public class Test2_2 {

    public static void main(String [] args){
        Cat cat1 = new Cat("小猫","aaa");
        Cat cat2 = new Cat("小猫","bbb");
        Dog dog1 = new Dog("小狗","ccc");
        Dog dog2 = new Dog("小狗","ddd");


        List <Anmial>list1 = new ArrayList<>() ;
        list1.add(cat1);
        list1.add(cat2);
        list1.add(dog1);
        list1.add(dog2);
        list1.set(3,cat1);
//        list1.add(3,cat2);

        AnimalPlay one = new AnimalPlay();
//        one.fun1(list1);

        list1.remove(cat1);
        one.fun1(list1);


        System.out.println("&***********");
        System.out.println(list1.get(2));

//        if(list1.contains(cat2))
//            System.out.println(list1.indexOf(cat2));




    }
}
