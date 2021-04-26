import java.util.Stack;

public class NGE {
    public static void main(String[] args) {
        int a[]={13, 7 , 6, 12};
        Stack <Integer> temp=new Stack<>();
        
        for(int i=0;i<a.length;i++){
            temp.push(a[i]);
            int c=i;
            while(c!=a.length-1){
                if(a[c]>temp.peek()){
                    System.out.println(temp.peek()+" ->"+" "+ a[c]);
                    temp.pop();
                }
                c++;
            }
            
        }
        

    }
}
