package 민코딩연습;

import java.io.IOException;
import java.io.InputStreamReader;

import java.io.*;

public class DAY2_네글자 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String S;
	static int n;
	static char[] munja;
	static char[] path;
	static int cnt;
	static int[] visited;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		S = br.readLine();
		n = S.length();
		munja = new char[n];
		path = new char[n];
		for (int i = 0; i < n; i++) {
			char ch = S.charAt(i);
			munja[i] = ch;
		}

		dfs(0);
		System.out.println(cnt);

	}

	static void dfs(int now) {

		if (now == n) {
			for (int k = 0; k < n; k++) {	
			   
				System.out.print(path[k] + " ");

			}
			cnt++;
			System.out.println("");
			return;
		}

		for (int i = 0; i < 4; i++) {
			int next =i;
			
     	
			path[now] = munja[i];
			dfs(now + 1);
		
		}

	}

}
