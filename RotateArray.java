import java.util.Scanner;

public class RotateArray {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Emter the number of elements");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //int temp=arr[n];
        
        for(int j=1;j<=2;j++){
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
        //arr[0]=temp;
        System.out.println("The rotated array is");
        for(int item:arr){
            System.out.print(item+" ");
        }
        
    }
    
}
