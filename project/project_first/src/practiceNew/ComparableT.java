package practiceNew;

import java.util.ArrayList;
import java.util.List;

//<? extends T> 代表T类型的子类
//<? super T>  代表T类型的父类

public class ComparableT {
    public ComparableT() {
    }

    public static <T extends Comparable> T maximum(T x, T y) {
        T max = x;
        if (y.compareTo(max) > 0) {
            max = y;
        }
        return max;
    }

    public static void main(String[] args) {

        Integer x1 = 3;
        Integer x2 = 66;
        Double d1 = 3.34d;
        Double d3 = 4.22d;
        String str1 = "asdf";
        String str2 = "nbdr";

        ComparableT one = new ComparableT();
        System.out.println(one.maximum(x1, x2));
        System.out.println(one.maximum(d1, d3));
        System.out.println(one.maximum(str1, str2));


        List<String> str3 = new ArrayList();
        str3.add("asdf");
        ;
        ;

        one.getData(str3);


    }


    public void getData(List<?> data) {

        System.out.println("data:" + data.get(0));
    }
}
