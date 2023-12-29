package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day2_주사위던지기 {

	static int N, M;
	static int[] path;
	static int[] visited;
	static int[] sum;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		path = new int[N];
		visited = new int[256];
		sum = new int[256];

		if (M == 1)
			type1(0);
		if (M == 2)

			type2(0);
		if (M == 3)
			type3(0);

	}

	static void type1(int now) {

		if (now == N) {
			for (int k = 0; k < N; k++) {
				System.out.print(path[k] + " ");
			}
			System.out.println("");
			return;
		}

		for (int i = 1; i <= 6; i++) {
			path[now] = i;
			type1(now + 1);
		}
	}

	// 중복되지 않으며 작은 숫자만 표기한다.
	static void type2(int now) {
		if (now == N) {
			for (int k = 0; k < N; k++) {
				System.out.print(path[k] + " ");
			}
			System.out.println("");
			return;
		}

		for (int i = 1; i <= 6; i++) {
			if (now > 0 && path[now - 1] > i)
				continue;
			path[now] = i;
			type2(now + 1);
		}
	}

// 모두 다른수가 나올수 있는 경우
	static void type3(int now) {

		if (now == N) {
			for (int k = 0; k < N; k++) {
				System.out.print(path[k] + " ");
			}
			System.out.println("");
			return;
		}

		for (int i = 1; i <= 6; i++) {
			if (visited[i] == 1)
				continue;
			path[now] = i;
			visited[i] = 1;

			type3(now + 1);

			visited[i] = 0;
			path[now] = 0;
		}
	}

}