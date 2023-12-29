package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DAY2_좋은수열 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int N;
	static int DAT;
	static int[] path;
	static int cnt;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		N = Integer.parseInt(br.readLine());
		path = new int[N];
		DAT = 0;

		func(0);

	}

	static int flag = 0; // N자리 좋은 자리를 찾았는가?

	static void func(int now) {

		if (flag == 1) {
			return;
		}

		if (now == N) {
			for (int i = 0; i < N; i++) {
				System.out.print(path[i]);
			}
			DAT = 1;
			return;
		}

		for (int i = 1; i <= 3; i++) {

			path[now] = i;
			if (is_bad(now))
				continue;
			func(now + 1);
			if (DAT == 1)
				return;
			path[now] = 0;
		}

	}

	static boolean is_bad(int now) {

		for (int len = 1; len <= ((now + 1) / 2); len++) {
			cnt = 0;
			for (int i = 0; i < len; i++)
				if (path[now - len - i] == path[now - i]) {
					cnt++;
				}
			if (cnt == len) {
				return true;
			}

		}
		return false;
	}
}
