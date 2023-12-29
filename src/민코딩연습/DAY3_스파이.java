package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DAY3_스파이 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static ArrayList<Integer>[] al;

	public static void main(String[] args) throws IOException {
		int DAT[] = { 0, 1004, 1680, 9941, 3367, 3261, 2976, 4889, 1234, 6461, 7329, 5518 };
		// index : 사람 번호, value : 해당 사람의 사번

		int num = 0; // 찾고 싶은 사람 번호
		int input = Integer.parseInt(br.readLine()); // 사번 입력받기
		for (int i = 1; i <= 11; i++)
			if (input == DAT[i]) // input과 같은 사번을 갖는 사람 찾기
				num = i;
		if (num == 0) // 없는 사번이면 no person
			System.out.println("no person");
		else { // 있는 사번일 때만 보스, 동료, 부하를 찾는다.
			al = new ArrayList[12];
			for (int i = 0; i < 12; i++)
				al[i] = new ArrayList<>();
			// 저장할 ArrayList만들기

			al[1].add(2);
			al[1].add(3);
			al[2].add(4);
			al[2].add(5);
			al[3].add(6);
			al[3].add(7);
			al[5].add(8);
			al[5].add(9);
			al[6].add(10);
			al[6].add(11);

			int boss = -1;
			for (int from = 1; from <= 11; from++)
			// from이 직속 상사라고 가정
			{
				for (int i = 0; i < al[from].size(); i++) {
					int to = al[from].get(i);
					if (to == num) {
						boss = from;
					}
				}
			} // 직속 상사 찾기
			if (boss == -1)
				System.out.println("no boss");
			else
				System.out.println(DAT[boss]);

			if (boss == -1)
				System.out.println("no company");
			else {
				int company = -1;
				for (int i = 0; i < al[boss].size(); i++) {
					int to = al[boss].get(i);
					if (to != num)
						company = to;
				} // 동료 찾기
				System.out.println(DAT[company]);
			}

			if (al[num].size() == 0)
				System.out.println("no junior");
			else {
				for (int i = 0; i < al[num].size(); i++) {
					int to = al[num].get(i); // 부하직원
					System.out.print(DAT[to] + " ");
				}
			}

		}
	}
}