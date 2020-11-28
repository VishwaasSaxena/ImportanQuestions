import java.util.Scanner;

public class PrefixQueries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int preSum[]=new int[n];
        preSum[0]=arr[0];
        for(int i=1;i<n;i++){
            preSum[i]=preSum[i-1]+arr[i];
        }
        int q;
        System.out.println("enter the number of queries");
        q=sc.nextInt();
        while(q--!=0){
            int l,r;
            l=sc.nextInt();
            r=sc.nextInt();
            int sum=0;
            if(l==0){
                sum=preSum[r];
            }else{
                sum=preSum[r]-preSum[l-1];
            }
            System.out.println(sum+" ");
        }
    }
    
}
