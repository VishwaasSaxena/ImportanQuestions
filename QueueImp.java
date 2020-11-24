public class QueueImp {
    public static void main(String[] args) {
        LinkedlistQueue q=new LinkedlistQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.enqueue(50);
        //q.dequeue();
        System.out.println("------------");
        q.display();
       q.enqueue(200);
        q.enqueue(100);
        q.enqueue(40);
        q.display();
        q.dequeue();
        //System.out.println(q.isEmpty());
        //q.display();
    }
    
}
