package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day1_추가6 {

	static int[] money = { 1, 2, 3, 3, 5, 1, 0, 1, 3 };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int size = Integer.parseInt(br.readLine());

		int min = Integer.MAX_VALUE;

		if (size == 1) {

			for (int i = 0; i < 9; i++) {
				int sum = money[i];
				if (sum < min) {
					min = sum;
				}

			}
		}

		if (size == 2) {

			for (int i = 0; i < 8; i++) {
				int sum = money[i + 1] + money[i];
				if (sum < min) {
					min = sum;
				}

			}
		}

		if (size == 3) {

			for (int i = 0; i <7; i++) {
				int sum = money[i + 2] + money[i + 1] + money[i];
				if (sum < min) {
					min = sum;
				}

			}
		}

		if (size == 4) {

			for (int i = 0; i < 6; i++) {
				int sum = money[i + 3] + money[i + 2] + money[i + 1] + money[i];
				if (sum < min) {
					min = sum;
				}

			}
		}

		if (size == 5) {

			for (int i = 0; i < 5; i++) {
				int sum = money[i + 4] + money[i + 3] + money[i + 2] + money[i + 1] + money[i];
				if (sum < min) {
					min = sum;
				}

			}
		}

		if (size == 6) {

			for (int i = 0; i < 4; i++) {
				int sum = money[i + 5] + money[i + 4] + money[i + 3] + money[i + 2] + money[i + 1] + money[i];
				if (sum < min) {
					min = sum;
				}

			}
		}

		if (size == 7) {

			for (int i = 0; i < 3; i++) {
				int sum = money[i + 6] + money[i + 5] + money[i + 4] + money[i + 3] + money[i + 2] + money[i + 1]
						+ money[i];
				if (sum < min) {
					min = sum;
				}

			}
		}

		if (size == 8) {

			for (int i = 0; i < 2; i++) {
				int sum = money[i + 7] + money[i + 6] + money[i + 5] + money[i + 4] + money[i + 3] + money[i + 2]
						+ money[i + 1] + money[i];
				if (sum < min) {
					min = sum;
				}

			}
		}

		if (size == 9) {

			for (int i = 0; i < 1; i++) {
				int sum = money[i + 8] + money[i + 7] + money[i + 6] + money[i + 5] + money[i + 4] + money[i + 3]
						+ money[i + 2] + money[i + 1] + money[i];
				if (sum < min) {
					min = sum;
				}

			}
		}

		System.out.print(min);

	}

}
