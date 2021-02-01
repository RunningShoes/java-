package runoob;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Soc {

    /**
     * socket服务端：
     *      1.serverSocket 创建端口
     *      2.Socket用于监听，Socket s1；s1.accept()
     *      3.InputStram in = s1.getInputStream    /    OutPutStream out = s1.getOutPutStram
     *        DataInputStream indata = new DataInputStream(in)     /     DataOutputStream indata = new DataOutputStream(in) 发送Data:
     *        out.writeUTF("Hello from " + s1.getLocalSocketAddress());
     *      4.            System.out.println("服务器响应： " + in.readUTF());
     *                  S
     * @param args
     */
    public static void main(String [] args) {
        try {
            ServerSocket ss = new ServerSocket(8888);
            System.out.println("启动服务器:");
            Socket s1 = ss.accept();
//            ss.setSoTimeout();
            System.out.println(s1.getRemoteSocketAddress()+"连接到服务器");

//            BufferedReader br= new BufferedReader(new InputStreamReader(s1.getInputStream()));
//            System.out.println(br.readLine());


            InputStream inFromServer = s1.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("服务器响应： " + in.readUTF());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
