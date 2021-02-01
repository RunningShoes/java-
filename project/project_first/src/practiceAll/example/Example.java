package practiceAll.example;


public class
Example {
    public String name;
    public int salary;
    public int id;

    public Example(String name, int salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
