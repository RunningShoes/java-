package practiceAll.practice316;


public class Test316 {

    public static void main(String[] args) {

        Animal[] animal = new Animal[5];

        for (int i = 0; i < 5; i++) {
            int j = (int)(Math.random()*3);
            if (j==0)
                animal[i] = new Cat();
            else if(j==1)
                animal[i] = new Dog();
            else
                animal[i] = new Sheep();
        }

        for (Animal animal1:animal)
        {
            animal1.cry();

        }
    }
}
