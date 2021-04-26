import java.util.Scanner;

public class MonkStrings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //sc.nextLine();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextLine();
        }
        String str="";
        str=sc.nextLine();
        int len=arr.length;
        for(int i=0;i<n;i++){
            str+=arr[i];
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String temp=str.substring(0, i+1);
            System.out.println(findDistinct(temp, ch));
        }
        //System.out.println(result);
    }
    static int findDistinct(String str, char ch){
        int c=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<ch){
                c++;
            }
        }
        return c;
    }
    
}
