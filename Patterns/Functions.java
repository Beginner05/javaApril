package Patterns;
import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;

public class Functions {
	public static void main(String args[]) {
Scanner scn=new Scanner(System.in);
		HashMap<Character,Integer>map=new HashMap();
		String s1=scn.next();
		String s2=scn.next();
		for(int i=0;i<s1.length();i++)
		{
		
				map.put(s1.charAt(i),0);	
		}

		for(int i=0;i<s2.length();i++)
		{
			if(map.containsKey(s2.charAt(i))==true)
			{
			map.put(s2.charAt(i), map.getOrDefault(s2.charAt(i),0)+1);
			}
			else {
				System.out.print(s2.charAt(i)+" ");
			}
		}
//		System.out.println(map);
		boolean flag=false;
		for(char key:map.keySet())
		{
			if(map.get(key)==0)
			{
				System.out.print(key+" ");
			flag=true;
			}
		}
		if(!flag)
		{
			System.out.print("-1");
		}
		
	}
}

