import java.util.Scanner;

public class EqIndex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  n;
        n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sum"+" "+ sum);
        int leftSum=0;
        int pos=0;
        for(int i=0;i<n;i++){
            
            sum=sum-arr[i];
            if(sum==leftSum){
                pos=i;
            }
            leftSum+=arr[i];
            
        }
        System.out.println("The positions is "+pos+" ");
    }
}
