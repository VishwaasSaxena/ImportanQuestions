import java.util.Scanner;

public class Watermelon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w;
        int c=0;
        w=sc.nextInt();
        for(int i=1;i<=w;i++){
            for(int j=1;j<=w;j++){
                if(i%2==0 && j%2==0){
                    if(i+j==w){
                        //System.out.println(i+" "+j);
                        c++;
                    }
                }
            }
        }
        if(c>0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}
