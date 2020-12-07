public class BinarySearchTree {
    Node root;
    BinarySearchTree(){
        root =null;
    }
    public static class Node{
        int data;
        Node left,right;
        public Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    public void insert(int value){
        root=insertN(root, value);

    }
    public static Node insertN(Node root, int value){
        if(root== null){
            root=new Node(value);
        }
        if(root.data>value){
            if(root.left==null){
                root.left=new Node(value);
            }else{
                root.left=insertN(root.left, value);
            }
        }else{
            if(root.right==null){
                root.right=new Node(value);
            }else{
            root.right=insertN(root.right,value);
            }
        }
        return root;
    }
    public void inOrder(){
        inOrderT(root);
    }
    public void inOrderT(Node root){
        if(root!=null){
            inOrderT(root.left);
            System.out.print(root.data+" ");
            inOrderT(root.right);
        }
    }
    public void postOrder(){
        postOrderT(root);
    }
    public void postOrderT(Node root){
        if(root!=null){
            postOrderT(root.left);
            postOrderT(root.right);
            System.out.print(root.data+" ");
        }
    }
    public void findMax(){
        System.out.println(getMax(root));
    }
    public int getMax(Node root){
        int rVal=0,max=0,rMax,lMax;
        if(root!=null){
            rVal=root.data;
            lMax=getMax(root.left);
            rMax=getMax(root.right);
            if(lMax>rMax){
                max=lMax;
            }else{
                max=rMax;
            }
            if(rVal>max){
                max=rVal;
            }

        }
        return max;
    }
    public static void main(String[] args) {
        BinarySearchTree tree= new BinarySearchTree();
        tree.insert(50);
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
        tree.inOrder();
        System.out.println("-----------------");
        tree.postOrder();
        System.out.println();
        tree.findMax();
    }
    
}
