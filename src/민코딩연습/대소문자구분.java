package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 대소문자구분 {

	static char[] munja = new char[5];
	static int[] idx = new int[5];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		for (int i = 0; i < 5; i++) {

			 munja[i] = (char)(strin.parseInt(st.nextToken()));

		}
		
		int d = -1;

		
		int cnt = 0;
		for (int i = 0; i < 5; i++) {

			if (munja[i] == 'A') {
				cnt++;
				idx[i] = 1;
			}

		}

		System.out.println("문자A는" + cnt + "개발견");

		for (int j = 0; j < 5; j++) {

			if (idx[j] == 1) {
				System.out.println(j + "번");
			}
		}

	}

}
