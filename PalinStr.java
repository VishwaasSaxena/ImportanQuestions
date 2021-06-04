public class PalinStr {
    public static void main(String[] args) {
        String s="hannah";
        System.out.println(iPalin(s));
    }
    public static boolean iPalin(String s){
        boolean b=false;
        int i=0,j=s.length();
        if(i<j-1){
        if(s.charAt(i)==s.charAt(j-1)){
            iPalin(s.substring(i++,j--));
            b=true;
        }else{
             return false;
        }
    }return b;

    }
    
}
