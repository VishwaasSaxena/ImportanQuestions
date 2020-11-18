import java.util.Scanner;

public class NegativeSide {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[c];
                arr[c]=temp;
                c++;
            }
        }
        for(int item:arr){
            System.out.print(item+" ");
        }
    }
    
}
