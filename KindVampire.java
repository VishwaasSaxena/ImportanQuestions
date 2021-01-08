import java.util.Arrays;
import java.util.Scanner;

public class KindVampire {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        int chances=1, diam=0;
        for(int i=0;i<n;i++){
            if(b[i]!=0){
                chances=chances-1;
                chances=chances+b[i];
                diam=diam+a[i];
                a[i]=0;
            }
        }
        int j=n-1;
        Arrays.sort(a);
        while(chances!=0 && j>=0){
            diam+=a[j];
            j--;
            chances--;
        }
        System.out.println(diam);
        
    }
    
}
