package OOPS;

public class Intro {
	int a = 10;
	static int b = 20; // static variable h

	static { // static block h
		System.out.println(10+ b); // 30

	}
	static int c=30;
	{
		System.out.println("Instance block");
		
	}
	public static void main(String args[]) // static function
	{
		System.out.println("Hello");

	}

	public static void fun() {
		System.out.println("fun");
	}
	public static void fun2()
	{
		System.out.println("fun2 ");
	}
	public void fun3()
	{
		System.out.println("fun3");
	}
}
