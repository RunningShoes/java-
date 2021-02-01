package ServerAndClient;

/**
 * Tcp相关的编程如下。TCP相关的编程用DatagramSocket
 */

import java.io.*;
import java.net.*;

public class GreetingServer extends Thread{
    private ServerSocket serverSocket;

    public GreetingServer(int port) throws IOException
    {
        serverSocket = new ServerSocket(port);
        serverSocket.setSoTimeout(100000);
    }

    public void run()
    {
        while(true)
        {
            try
            {
                System.out.println("等待远程连接，端口号为：" + serverSocket.getLocalPort() + "...");
                Socket server = serverSocket.accept();//监听是否有链接存在
                System.out.println("远程主机地址：" + server.getRemoteSocketAddress());
                /*
                DataInputStream读取从客户端发来的信息
                 */
                DataInputStream in = new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                System.out.println("sdasd)");
                /*
                DataOutputStream发送给客户端的信息
                 */
                DataOutputStream out = new DataOutputStream(server.getOutputStream());
                out.writeUTF("谢谢连接我：" + server.getLocalSocketAddress() + "\nGoodbye!");

                server.close();
            }catch(SocketTimeoutException s) {
                System.out.println("Socket timed out!");
                break;
            }catch(IOException e)
            {
                e.printStackTrace();
                break;
            }
        }
    }
    public static void main(String [] args)
    {
        int port = Integer.parseInt("62275");
        try
        {
            Thread t = new GreetingServer(8888);
            t.run();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
