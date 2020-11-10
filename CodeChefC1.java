import java.util.*;


public class CodeChefC1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t,n;
        List<Integer> result=new ArrayList<>();
        //System.out.println("Enter the number of test cases");
        t=sc.nextInt();
        while(t--!=0){
           // System.out.println("Enter the number of dishes");
            n=sc.nextInt();
           
            int C[]=new int[n];
            for(int i=0;i<n;i++){
                C[i]=sc.nextInt();
            }
            Arrays.sort(C);
            int b1=C[C.length-1];
            int b2=0;
            for(int i=C.length-2;i>=0;i--){
                if(b1<=b2){
                    b1+=C[i];
                }else if(b2<=b1){
                    b2+=C[i];
                }/*else if(b1==b2){
                    b1+=C[i];
                }*/
            }
            //System.out.println("The number of minutes="+b1);
            result.add(b1);

        }
        for (int item:result){
            System.out.println(item);

        }
    }
    
}
