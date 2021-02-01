package runoob;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.*;

public class DataStructure {

    public static void main(String [] args) {
        LinkedList<String> lList = new LinkedList<String>();
        lList.add("1");
        lList.add("8");
        lList.add("6");
        lList.add("4");
        lList.add("5");
        System.out.println(lList);

        lList.remove(3);
        System.out.println(lList);

        Vector v = new Vector();
        v.add("X");
        v.add("M");
        v.add("D");
        v.add("A");
        v.add("O");
        Collections.sort(v);
        System.out.println(v);
        int index = Collections.binarySearch(v, "D");
        System.out.println("元素索引值为 : " + index);

        int[] numGroup = {2,5,12,68,78,33,55};

        System.out.println(Arrays.binarySearch(numGroup,55));
        System.out.println(Arrays.toString(numGroup));
//        Arrays.sort(numGroup);
        System.out.println(Arrays.toString(numGroup));
//        Arrays.fill(numGroup,13);
        System.out.println(Arrays.toString(numGroup));
        Arrays.asList(numGroup);
        System.out.println(Arrays.toString(numGroup));
//        System.out.println("查看数组中的特定值:"+judge);

        int arr1 [] = Arrays.copyOf(numGroup,4);
        System.out.println(Arrays.toString(arr1));



        List <String>list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println("List :"+list);
        List sublist = Arrays.asList("three Four".split(" "));
        System.out.println("子列表 :"+sublist);
        System.out.println("indexOfSubList: "
                + Collections.indexOfSubList(list, sublist));
        System.out.println("lastIndexOfSubList: "
                + Collections.lastIndexOfSubList(list, sublist));
        Collections.replaceAll(list,"one","zxcv");
        System.out.println("子列表 :"+list);


        Hashtable ht = new Hashtable();
        Map <Integer,String> map1=new HashMap();
        map1.put(11,"11");
        map1.put(22,"22");
        map1.put(33,"33");

        ht.put(1,"1");
        ht.put(2,"2");
        ht.put(3,"3");
        ht.putAll(map1);

        System.out.println(ht.toString());
        Enumeration e = ht.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        //hashTable遍历
//        Iterator it = list.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

        Iterator it = map1.entrySet().iterator();
        while(it.hasNext()){
            System.out.print(it.next());
            System.out.println();
            System.out.println();
        }
        for(Integer i : map1.keySet()){
            System.out.print(i+"---");
            System.out.println(map1.get(i));
        }


        Iterator it1 = map1.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(map1.keySet());
        System.out.println(map1.values());
        //hashMap遍历

        System.out.println(Collections.max(list));

        try {
            InetAddress addr;
            Socket sock = new Socket("www.baidu.com", 80);
            addr = sock.getInetAddress();
            //addr = InetAddress.getByName("www.baidu.com");
            System.out.println("连接到 " + addr);
            sock.close();

            InetAddress addr1 = InetAddress.getLocalHost();
            System.out.println("Local HostAddress: "+addr1.getHostAddress());
            String hostname = addr1.getHostName();
            System.out.println("Local host name: "+hostname);

        } catch (Exception e1) {
            System.out.println("无法连接 " + args[0]);
            System.out.println(e1);
        }

        Socket Skt;
        String host = "localhost";
        if (args.length > 0) {
            host = args[0];
        }
        for (int i = 6066; i < 6068; i++) {
            try {
                System.out.println("查看 "+ i);
                Skt = new Socket(host, i);
                System.out.println("端口 " + i + " 已被使用");
            }
            catch (UnknownHostException e2) {
                System.out.println("Exception occured"+ e2);
                break;
            }
            catch (IOException e2) {
            }
        }
    }


}
