package DivideAndConquer;
import java.util.ArrayList;
public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer>list=new ArrayList();
list.add(10);
list.add(20);
System.out.println(list.size());
System.out.println(list);
list.add(0, 5);
System.out.println(list);
for(int i=0;i<list.size();i++)
{
	System.out.println(list.get(i));
}
}
}