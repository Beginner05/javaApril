package DivideAndConquer;

public class MergeTwoSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]= {1,4,5};
int b[]= {1,4,67};
int res[]=sol(a,b);
	for(int i=0;i<res.length;i++)
	{
		System.out.print(res[i]+" ");
	}
	}
	public static int[] sol(int a[],int b[])
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
