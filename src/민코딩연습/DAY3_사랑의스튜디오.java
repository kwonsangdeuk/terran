package ¹ÎÄÚµù¿¬½À;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DAY3_»ç¶ûÀÇ½ºÆ©µð¿À {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[][] people;
	static int N;
	static int cnt;
	static int max, min;
	static int[] point;
	static int maxpoint, minpoint;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		N = Integer.parseInt(br.readLine());
		max = Integer.MIN_VALUE;
		min = Integer.MAX_VALUE;
		point = new int[N];
		people = new int[N][N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {

				people[i][j] = Integer.parseInt(st.nextToken());

			}
		}
		for (int i = 0; i < N; i++) {
			point[i] = 0;
			for (int num = 0; num < N; num++) {
				if (people[num][i] == 1)
					point[i] += 1;
			}

		}

		for (int i = 0; i < N; i++) {

			if (max < point[i]) {
				max = point[i];
				maxpoint = i;
			}
		}

		for (int i = 0; i < N; i++) {

			if (min > point[i]) {
				min = point[i];
				minpoint = i;
			}
		}

		System.out.println(maxpoint + " " + minpoint);

	}
}