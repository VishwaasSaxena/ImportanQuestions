import java.util.*;
//max length of subarray with 0 sum.
public class MaxLenSub {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]={15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(maxLen(a, 8));
        
    }
    public static int maxLen(int a[],int n){
        HashMap<Integer, Integer> temp=new HashMap<>();
        int maxLen=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=a[i];
            if(sum==0){
                maxLen=i+1;
            }
            if(!temp.containsKey(sum)){
                temp.put(sum,i);
            }else{
                int prev=temp.get(sum);
                maxLen=Math.max(maxLen, i-prev);
            }
        }
        return maxLen;
    }
}
