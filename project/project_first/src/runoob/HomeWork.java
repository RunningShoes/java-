package runoob;


import java.io.*;


public class HomeWork {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder("asdf sdad");
//        System.out.println(str1.reverse().toString());
        System.out.println(str1.toString().indexOf("df"));



        /*
        字符分割
         */

//        String str2 = "www.baidu.com";
//        String[] temp;
//        String[] temp1;
//        String delimeter = "\\.";
//        temp = str2.split(delimeter);
//        for (String x : temp) {
//            System.out.println(x);
//        }
//
//        StringTokenizer d2 = new StringTokenizer(str2, ".");
//        while (d2.hasMoreElements()) {
//            System.out.println(d2.nextToken());
//        }


        /*
           数组翻转
         */
//        ArrayList<String> arrayList = new ArrayList<String>();
//        arrayList.add("A");
//        arrayList.add("B");
//        arrayList.add("C");
//        arrayList.add("D");
//        arrayList.add("E");
//        System.out.println("反转前排序: " + arrayList);
//        Collections.reverse(arrayList);
//        System.out.println("反转后排序: " + arrayList);



        /*
        File
         */
        String path1 = "/Users/yichiban/Code/Java/project/project_first/src/FileStream/";
        String name1 = "1.txt";
//        File f1 = new File(path1 + name1);
//        try {
//            OutputStream out1 = new FileOutputStream(path1 + name1);
//            out1.write(4);
//            out1.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


        /*

        文件读写，FileWriter+BufferedWriter    或者FileReader+BufferReader；针对文件本身的操作可以用file
         */

        File f1 = new File(path1 + "3.txt");
        File f2 = new File(path1 + "hahaa/");
        File f3 = new File("/Users/yichiban/Code/Java/project/project_first/src/practiceNew");
        try {
            System.out.println(f1.createNewFile());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(f1.getName());
        System.out.println(f1.length());
        System.out.println(f1.getPath());
        System.out.println(f1.getAbsolutePath());
        System.out.println(f1.isFile());
        System.out.println(f2.mkdirs());
        System.out.println(f2.delete());
        System.out.println(f2.getParent());

        String[] names = f3.list();
        for (String temp : names) {
            System.out.println(temp);
        }


        int arr[] = {1, 2, 3, 4, 5};
        try {
            FileWriter fw1 = new FileWriter(path1 + name1);
            BufferedWriter bf = new BufferedWriter(fw1);
            bf.write("哈哈哈哈哈哈");
            bf.newLine();
            bf.write("asdsadasd\n");
            bf.write(arr.toString());

            bf.close();
            //fw1.close();

            bf = new BufferedWriter(new FileWriter(path1 + name1, true));
            bf.write("aString2");
            bf.close();
        } catch (Exception e) {
            e.printStackTrace();
            e.getMessage();
        }

        try {
            FileReader fr1 = new FileReader(path1 + name1);
            BufferedReader br1 = new BufferedReader(fr1);
            String str;
            while ((str = br1.readLine()) != null) {
                System.out.println(str);
            }
//            System.out.println(br1.readLine());
//            System.out.println("==========");
//            System.out.println(br1.read());
//            System.out.println("==========");
//            System.out.println(br1.readLine());
//            System.out.println("==========");
            br1.close();
            fr1.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        /*
        打印目录结构
         */
        String path = "/Users/yichiban/Code/Java/project/project_first/src";
        String listName[];
        File flist = new File(path);

        showDir(1,flist);



        try {
            throw new WrongException("my exception");
        } catch (Exception e) {
            System.err.println("Caught Exception");
            System.err.println("getMessage():" + e.getMessage());
            System.err.println("getLocalizedMessage():" + e.getLocalizedMessage());
            System.err.println("toString():" + e);
            System.err.println("printStackTrace():");
            e.printStackTrace();
        }

    }

    public static void showDir(int i,File f) {

        for(int c=0;c<i;c++){
            System.out.print("-");
        }
        System.out.println(f.getName());
       if(f.isDirectory()) {
           File [] f2 = f.listFiles();
           for(int kk=0;kk<f2.length;kk++){
               showDir(kk,f2[kk]);
           }
        }

    }

}

class WrongException extends Exception {
    public WrongException(String message) {
        super(message);
        System.out.println("good");
    }

}