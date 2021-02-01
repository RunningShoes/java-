package practiceAll.example;

import java.io.File;
import java.io.IOException;

public class InOut {

    public static void main(String[] args) {

        String path = "/Users/yichiban/Code/Java/project/project_first/";
        String path2 = "/Users/yichiban/Code/Java/project/project_first/javaIO/example/";
        String name1 = "1.txt";
        String name2 = "2.txt";


        File file1 = new File(path + name1);
        File file2 = new File(path2);
        File file3 = new File(path2 + name2);

        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.canWrite()); //存在才能判断


        if (!file1.exists()) {
            try {
                file1.createNewFile();
            }catch(IOException e){
                e.printStackTrace();
            }
        }

        if (!file2.exists()) {
            System.out.println("不存在");
            file2.mkdirs();
        } else {
            try{
                file3.createNewFile();
            }catch(IOException e) {
                e.printStackTrace();
            }
        }


        System.out.println(file3.getAbsolutePath());
        System.out.println(file3.getName());
        System.out.println(file3.getParent());




//        File file5 = new File (path+"good/fff");
//        if(file5.exists()){
//
//            file5.delete();
//        }


        //practice:
//        File file5 = new File (path+"good/1.txt");
//        if(!file5.exists()){
//            System.out.println("goofd");
////            file5.mkdirs();
//            try{
//                file5.createNewFile();     //文件路径不存在要下吗创建文件路径
//            }catch(IOException e){
//                e.printStackTrace();
//            }
//        }



        String path3 = "/Users/yichiban/Code/Java/project/";
        File filep = new File(path3);

        System.out.println(filep.getPath());
    }
}
