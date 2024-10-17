package OOPS;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//is wali cls me mujhe intro class ka fun() method use krna h

ConstructStack s=new ConstructStack();
System.out.println(s.peek());
s.push(10);
s.push(20);
s.push(30);
s.pop();
s.pop();
s.push(40);
s.display();
		
	}
}