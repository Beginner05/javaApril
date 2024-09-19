package DivideAndConquer;
import java.util.Scanner;
public class Maximumpathsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int tc=scn.nextInt();
while(tc-->0)
{
	int n=scn.nextInt();
	int m=scn.nextInt();
	int a[]=new int[n];
	int b[]=new int[m];
	for(int i=0;i<a.length;i++)
	{
		a[i]=scn.nextInt();
	}
	for(int i=0;i<b.length;i++)
	{
		b[i]=scn.nextInt();
	}
int ans=	sol(a,b);
System.out.println(ans);
}
	}
public static int sol(int a[],int b[])
{
int i=0;
int j=0;
int s1=0;
int s2=0;
int ans=0;
while(i<a.length&&j<b.length)
{
if(a[i]>b[j])
{
	s2+=b[j];
	j++;
}
else if(a[i]<b[j])
{
	s1+=a[i];
	i++;
}
else {
	ans+=Math.max(s1, s2)+b[j];
	i++;j++;
s1=0;s2=0;
}
}
while(i<a.length)
{
	s1+=a[i];
	i++;
}
while(j<b.length)
{
	s2+=b[j];
	j++;
}
	return ans+Math.max(s1, s2);
}
	

}
