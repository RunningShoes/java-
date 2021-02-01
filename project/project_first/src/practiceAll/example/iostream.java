package practiceAll.example;

import java.io.*;

class FileIOstream {

}

class BytrsIOstream {


}


public class iostream {

    public static void main(String[] args) {
        //fileInputStream    文件输入输出流
        String path1 = "/Users/yichiban/Code/Java/project/project_first/javaIO/example/";
        String name1 = "2.txt";

//
//        File file1= new File(path1+name1);
//        byte [] bytes = new byte[(int)file1.length()];
//
//        try {
//            FileInputStream fis = new FileInputStream(path1 + name1);
//            byte [] bytes1 = new byte[fis.available()];
//            int n  =0 ;
//            while((n=fis.read())!=-1){
//                System.out.println((char)(n));
//            }
//            fis.read(bytes);
//            fis.close();
//        }catch(FileNotFoundException e){
//            e.printStackTrace();
//        }catch (IOException e){
//            e.printStackTrace();
//        }

        //write
//        FileOutputStream fos ;
//        char ch[]= {'a','s','d','f','g','h'};
//        try{
//            fos = new FileOutputStream(path1+name1);
//            fos.write(100);
//            fos.write(ch);
//            fos.close();
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//        finally {
//
//        }


        //文件缓冲流

//        File file5 = new File(path1+name1);
//        try {
//            FileOutputStream fos1 = new FileOutputStream(path1+name1);
//            BufferedOutputStream bos1 = new BufferedOutputStream(fos1);
//            FileInputStream fis1 = new FileInputStream(path1 + name1);
//            BufferedInputStream bis1 = new BufferedInputStream(fis1);
//
//
//            bos1.write('哈');
//            bos1.write('b');
////            bos1.write('哈');
////            bos1.write('哈');
//
//            bos1.flush();
//            bos1.close();
//            byte[] bytes3 = new byte[(int)file5.length()];
////            int n = 0;s
////            while((bis1.read())!=-1)
//            bis1.read(bytes3);
//                System.out.println(new String(bytes3,"UTF-8"));
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        }


        //字符输入流
//        File file6 = new File(path1 + name1);
//        try {
//            FileInputStream fis = new FileInputStream(path1 + name1);
//            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
//            FileOutputStream fos10 = new FileOutputStream(path1 + "10.txt");
//            OutputStreamWriter osr = new OutputStreamWriter(fos10);
//
//
//            int n = 0;
//            char[] buff = new char[(int) file6.length()];
//
////            while((n=isr.read())!=-1)
////                System.out.println((char)n);
//
//            while ((n = isr.read(buff)) != -1) {
//                String s = new String(buff, 0, n);
//                System.out.println(s);
//
//                osr.write(buff, 0, n);
//                osr.write("good");
//            }
//            osr.flush();
//            isr.read(buff);
//            System.out.println();
//
//
//            fis.close();
//            fos10.close();
//            isr.close();
//            osr.close();
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }




        //BufferedReader 和 BufferedWriter


        File file6 = new File(path1 + name1);
        try {
            FileInputStream fis = new FileInputStream(path1 + name1);
            InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
            BufferedReader bfr = new BufferedReader(isr);
            FileOutputStream fos10 = new FileOutputStream(path1 + "11.txt");
            OutputStreamWriter osr = new OutputStreamWriter(fos10);
            BufferedWriter bfw = new BufferedWriter(osr);

            int n = 0;
            char[] buff = new char[(int) file6.length()];

//            while((n=isr.read())!=-1)
//                System.out.println((char)n);

            while ((n = bfr.read(buff)) != -1) {
                String s = new String(buff, 0, n);
                System.out.println(s);

                bfw.write(buff, 0, n);
                bfw.newLine();
                bfw.write("good");

            }
            bfw.flush();

            isr.read(buff);
            System.out.println();


            fis.close();
            fos10.close();
            isr.close();
            osr.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
