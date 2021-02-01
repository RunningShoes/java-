package ServerAndClient;

import java.net.*;
import java.io.*;

public class GreetingClient {
    public static void main(String [] args)
    {
//        String serverName = args[0];
//        int port = Integer.parseInt(args[1]);

        String serverName = "localhost";
//        InetAddress serverName = InetAddress.getLocalHost();


        int port = 8888;
        try
        {
            System.out.println("连接到主机：" + serverName + " ，端口号：" + port);
            Socket client = new Socket(serverName, port);     //新建一个套接字
            System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
            /*
            outputstream代表输出到服务器的内容
             */
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);
            out.writeUTF("Hello from " + client.getLocalSocketAddress());

            /*
            inputstream代表从服务器读入相关的内容
             */
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("服务器响应： " + in.readUTF());

            client.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
