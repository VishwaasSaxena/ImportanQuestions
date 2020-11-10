 /* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc=new Scanner(System.in);
        int t,n;
        t=sc.nextInt();
        while(t--!=0){
            n=sc.nextInt();
            int C[]=new int[n];
            for(int i=0;i<n;i++){
                C[i]=sc.nextInt();
            }
            Arrays.sort(C);
            int b1=C[C.length-1];
            int b2=0;
            for(int i=C.length-2;i>=0;i--){
                if(b1<=b2){
                    b1+=C[i];
                }else if(b2<=b1){
                    b2+=C[i];
                }
            }
            if(b1>b2)
            System.out.println(b1);
            else
            System.out.println(b2);
        }
    
	}
}

