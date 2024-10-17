package OOPS;

public class ConstructStack {
//top of stack
	int arr[] = new int[5];
	int tos = -1;
	int size = 0;
	int cap = arr.length;

	public void push(int val) {
		if (isFull()) {
			System.out.println("Stack full h bhai");
			return;
		}
		tos++;
		arr[tos] = val;
//	System.out.println("value added successfully"+ val);
		size++;
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack khali h ");
			return -1;
		}
		int temp = arr[tos];
		size--;
		tos--;
		return temp;
	}
public int peek()
{
	if(isEmpty())
	{
		System.out.println("bhai stack khali h kya he peek krun");
		return -1;
	}
	return arr[tos];
}
public void display()
{
	for(int i=tos;i>=0;i--)
	{
		System.out.print(arr[i]+" ");
	}
}
	public boolean isFull() {

		return cap == size;
	}

	public boolean isEmpty() {
		return tos == -1;
	}
}
