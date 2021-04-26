import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t--!=0){
            int x=sc.nextInt();
            if(x>6){
                System.out.println(x-6);
            }
            else if(x==12) {
                System.out.println(6);
            }
            else if(x<6){
                System.out.println(x+6);
            }  
         }
        
    }
}