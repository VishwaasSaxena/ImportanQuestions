import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Companion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String str=sc.nextLine();
        Set<String> temp=new HashSet<>();
        Set <String> temp2=new HashSet<>();
        for(int i=0;i<st.length();i++){
            for(int j=i+1;j<=st.length();j++){
                temp.add(st.substring(i,j));
            }
        }
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<=str.length();j++){
                temp2.add(str.substring(i,j));
            }
        }
        //System.out.println(temp);
        //System.out.println(temp2);
        if(temp.size()==temp2.size()){
            System.out.println("Companion");
        }else{
            System.out.println("Not companion");
        }
        }
    
}
