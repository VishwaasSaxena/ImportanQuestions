import java.util.LinkedList;
import java.util.Queue;

public class BinaryInsertion {
    static Node root;
    static Node temp=root;
    static public class Node{
        int data;
        Node right,left;
        public Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    static void inOrder(Node temp){
        if(temp==null){
            return;
        }
        inOrder(temp.left);
        System.out.print(temp.data+" ");
        inOrder(temp.right);
    }
    static void insert(Node temp, int key){
        if(temp==null){
            root=new Node(key);
            return;
        }
        Queue<Node> tree=new LinkedList<>();
        tree.add(temp);
        while(!tree.isEmpty()){
            temp=tree.peek();
            tree.remove();
            if(temp.left==null){
                temp.left=new Node(key);
                break;
            }
            else{
                tree.add(temp.left);
            }
            if(temp.right==null){
                temp.right=new Node(key);
                break;
            }else{
                tree.add(temp.right);
            }
        }

    }
    static int maxValue(Node root){
        int rVal=0,max=0,lMax,rMax;
        if(root!=null){
        rVal=root.data;
        lMax=maxValue(root.left);
        rMax=maxValue(root.right);
        if(lMax>rMax){
            max=lMax;
        }else
        max=rMax;
        if(rVal>max){
            max=rVal;
        }
    }
        return max;

    }
    static int getHeight(Node root){
        if(root==null){
            return -1;
        }else{
            int lH=getHeight(root.left);
            int rH=getHeight(root.right);
            if(lH>rH){
                return lH+1;
            }else{
                return rH+1;
            }
        }
    }
    static int getSum(Node root){
        if(root==null){
            return 0;
        }
        int sum=0;
        return (root.data+getSum(root.left)+getSum(root.right));
    }
    public static void main(String[] args) {

        root=new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        inOrder(root);
        insert(root, 12);
        System.out.println();
        inOrder(root);
        System.out.println();
        System.out.println(maxValue(root));
        System.out.println(getHeight(root));

    }

}
