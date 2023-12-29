package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class level9_3 {

	
	static char[][] ar = { { 'A', 'B', 'C', 'D', 'E' }, { 'E', 'A', 'B', 'A', 'B' }, { 'A', 'C', 'D', 'E', 'R' } };

	static int cnt1, cnt2;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char word1 = (char) br.read();
		char word2 = (char) br.read();
		cnt1 = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {

				if (ar[i][j] == word1)
					cnt1++;

			}

		}

		cnt2 = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {

				if (ar[i][j] == word1)
					cnt2++;

			}

		}

		if (cnt1 >= 1 && cnt2 >= 1) {
			System.out.println("와2개");

		} else if (cnt1 >= 1 || cnt2 <= 2) {
			System.out.println("오1개");
		} else {
			System.out.println("우0개");
		}
	}

}
