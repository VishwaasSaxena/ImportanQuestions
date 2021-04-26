import java.util.Arrays;
import java.util.Scanner;

public class Contest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        if(n%2==1){
            int mid=a[n/2];
            System.out.println(mid);
            int sum=0;
            for(int i=0;i<n;i++){
                sum+=Math.abs(mid-a[i]);
                //System.out.println(sum);
            }
            System.out.println(sum);
        }else{
            int midI=a[n/2];
            int midF=a[n/2-1];
            int sumI=0,sumF=0;
            for(int i=0;i<n;i++){
                sumI+=Math.abs(midI-a[i]);
                sumF+=Math.abs(midF-a[i]);
            }
            System.out.println(Math.min(sumI, sumF));
        }
    }
}
