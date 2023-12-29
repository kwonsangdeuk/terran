package 소검8월진행;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 다익스트라연습2 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static int T, Ans;
	static StringTokenizer st ;
	static int N, M;
	static ArrayList<Node> al[] = new ArrayList[1000000];
	
	

	public class Node implements Comparable<Node> {
		int dest;
		int cost;

		public Node(int dest, int cost) {
			this.dest = dest;
			this.cost = cost;
		}

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return Integer.compare(this.cost, cost);
		}
	}
	
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			
			for (int i = 1; i <=N; i++) {
				
			}
			
			
			
		}

	}

}
