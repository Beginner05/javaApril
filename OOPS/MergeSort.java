package OOPS;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {4,7,0,1,17};

int res[]=sol(arr,0,arr.length-1);
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(res[i]+" ");
	}
	}
	public static int[] sol(int arr[],int lo,int hi)
	{
		if(lo==hi)
		{
			int res[]=new int[1];
			res[0]=arr[lo];
			return res;
		}
		int mid=(lo+hi)/2;
		int left[]=sol(arr,lo,mid);
		int right[]=sol(arr,mid+1,hi);
	return sort(left,right);
	}
public static int[] sort(int left[],int right[])
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
		}
		else {
			res[k]=left[i];
		i++;
		}
		k++;
	}
//	ho skta h i leftki length tk phoch gya ho
	while(j<right.length)
	{
		res[k]=right[j];
		k++;
		j++;
	}
	while(i<left.length)
	{
		res[k]=left[i];
		i++;
		k++;
	}
	return res;
}
}
