package 민코딩연습;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class DAY5_정렬연습 {

	static class Node implements Comparable<Node> {
		int row;
		int col;

		Node(int row, int col) {

			this.row = row;
			this.col = col;

		}

		@Override
		// 매개변수로 오른쪽에 있는 것을 받음.
		public int compareTo(Node right) {
			// 1순위: row가 작을 수록 앞으로
			if (row < right.row)
				return -1; // 정상
			if (row > right.row)
				return 1; // 잘못

			if (col < right.col)
				return -1; // 정상
			if (col > right.col)
				return 1; // 잘못

			return 0;
		}

		// 컴파일시는 삭제한다.
		@Override
		public String toString() {
			return "Node [row=" + row + ", col=" + col + "]";
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Integer a;
//		Integer b;
//		
//		a.compareTo(b);

		Integer[] map = { 1, 5, 4, 8, 3 };
		Arrays.sort(map, Collections.reverseOrder());

		for (int i = 0; i < map.length; i++) {
			System.out.print(map[i] + " ");
		}

		Node[] node = new Node[5];

		node[0] = new Node(5, 3);
		
		node[1] = new Node(2, 8);
		node[2] = new Node(4, 7);
		node[3] = new Node(5, 2);
		node[4] = new Node(8, 1);
		Arrays.sort(node);

		for (int i = 0; i < node.length; i++) {
			System.out.println(node[i]);
		}
		

	}

}
