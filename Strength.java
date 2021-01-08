import java.util.Arrays;
import java.util.Scanner;

public class Strength {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,k;
        n=sc.nextInt();
        k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        if(a[0]+k<=100){
            a[0]=a[0]+k;
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
        }
        System.out.println((int)Math.floor(sum/10));
        
    }
    
}
