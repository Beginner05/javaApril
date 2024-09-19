package Codechef.Div4;
import java.util.Scanner;
public class Cards {
	    public static void main(String args[])
	    {
	        Scanner scn=new Scanner(System.in);
	        int tc=scn.nextInt();
	        while(tc-->0)
	        {
	            int a[]=new int[2];
	            int b[]=new int[2];
	            a[0]=scn.nextInt();
	            a[1]=scn.nextInt();
	            b[0]=scn.nextInt();
	            b[1]=scn.nextInt();
	            int cnt=0;
	            if(a[0]>b[1])
	            {
	                cnt+=1;
	            }
	            if(a[0]>b[1])
	            {
	                cnt+=1;
	            }
	            if(a[1]>b[0])
	            {
	                cnt+=1;
	            }
	            if(a[1]>b[1])
	            {
	                cnt+=1;
	            }
	            System.out.println(cnt);
	        }
	    }
	}
