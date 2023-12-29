package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N의뱁수인숫자찾기 {

	static int[][] ar = { { 3, 5, 14 }, { 2, 3, 9 }, { 6, 2, 7 } };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = Integer.parseInt(br.readLine());

		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

				if (ar[i][j] % input == 0) {
					cnt++;
				}

			}
		}

		System.out.println(cnt);

	}

}
