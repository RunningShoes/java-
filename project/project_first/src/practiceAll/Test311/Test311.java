package practiceAll.Test311;

import java.util.HashSet;
import java.util.Set;

class Student{
    private int StuId;
    private String name;
    private double score;
    static int i = 0;//hashcode

    public Student() {
        i=i+1;
    }

    public Student(int stuId, String name, double score) {
        i+=1;
        StuId = stuId;
        this.name = name;
        this.score = score;
    }

    public int getStuId() {
        return StuId;
    }

    public void setStuId(int stuId) {
        StuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String toString(){
        String str;
        str = "["+this.getStuId()+","+this.getName()+","+this.getScore()+"]";

        return str;
    }

    @Override
    public int hashCode() {
        return super.hashCode()+i;
    }


    @Override
    public boolean equals(Object obj) {
        if(obj ==null)
            return false;
        Student one = (Student) obj;
        return (this.getName().equals(one.getName())  && this.getScore()==one.getScore() && this.getStuId()==one.getStuId());
    }


}



public class Test311 {
    public static void main(String [] args){

        Student one = new Student(1,"qqq",54.6);
        Student two = new Student(2,"aaa",776.5);
        Student three = new Student(3,"zzz",99.3);
        Student four = new Student(3,"zzz",99.3);
        Student five = new Student(5,"zzz",99.3);
        Student six = new Student(6,"zzz",99.3);

        Set<Student> stu= new HashSet<>();
        stu.add(one);
        stu.add(two);
        stu.add(three);
        stu.add(four);

        for(Student i:stu){
            System.out.println(i);
            //System.out.println(i.hashCode());
        }

        if(stu.contains(four))
            System.out.println(stu.size());

//        if (!stu.isEmpty())
//        {
//            Iterator it = stu.iterator();
//            while(it.hasNext())
//                System.out.println(it.next());
//        }


    }
}
