import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in the array");
        n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        insertionSort(arr,n);
        for(int item:arr){
            System.out.print(item+" ");
        }
    }
    public static void insertionSort(int arr[],int n){
        int i,key,j;
        for(i=1;i<n;i++){
            key=arr[i];
            j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
    }
}
