package practiceNew;

import java.util.*;
/**
 * 这个类演示了文档注释
 * @author Ayan Amhed
 * @version 1.2
 */

public class NewClassReview {
    public static void main(String[] args) {
//        Date date1=new Date();
//        System.out.println(date1.toString());
//
//        System.out.printf("全部日期和时间信息：%tc%n",date1);
//        //f的使用
//        System.out.printf("年-月-日格式：%tF%n",date1);
//        //d的使用
//        System.out.printf("月/日/年格式：%tD%n",date1);
//        //r的使用
//        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date1);
//        //t的使用
//        System.out.printf("HH:MM:SS格式（24时制）：%tT%n",date1);
//        //R的使用
//        System.out.printf("HH:MM格式（24时制）：%tR",date1);


//        Console cons = System.console();
//        String username=cons.readLine("haha:");
//        char[] passwd=cons.readPassword("passward:");
//        System.out.println(username);
//        for(char c:passwd){
//            System.out.println(c);
//        }


//        Scanner sc = new Scanner(System.in);
//        String str1 = sc.nextLine();
//        System.out.println(str1);


//        char c;
//        // 使用 System.in 创建 BufferedReader
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("输入字符, 按下 'q' 键退出。");
//        // 读取字符
//        do {
//            c = (char) br.read();
//            System.out.println(c);
//        } while (c != 'q');


        String path1 = "/Users/yichiban/Code/Java/project/project_first/";
        String name1 = "5.txt";
        String path2 = "/Users/yichiban/Code/Java/project/project_first/javaIO/example/";
        String name2 = "2.txt";

//        File f2 = new File(path2 + name2);
//        File f3 = new File(path2 + "113.txt");
//        try {
//            f3.createNewFile();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        ;
////        FileInputStream f1 = new FileInputStream("1.txt");
//
//
//        System.out.println(f2.isDirectory());
//        System.out.println(f2.isFile());
//        System.out.println(f2.canWrite()); //存在才能判断


        /*
        ArrayList,有序列表，底层实现为数组
         */
        List<String> list1 = new ArrayList();

        list1.add("abc");
        list1.add("appp");
        list1.add("kkk");
        /*
        方法：add，get，remove，size(),addAll()(添加一整个列表),indexOf，set()
         */

        list1.remove("abc");

        Iterator<String> it = list1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }


        List<String>list2 = new LinkedList();
        //LinkedList里面方法：addFirst   addLast   removeLast  getLast

        /*
        map
         */

        Map<Integer,String> map1 = new HashMap();
        map1.put(1,"aaaaa");
        map1.put(2,"bbb");

        Iterator<Map.Entry<Integer,String >> it2= map1.entrySet().iterator();
        while(it2.hasNext()){
            Map.Entry<Integer,String> entry = it2.next();
            System.out.println(entry.getKey()+entry.getValue());

        }

        for(Integer i : map1.keySet()){
            System.out.println("key:"+i+"value: "+map1.get(i));
        }

        System.out.println(map1.keySet());
        System.out.println(map1.values());
        System.out.println(map1);
        System.out.println(map1.get(1));
        //clear(),

        /*
        Set

         */

        Set<String> sites = new HashSet();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");  // 重复的元素不会被添加
        System.out.println(sites);


        sites.remove("Google");
        System.out.println(sites);
        System.out.println(sites.contains("Google"));
        System.out.println(sites.size()); //可以用for-each循环
    }


}
