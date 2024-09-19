package Backtracking;

public class AllPaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[3][3];
//boolean visited[][]=new boolean[3][3];
		int ans = sol(arr, 0, arr.length - 1, 0, arr[0].length - 1, new boolean[3][3], "");
		System.out.println(ans);
	}

	public static int sol(int arr[][], int cr, int er, int cc, int ec, boolean visited[][], String ans) {
		// up down left right;
		if (cr == er && cc == ec) {
			System.out.println(ans);
			return 1;
		}
		if (cr < 0 || cc < 0 || cc > ec || cr > er || visited[cr][cc] == true) // iska mtlb aap grid se bhr aagye
		{
			return 0;
		}
		visited[cr][cc] = true;
		int cnt = 0;
//		up
		cnt += sol(arr, cr - 1, er, cc, ec, visited, ans + "U ");

//		down
		cnt += sol(arr, cr + 1, er, cc, ec, visited, ans + "D ");

//		left
		cnt += sol(arr, cr, er, cc - 1, ec, visited, ans + "L ");
//	right
		cnt += sol(arr, cr, er, cc + 1, ec, visited, ans + "R ");
		visited[cr][cc]=false;
		return cnt;
	}

}
