package DivideAndConquer;

public class Mergesort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=10;
int b=20;
int max=a>b?a:b;
System.out.println(max);
		int arr[]= {4,8,23,0,1,0,-9,13};
int res[]=sort(arr,0,arr.length-1);
	for(int val:res)
	{
		System.out.print(val+" ");
	}
	}
	public static int [] sort(int arr[],int lo,int hi)
	{if(lo==hi)
	{
		int res[]=new int[1];
		res[0]=arr[lo];
		return res;
	}
		int mid=(lo+hi)/2;
		int left[]=sort(arr,lo,mid);
		int right[]=sort(arr,mid+1,hi);
	int res[]= merge(left,right);
	return res;
	}
public static int[] merge(int left[],int right[])
{
int res[]=new int[left.length+right.length];	
int i=0;
int j=0;
int k=0;
while(i<left.length&&j<right.length)
{
	if(left[i]>right[j])
	{
		res[k]=right[j];
		j++;
		k++;
	}
	else {
		res[k]=left[i];
		i++;
		k++;
	}
}
while(i<left.length)
{
	res[k]=left[i];
	i++;
	k++;
}
while(j<right.length)
{
	res[k]=right[j];
	j++;
	k++;
}
return res;

}
}

