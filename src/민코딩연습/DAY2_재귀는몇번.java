package ¹ÎÄÚµù¿¬½À;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DAY2_Àç±Í´Â¸î¹ø {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int cnt;
	static int branch;
	static int level;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		StringTokenizer st = new StringTokenizer(br.readLine());

		branch = Integer.parseInt(st.nextToken());
		level = Integer.parseInt(st.nextToken());
		cnt = 0;
		if (level == 2) {
			dfs1(0);
			System.out.println(cnt);
		} else {
			dfs2(0);
			System.out.println(cnt);
		}
	}

	static void dfs1(int n) {

		if (n > level) {

			return;
		}
		cnt++;
		dfs1(n + 1);
		dfs1(n + 1);
		dfs1(n + 1);

	}

	static void dfs2(int n) {

		if (n > level) {
			return;
		}
		cnt++;
		dfs2(n + 1);
		dfs2(n + 1);
		dfs2(n + 1);
		dfs2(n + 1);

	}

}
