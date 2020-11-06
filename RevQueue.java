import java.util.*;

public class RevQueue{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        Queue<Integer> q=new LinkedList<>();
        int n,item;
        System.out.println("Enter the number of elements");
        n=sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter the element");
            item=sc.nextInt();
            q.add(item);
        }
        System.out.println(q);
        //System.out.println(q.remove());
        Stack <Integer> rev=new Stack<>();
        while(!q.isEmpty()){
            rev.push(q.remove());
        }
        Queue<Integer> reversed=new LinkedList<>();
        while(!rev.isEmpty()){
            reversed.add(rev.pop());
        }
        System.out.println("Reversed Queue: ");
        System.out.print(reversed);



        
    }
}