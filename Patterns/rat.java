package Patterns;

import java.util.Scanner;

public class rat {
//	OXOO
//	OOOX
//	XOXO
//	XOOX
//	XXOO
	public static void main(String args[]) {
int i=0;
do {
	System.out.println("Hello");
	i++;
}
while(i<10);

		int arr[][]= {{0,1,0,0},{0,0,0,1},{1,0,1,0},{1,0,0,1},{1,1,0,0}};
Scanner scn=new Scanner(System.in);
char a[]=new char[5];
	}
//for(int i=0;i<a.length;i++)
//{
//	char ch=scn.next().charAt(0);
//	a[i]=ch;
//}
//for(int i=0;i<a.length;i++)
//{
//	System.out.print(a[i]+" ");
//}
//		sol(arr, 0, arr.length - 1, 0, arr[0].length - 1,new boolean[arr.length][arr[0].length],"");
//	}

	public static void sol(int arr[][], int cr, int er, int cc, int ec,boolean visited[][],String ans) {
		
		if (cr < 0 || cc < 0 || cr >= arr.length || cc >= arr[0].length || arr[cr][cc] == 1||visited[cr][cc]==true) {
			return;
		}
		if (cr == er && cc == ec) {
			System.out.println(ans);
		}
		visited[cr][cc]=true;
//		u d l r
		sol(arr, cr - 1, er, cc, ec,visited,ans+"U ");
		sol(arr, cr + 1, er, cc, ec,visited,ans+"D ");
		sol(arr, cr, er, cc - 1, ec,visited,ans+"L ");
		sol(arr, cr, er, cc + 1, ec,visited,ans+"R ");
	
	}

}
