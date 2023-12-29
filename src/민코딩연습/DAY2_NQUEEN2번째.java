package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DAY2_NQUEEN2번째 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N;
	static int cnt;
	static int[] COL;
	static int[] LU_RD;
	static int[] RU_LD;

	public static void main(String[] args) throws IOException {

		N = Integer.parseInt(br.readLine());

		COL = new int[N];
		LU_RD = new int[N * 2];
		RU_LD = new int[N * 2];

		func(0);
		System.out.println(cnt);
	}

	static void func(int row) {
		if (row == N) {
			cnt += 1;
			return;
		}

		for (int i = 0; i < N; i++) {
			if (COL[i] == 1)
				continue;
			if (LU_RD[i - row + N] == 1)
				continue;
			if (RU_LD[i+row] == 1)
				continue;
			LU_RD[i - row + N] = 1;
			RU_LD[i+row] =1;
			COL[i] = 1;
			func(row + 1);
			COL[i] = 0;
			LU_RD[i - row + N] = 0;
			RU_LD[i+row]=0;
		}
	}
}