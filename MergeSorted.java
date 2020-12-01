import java.util.Scanner;
//some minor changes made
public class MergeSorted {
    public static void main(String[] args) {
        int n,m;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int a1[]=new int[n];
        int a2[]=new int[m];
        for(int i=0;i<n;i++){
            a1[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            a2[i]=sc.nextInt();
        }
        int merged[]=new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(a1[i]<a2[j]){
                merged[k]=a1[i];
                k++;
                i++;
            }else if(a1[i]>a2[j]){
                merged[k]=a2[j];
                j++;
                k++;
            }
        }
        while(i<n){
            merged[k]=a1[i];
            k++;
            i++;
        }
        while(j<m){
            merged[k]=a2[j];
            k++;
            j++;
        }
        for(int item: merged){
            System.out.print(item+" ");
        }
        
    }
    
}
