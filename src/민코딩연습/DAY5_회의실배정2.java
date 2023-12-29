package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;



public class DAY5_회의실배정2 {

	static class Node implements Comparable<Node> {
		int start;
		int end;

		Node(int start, int end) {

			this.start = start;
			this.end = end;

		}

		@Override
		//
		public int compareTo(Node right) {
			// 1순위: row가 작을 수록 앞으로

			if (end < right.end)
				return -1;
			if (end > right.end)
				return 1;
			if (start < right.start)
				return -1;
			if (start > right.start)
				return 1;

		}
	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N;
	static int cnt;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		N = Integer.parseInt(br.readLine());
		Node node[] = new Node[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			node[i] = new Node(start, end);

		}
		
		Array.sort(node);

		int now = 0;
		for (int i = 0; i < N; i++) {
			{
				if (now <= node[i].start) {

					cnt++;
					now = node[i].end;
				}
			}

		}
		System.out.println(cnt);

	}

}