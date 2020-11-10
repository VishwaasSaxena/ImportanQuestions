import java.util.Scanner;
import java.util.Stack;

public class TwoStackImp {
    //Implement Queue using Two Stacks
    static Stack <Integer> s1=new Stack<>();
    static  Stack<Integer> s2=new Stack<>();
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int item;
        System.out.println("Enter the items");
        for(int i=1;i<5;i++){
            item=sc.nextInt();
            enQueue(item);
        
        }
        System.out.println(s1.pop());
        deQueue();



    }
    static void enQueue(int item){
        s1.push(item);
    }
    static void deQueue(){
       
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        System.out.println(s2.pop());
        
    }
    
}
