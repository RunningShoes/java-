package FileStream;

import java.io.*;

public class InOut {

    public static void main(String args[]) throws IOException {
//        char c;
//        String str1;
//        // 使用 System.in 创建 BufferedReader
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("输入字符, 按下 'q' 键退出。");
//        // 读取字符
//        do {
////            c = (char) br.read();
////            System.out.println(c);
//            str1 = br.readLine();
//            System.out.println(str1);
//        } while (str1 != "quit");


        String path1 = "/Users/yichiban/Code/Java/project/project_first/src/FileStream/";
        String name1 = "1.txt";
        String path2 = "/Users/yichiban/Code/Java/project/project_first/src/FileStream/";
        String name2 = "2.txt";

        File f1 = new File(path1+name1);
        InputStream f1in = new FileInputStream(f1);

        int size = f1in.available();
        for(int i= 0;i<size;i++){

            System.out.println((byte)f1in.read());
        }

        File f2 = new File(path2+name2);
        OutputStream f2out = new FileOutputStream(f2);
        OutputStreamWriter writer = new OutputStreamWriter(f2out, "UTF-8");

        writer.append("\r\n");
        writer.append("English");
        writer.close();

        f2out.close();


//        File f3 = new File(path1+"haha/ds");
//        f3.mkdirs();


        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;
        String fileNames[] = {path1+"/星月神话.mp3",path1+"/我只在乎你.mp3"};
        //设置byte数组，每次往输出流中传入8K的内容
        byte by[] = new byte[1024*8];
        try
        {
            fileOutputStream = new FileOutputStream(path1+"/合并.mp3");
            for(int i=0;i<2;i++)
            {
                int count = 0;
                fileInputStream = new FileInputStream(fileNames[i]);
                //跳过前面3M的歌曲内容
                fileInputStream.skip(1024*1024*3);
                while(fileInputStream.read(by) != -1)
                {
                    fileOutputStream.write(by);
                    count++;
                    System.out.println(count);
                    //要截取中间2MB的内容，每次输入8k的内容，所以输入的次数是1024*2/8
                    if(count == (1024*2/8))
                    {
                        break;
                    }
                }
            }
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                //输出完成后关闭输入输出流
                fileInputStream.close();
                fileOutputStream.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }

}