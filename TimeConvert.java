import java.util.Scanner;

public class TimeConvert {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String time=sc.nextLine();
        //System.out.println(time);
        String cTime="";
        String report=sc.nextLine();
        String t=helper(report);
        //System.out.println((time.substring(0,2)));
        String t1=helper(time.substring(0,8));
        String t2=helper(time.substring(9,time.length()));
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t);
        if(t.compareTo(t1)>=0 && t.compareTo(t2)<=0){
            System.out.println(1);
        }else if(t1.compareTo(t2)==0){
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }
        

    }
    public static String helper(String time){
        String cTime="";
        if(time.substring(6,time.length()).equals("PM")){
            if(!(time.substring(0,2).equals("12"))){
               cTime=String.valueOf(Integer.valueOf(time.substring(0,2))+12)+time.substring(2, time.length()-2);
                //System.out.println(cTime);
            }else{
                cTime="12"+time.substring(2, time.length()-2);
            }
        }else if(time.substring(6,time.length()).equals("AM")){
            if(time.substring( 0,2 ).equals("12")){
                cTime="00"+time.substring(2, time.length()-2);
                //System.out.println(cTime);
            }else{
                cTime=time.substring(0,time.length()-2);
                //System.out.println(cTime);
            }
        }
        return cTime;
    }
    
}
