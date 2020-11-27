import java.util.Scanner;

public class KadaneA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the number of elements");
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int result=maxSub(a, n);
        System.out.println("The max sum is ="+ result);
    }
    public static int maxSub(int arr[], int n){
        int lMax=arr[0],gMax=arr[0];
        for(int i=1;i<n;i++){
            lMax=Math.max(arr[i], lMax+arr[i]);
            if(lMax>gMax){
                gMax=lMax;
            }
        }
        return gMax;

    }
    
}
