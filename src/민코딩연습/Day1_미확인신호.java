package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day1_미확인신호 {

	static String S;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; test_case++) {
			int m = Integer.parseInt(br.readLine());

			S = br.readLine();
			int n = S.length(); // 문자열의 길이 가져오기

			int DAT[] = new int[256];
			// index : 문자 번호(ascii), value : 해당 문자가 몇 번 나왔는가?

			int flag = 0; // 잘못됐으면 1, 정상이면 0

			// 사전 세팅, m - 1개 구간에 대한 처리
			for (int i = 0; i < m - 1; i++) {
				char ch = S.charAt(i);
				// String.charAt(index) => String에서 index번째 문자를 가져온다.
				// 반환 : char
				DAT[ch] += 1; // ch라는 문자가 1개 추가됐다!

				// if(ch라는 문자가 추가되면서 2개 이상이 되었는가?)
				// flag = 1; // 잘못됐다!
				if (DAT[ch] >= 2) {
					flag = 1;
				}

			}
			int d = -1;

			for (int i = 0; i <= n - m; i++) {
				// i ~ i+m-1구간 (m개의 구간 완성)
				char e = S.charAt(i + m - 1);
				DAT[e] += 1;

				if (DAT[e] >= 2) {
					flag = 1;
				}
				// ---처리--
				// 이번에 추가된 e라는 문자가 2개 이상이 되었는가?
				// 잘못됐다.
				// if (이번에 추가된 e라는 문자가 2개 이상이 되었는가?)
				// flag = 1;

				// 다음구간을 준비, 맨 앞의 data 삭제
				char s = S.charAt(i);
				DAT[s] -= 1;
			}
			if (flag == 1) {
				System.out.println("#" + test_case + " " + "FAIL");
			} else {
				System.out.println("#" + test_case + " " + "PASS");
			}
		}
	}
}