//checking again
public class StackImp {
    public static void main(String[] args) {
        LinkedlistStack st=new LinkedlistStack();
        st.push(20);
        st.push(10);
        st.push(30);
        st.push(40);
        st.push(100);
       int x= st.peek();
       System.out.println("The element at the top is="+x);
        st.pop();
        st.display();
    }
    
}
