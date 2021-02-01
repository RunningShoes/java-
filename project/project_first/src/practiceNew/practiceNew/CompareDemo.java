package practiceNew.practiceNew;

import java.util.Comparator;

public class CompareDemo {
    public String name1;
    public String str1;
    public int num;

    public CompareDemo() {
    }

    public CompareDemo(String name1, String str1, int num) {
        this.name1 = name1;
        this.str1 = str1;
        this.num = num;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        else {
            if ((((CompareDemo) obj).num == this.num) && ((((CompareDemo) obj).name1.equals(this.name1))) && (((CompareDemo) obj).str1.equals(this.str1)))
                return true;
            else
                return false;
        }
    }

    @Override
    public String toString() {
        return name1 + "+" + str1 + "+" + num;
    }

    public static void main(String[] args) {
        CompareDemo c1 = new CompareDemo("haha", "1", 34);
        CompareDemo c2 = new CompareDemo("haha", "1", 34);
        CompareDemo c3 = new CompareDemo("haha1", "1", 34);

        System.out.println(c1.equals(c2));
        System.out.println(c2.equals(c3));
        System.out.println(c3.equals(c1));
        System.out.println(c3.toString());


        Compare1 one1 = new Compare1("abc");
        Compare1 one2 = new Compare1("abc");
        Compare1 one3 = new Compare1("cbd");

        System.out.println(one1.compareTo(one2));
        System.out.println(one3.compareTo(one1));

        String str1 = "abc";
        String str2 = "cbd";

        System.out.println(str2.compareTo(str1));

        Compare2 two1 = new Compare2("acb",1);
        Compare2 two2 = new Compare2("acb",1);
        Compare2 two3 = new Compare2("cde",2);

        System.out.println(two1.compare(two1,two2));
        System.out.println(two1.compare(two3,two2));
        System.out.println(two1.compare(two2,two3));

    }

}




class Compare1 implements Comparable {
    String str1;
    int a ;

    public Compare1(String str1) {
        this.str1 = str1;
    }

    public Compare1() {
    }

    @Override
    public int compareTo(Object o) {
        if(o==null)
            return 0;
        else{
            return str1.compareTo(((Compare1)o).str1);
        }
    }
}



class Compare2 implements Comparator {
    String str1;
    int a;

    public Compare2(String str1, int a) {
        this.str1 = str1;
        this.a = a;
    }

    @Override
    public int compare(Object o1, Object o2) {
        if(o1==null || o2==null){
            return 0;
        }
        if(((((Compare2)o1).str1.equals(((Compare2)o2).str1)))&&((((Compare2)o1).a==(((Compare2)o2).a))))
        {
            return 0;
        }else if((((Compare2)o1).str1.compareTo(((Compare2)o2).str1)>0) && (((Compare2)o1).a>(((Compare2)o2).a)))
                return 1;
        else
            return -1;
    }
}



