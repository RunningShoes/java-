import java.util.HashSet;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}



public class Niuke {

    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet();

//        String s1 = "asd asd asd";
//        s1.replaceAll(" ","%20");
//        System.out.println(s1);
//        ListNode a1 = new ListNode(1);
//        ListNode a2 = new ListNode(2);
//        ListNode a3 = new ListNode(3);
//        ListNode a4 = new ListNode(4);
//        ListNode a5 = new ListNode(5);
//
//        a1.next = a2;
//        a2.next = a3;
//        a3.next = a4;
//        a4.next = a5;
//
//
//        ListNode b3 =new ListNode(-1);
//        System.out.println(b3.val);
//        System.out.println(b3.next);
//        b3.next=a3;
//        System.out.println(b3.val);
//        System.out.println(b3.next);
//        b3=a4;
//        System.out.println(b3.val);
//        System.out.println(b3.next.val);
//
//
//        ListNode node = a1;
//        while (node.next != null) {
//            System.out.print(node.val);
//            node = node.next;
//        }
//        System.out.println(node.val);
//
//        ArrayList<Integer> one = new ArrayList<Integer>();
//        int [] input={4,5,3,2,1,6,7,8};
//        for(int i=0;i<input.length;i++){
//            one.add(input[i]);
//        }
//        Collections.sort(one);
//        System.out.println(((ArrayList)one.subList(0,4)).toString());
//
//



        //递归遍历
//        Niuke one =new Niuke();
//        ListNode new_head = one.reverse2(a1);
//        ListNode node1 = new_head;
//        int i=1;
//        while (node1!= null) {
//            System.out.print(node1.val);
//            node1 = node1.next;
//        }
//        System.out.println(node1.val);
//        Niuke one =new Niuke();
//        int k=5;
//        ListNode new_head = one.FindKthToTail(a1,k);
//        System.out.println(new_head.val);

    }

//
//    public int findRepeatNumber(int[] nums) {
//        int length = nums.length;
//        int array [] = new int[length];
//        for(int i=0;i<length;i++){
//            array[nums[i]]+=1;
//            if(array[nums[i]]>=1)
//                return nums[i];
//        }
//
//    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        int lengthx = matrix.length;
        int lengthy = matrix[0].length;
        boolean flag = false;
        for(int i=0; i<lengthx;i++){
            for(int j=0; j<lengthy;j++){
                if(matrix[i][j]==target){
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }


    public int Sum_Solution(int n) {
//         int sum = n*(n+1)/2;
//         return sum;
        int sum = n;
        boolean flag = (sum>0 )&&((sum+=Sum_Solution(sum-1))>0);
        return sum;
    }

    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode temp = reverse2(head);
        for(int i=1;i<k;i++){
            temp = temp.next;
        }
        return temp;
    }


    public ListNode reverse1(ListNode head) { //递归翻转

        if (head == null || head.next==null)
            return head;

        ListNode pre = head;
        ListNode cur = head.next;
        ListNode temp;
        while (cur!= null) {
            temp = cur.next;
            cur.next = pre;

            pre = cur;
            if(temp == null)
                break;
            cur = temp;
        }
        head.next =null;
        return cur;
    }

    public ListNode reverse2(ListNode head) { //非递归翻转

        if (head == null)
            return null;
        ListNode pre = head;
        ListNode cur = head.next;
        ListNode temp;
        while (cur!= null) {
            temp = cur.next;
            cur.next = pre;

            pre = cur;
            if(temp == null)
                break;
            cur = temp;
        }
        head.next =null;
        return cur;
    }


    //前序中序递归重建二叉树
//     class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode(int x) {
//            val = x;
//        }
//    }
//    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {  //pre前序，in中序
//        TreeNode root = new TreeNode(0);
//        root = Construction(pre,0,pre.length-1,in,0,in.length-1);
//        return root;
//    }
//    public TreeNode Construction(int [] pre, int startPre, int endPre, int [] in, int startIn,int endIn){
//        if(startPre>endPre||startIn>endIn)
//            return null;
//
//        TreeNode root = new TreeNode(pre[startPre]);
//        for(int i = startIn;i<endIn;i++){
//            if(root.val==in[i]){
//                root.left =Construction(pre,startPre+1,i-startIn+1+startPre,in,startIn,i-1);
//                root.right =Construction(pre,startPre+1+i-startIn,endPre,in,i+1,endIn);
//                break;
//            }
//        }
//        return root;
//    }


    //两个栈实现队列
//    Stack<Integer> stack1 = new Stack<Integer>();
//    Stack<Integer> stack2 = new Stack<Integer>();
//
//    public void push(int node) {
//        if (stack2.empty()){
//            stack1.push(node);
//        }else{
//            stack1.push(node);
//        }
//
//    }
//
//    public int pop() {
//        int node;
//        if(stack2.empty())
//        {
//            while(!stack1.empty()){
//                node = stack1.pop();
//                stack2.push(node);
//            }
//            return stack2.pop();
//        }else{
//            return stack2.pop();
//        }
//    }
//


//    public int minNumberInRotateArray(int [] array) {
//        if(array==null){
//            return 0;
//        }
//        int left = 0;
//        int right=array.length-1;
//        int middle = -1;
//
//        return 0;
//    }
//
//    public int Fibonacci(int n) {
//        int result = 0;
//        if(n == 1|| n==2)
//            return 1;
//        else {
//            int temp0 = 1;
//            int temp1 = 1;
//
//            while (n - 2 > 0) {
//                result = temp0 + temp1;
//                temp0 = temp1;
//                temp1 = result;
//                n--;
//            }
//        }
//        return result;
//    }


    //青蛙跳级


}


