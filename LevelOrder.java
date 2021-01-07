import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left, right;
    public Node(int data){
        this.data=data;
        left=right=null;
    }


}

public class LevelOrder {

    Node root;
    void printLevelOrder(){
        Queue<Node> temp=new LinkedList<>();
        temp.add(root);
        while(!temp.isEmpty()){
            Node tempNode=temp.poll();
            System.out.print(tempNode.data+" ");
            if(tempNode.left!=null){
                temp.add(tempNode.left);
            }
            if(tempNode.right!=null){
                temp.add(tempNode.right);
            }
            //System.out.println();
        }
    }
    public static void main(String[] args) {
        LevelOrder tree= new LevelOrder();
        tree.root=new Node(1);
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.printLevelOrder();
        
    }
    
}
