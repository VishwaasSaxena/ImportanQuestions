import java.util.Scanner;

public class Majority {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,x,y;
        n=sc.nextInt();
        x=sc.nextInt();
        y=sc.nextInt();
        double temp=((double)y *(double)n)/100;
        int required=(int)(Math.ceil(temp));
        if(x>=required){
            System.out.println(0);
        }else{
            System.out.println(required-x);
        }

    }
    
}
