package ¹ÎÄÚµù¿¬½À;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day2_¸¶ÀÌÅ¬Àè½¼ {

	static int[] ar;
	static int start, end;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		ar = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			ar[i] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());

		start = Integer.parseInt(st.nextToken());
		end = Integer.parseInt(st.nextToken());
		int d = -1;

		dance(start);

	}

	static void dance(int s) {

		if (s > end) {
			return;
		}

		System.out.print(ar[s] + " ");

		dance(s+1);
		s = s-1;
		if(s < start) {
			return;
		}
		System.out.print(ar[s] + " ");
		

	}

}
