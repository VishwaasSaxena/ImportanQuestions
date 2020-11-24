public class LinkedlistQueue {
    Node front;
    Node rear;
    public LinkedlistQueue(){
        this.front=null;
        this.rear=null;
    }
    public class Node{
        int data;
        Node next;
    }
    public void enqueue(int data){
        Node newNode=new Node();
        newNode.data=data;
        if(front==null || rear==null){
            front=newNode;
            rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }

    }
    public boolean isEmpty(){
        if(front==null){
            return true;
        }else{
            return false;
        }
    }
    public  void dequeue(){
        if(!isEmpty()){
            System.out.println(front.data);
            front=front.next;
        }else{
            rear=null;
            System.out.println("Underflow");
        }
    }
    public void display(){
        Node temp=front;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }

    
}
