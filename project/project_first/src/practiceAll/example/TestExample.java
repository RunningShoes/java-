package practiceAll.example;

import java.util.ArrayList;


public class TestExample {

    public static void main(String[] args) {
//
        /**
         * String
         */

//        StringBuilder s =new StringBuilder("abcdefg");
//        s.delete(2,4).insert(3,"CD");
//        System.out.println(s.toString());
//
//
//        String str1 = "abcs";
//        System.out.println(str1.substring(0,1));
//
//
//        Integer x =400;
//        Integer y = x;
//        x++;
//        System.out.println((x==y)+"  "+x+"   "+y);
//
//
//
//        StringBuilder strr = new StringBuilder("abc");
//
//        System.out.println(strr.append("--def").reverse());
//        System.out.println(strr);
//        System.out.println(strr.reverse().delete(3,5));
//
//
//
//        StringBuilder strb = new StringBuilder("欢迎来到imooc");
//        System.out.println(strb.delete(0,4));
//        System.out.println(strb.insert(0,"你好，"));
//        System.out.println(strb.replace(0,3,"欢迎来到"));


        /**
         * Arraylist
         *
         */
        ArrayList<Integer> list1 = new ArrayList<Integer>();
//        ArrayList list1 = new ArrayList();
//        Example one = new Example("张三",5000,1);
//        Example two = new Example("李四",5500,2);
//        Example three = new Example("赵六",4000,3);
//        Example four = new Example("赵ss六",3000,4);
//
//        list1.add(one);
//        list1.add(two);
//        list1.add(three);
//
//        System.out.println();
//        for(int i=0;i<list1.size();i++){
//            System.out.println(((Example)(list1.get(i))).getName() + "    "+((Example)(list1.get(i))).getSalary());
//        }
//
//        list1.add(four);
//        System.out.println();
//        for(int i=0;i<list1.size();i++){
//            System.out.println(((Example)(list1.get(i))).getName() + "    "+((Example)(list1.get(i))).getSalary());
//        }
//
//
//        list1.remove(0);
//        System.out.println();
//        for(int i=0;i<list1.size();i++){
//            System.out.println(((Example)(list1.get(i))).getName() + "    "+((Example)(list1.get(i))).getSalary());
//        }
//
//
//        list1.add(0,one);
//        System.out.println();
//        for(int i=0;i<list1.size();i++){
//            System.out.println(((Example)(list1.get(i))).getName() + "    "+((Example)(list1.get(i))).getSalary());
//        }
//
//        one.setSalary(50000000);
//        list1.set(0,one);
//        System.out.println();
//        for(int i=0;i<list1.size();i++){
//            System.out.println(((Example)(list1.get(i))).getName() + "    "+((Example)(list1.get(i))).getSalary());
//        }



        /**
         * HashSet
         */
//        Set set1 = new HashSet();
//        set1.add(1);
//        set1.add(2);
//        set1.add("blue");
//        set1.add(3);
//
//        Iterator it = set1.iterator();
//
//        while(it.hasNext())
//            System.out.println(it.next());
//
//
//        set1.add(1);

//        HashSet<Example> set2 = new HashSet();


        /**
         * Map
         *
         */

//        Map<String,String> map1 = new HashMap<String,String>();
//        for(String str:map1.keySet())
//        {
//
//        }


        /**
         * Thread
         */
        Example one = new Example("张三",5000,1);
        System.out.println(one.getClass() + "  "+ Example.class);




    }


}
