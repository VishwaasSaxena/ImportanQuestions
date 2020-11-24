public class LinkedlistStack {
    Node head;
    public LinkedlistStack(){
        this.head=null;
    }
    public class Node{
        int data;
        Node next;
        
    }
    public void push(int data){
        Node temp=new Node();
        temp.data = data;
        temp.next=head;
        head=temp;
    }
    public boolean isEmpty(){
        if(head==null){
            return true;
        }else{
            return false;
        }
    }
    public int peek(){
        if(!isEmpty()){
            return head.data;
        }else{
            return -1;
        }
    }
    public void pop(){
        if(head==null){
            System.out.println("Overflow");
            return;
        }else{
            head=head.next;
        }
    }
    public void display(){
        Node temp=new Node();
        temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }

    
}
