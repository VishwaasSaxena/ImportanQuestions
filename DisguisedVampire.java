import java.util.Scanner;

public class DisguisedVampire {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int cE=0, cO=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                cE++;
            }else{
                cO++;
            }
        }
        if(cE>1){
            for(int i=0;i<n;i++){
                if(a[i]%2==1){
                    System.out.println(i+1);
                }
            }
        }else{
            for(int i=0;i<n;i++){
                if(a[i]%2==0){
                    System.out.println(i+1);
                }
            }
        }
    }
    
}
