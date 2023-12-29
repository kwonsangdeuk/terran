package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

import 민코딩연습.DAY5_정렬연습.Node;

public class DAY5_sortlibrary {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static class Node implements Comparable<Node> {
		int num;
		char ch;

		Node(int num, char ch) {

			this.num = num;
			this.ch = ch;

		}

		@Override
		// 매개변수로 오른쪽에 있는 것을 받음.
		public int compareTo(Node right) {
			// 1순위: row가 작을 수록 앞으로

			if (num % 2 == 0 && right.num % 2 == 1)
				return -1;
			if (num % 2 == 1 && right.num % 2 == 0)
				return 1;

			if (num < right.num)
				return -1;
			if (num > right.num)
				return 1;

			if (ch < right.ch)
				return -1; // 정상
			if (ch > right.ch)
				return 1; // 비정상

			return 0;
		}

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int N = Integer.parseInt(br.readLine());
		Integer arr[] = new Integer[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		char ch[] = new char[N];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			ch[i] = st.nextToken().charAt(0);
		}

		Node node[] = new Node[N];
		for (int i = 0; i < N; i++) {
			   node[i] = new Node(arr[i], ch[i]);

		}

		Arrays.sort(arr);
		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(" ");

		Arrays.sort(arr, Collections.reverseOrder());

		for (int i = 0; i < N; i++) {
			System.out.print(arr[i] + " ");

		}
		System.out.println(" ");

		Arrays.sort(node);

		for (int i = 0; i < N; i++) {
			System.out.print(node[i].num+ " ");
		
		}
		System.out.println(" ");		
		for (int i = 0; i < N; i++) {
			System.out.print(node[i].ch+ " ");
			
		}
		
		

	}
}
