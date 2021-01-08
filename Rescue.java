import java.util.Scanner;

public class Rescue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        sc.nextLine();
        String s;
        s=sc.nextLine();
        int f[]=new int[26];
        for(int i=0;i<26;i++){
            f[i]=0;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            f[ch-'a']++;
        }
        String temp="";
        for(int i=0;i<f.length;i++){
            if(f[i]!=0){
                if(f[i]%k!=0){
                    System.out.println(-1);
                    return;
                }else{
                    int sO=f[i]/k;
                    for(int j=0;j<sO;j++){
                        temp+=(char)(i+97);
                    }

                }
            }
        }
        String result="";
        for(int i=0;i<k;i++){
            result+=temp;
        }
        System.out.println(result);

    }
    
}
