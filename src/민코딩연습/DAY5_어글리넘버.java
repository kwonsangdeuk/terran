package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class DAY5_어글리넘버 {

	static void BFS(long num) {
		PriorityQueue<Long> pq = new PriorityQueue<>();

		long prev = 0;
		int cnt = 1;
		pq.add((long) num);

		while (cnt <=1500) {
			long now = pq.poll();
			if (prev == now)
				continue;
			bad[cnt] = now;
			cnt+=1;
			
			pq.add(num * 2);
			pq.add(num * 3);
			pq.add(num * 5);
			prev = now;
		}

	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int N;
	static long[] bad = new long[1501];

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BFS(1);

		N = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			int temp = Integer.parseInt(st.nextToken());
			System.out.print(bad[temp] + "  ");
		}

	}

}
