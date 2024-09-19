package DivideAndConquer;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,8,60,5,9};
int ans[]=sol(arr,0,arr.length-1);
for(int i=0;i<ans.length;i++)
{
	System.out.print(ans[i]+" ");
}
	}
	public static int[] sol(int arr[],int lo,int hi)
	{
		if(lo==hi)
		{
			int ans[]=new int[1];
			ans[0]=arr[lo];
		return ans;
		}
		int mid=(lo+hi)/2;
		int left[]=sol(arr,lo,mid);
		int right[]=sol(arr,mid+1,hi);
		int res[]=sort(left,right);
		return res;
	}
	public static int[] sort(int a[],int b[])
	{
		int res[]=new int[a.length+b.length];
		int i=0;
		int j=0;
		int k=0;
		while(i<a.length&&j<b.length)
		{
			if(a[i]>b[j])
			{
				res[k]=b[j];
				j++;
				k++;
			}
			else {
				res[k]=a[i];
				i++;
				k++;
			}
		}
//		ho skta h i last  tk phoch gya ho pr j nhi phocha ho
while(j<b.length)
{
	res[k]=b[j];
	j++;
	k++;
}
while(i<a.length)
{
	res[k]=a[i];
	i++;
	k++;
}
//		ho skta h j last tk phoch ya ho pr i nhi phocha ho;
		
		return res;
	}


}
