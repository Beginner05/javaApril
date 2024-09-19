package DivideAndConquer;

import java.util.Arrays;
import java.util.Scanner;

public class Alex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
int n=scn.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++) {
	arr[i]=scn.nextInt();
}
int q=scn.nextInt();
Arrays.sort(arr);
while(q-->0)
{
	int paise=scn.nextInt();
	int item=scn.nextInt();
	int ip=0;
	for(int i=0;i<arr.length;i++)
	{
		if(paise<arr[i])
		{
			break;
		}
		else {
		if(paise%arr[i]==0)
		{
			ip++;
		}
		}
	}
	if(ip>=item)
	{
		System.out.println("Yes");
	}
	else {
		System.out.println("NO");
	}
}
	}

}
