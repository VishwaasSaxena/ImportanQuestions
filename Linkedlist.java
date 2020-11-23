
public class Linkedlist{
    Node head;
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            next=null;
        }
    }
    public static Linkedlist insert(Linkedlist list, int data){
        Node newNode=new Node(data);
        newNode.next=null;
        if(list.head==null){
            list.head=newNode;
        }else{
        Node temp=list.head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }
        return list;
    }
    public static Linkedlist removeNode(Linkedlist list, int pos){
        int len=length(list);
        int count=0;
        Node temp=list.head;
        Node prev=null;
        while(temp!=null && count!=pos){
            prev=temp;
            temp=temp.next;
            count++;
        }
        prev.next=temp.next;
        temp.next=null;
        return list;
    }
    public static int length(Linkedlist list){
        int count=0;
        Node temp=list.head;
        while(temp!=null){
            count+=1;
            temp=temp.next;
        }
        return count;

    }
    public static Linkedlist insertAtHead(Linkedlist list,int data){
        Node newNode=new Node(data);
        newNode.next=list.head;
        list.head=newNode;
        return list;

    }
    public static Linkedlist insertAtPos(Linkedlist list, int pos,int data){
        Node newNode=new Node(data);
        int count=0;
        Node temp=list.head;
        Node prev=null;
        while(temp!=null && count!=pos){
            prev=temp;
            temp=temp.next;
            count++;
        }
        newNode.next=prev.next;
        prev.next=newNode;
        return list;

    }
    public static void displayList(Linkedlist list){
        Node temp=list.head;
        System.out.print("LinkedList:");
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
    public static void main(String[] args) {
        Linkedlist newList=new Linkedlist();
        newList=insert(newList,10);
        newList=insert(newList,20);
        newList=insert(newList,30);
        newList=removeNode(newList, 1);
        newList=insertAtPos(newList, 1, 40);
        newList=insert(newList, 50);
        newList=insert(newList, 70);
        newList=insert(newList, 80); 
        newList=insert(newList, 90);
        newList=insertAtPos(newList, 5, 100);
        newList=insertAtHead(newList, 200);
        displayList(newList);
    }
}