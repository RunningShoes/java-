package practiceAll.practice52;

import java.util.Objects;

public class Car {
    private String Color;
    public String userName;

    public Car() {
    }

    public Car(String color, String userName) {
        Color = color;
        this.userName = userName;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void use(){
        System.out.println("我市机动车");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(Color, car.Color) &&
                Objects.equals(userName, car.userName);
    }



}
