import java.util.*;

class TestClass {
    public static void main(String args[] ) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t;
        t=sc.nextInt();
        while(t--!=0){
            int n,k;
            n=sc.nextInt();
            k=sc.nextInt();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            int arr[]=new int[n];
            int c=0;
            for(int i=0;i<k;i++){
                arr[i]=a[n-k+i];
            }
             for(int i=k;i<n;i++){
                arr[i]=a[c];
                c++;
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }


        }


    }
}
