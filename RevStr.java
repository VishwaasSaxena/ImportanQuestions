//Reverse a String using recursion
public class RevStr{
    public static void main(String[] args) {
        String s="Vishwaas";
        revStr(s); 
    }

    public static void revStr( String s ){
        if(s==null || s.length()<=1){
            System.out.print(s);
        }else{
            System.out.print(s.charAt(s.length()-1));
            revStr(s.substring(0,s.length()-1));

        }
    }
}