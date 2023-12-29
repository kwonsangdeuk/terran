package �Ұ�8������;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

// "�ִ� ���" �˰����� ���� Ǯ��

public class �ִܰŸ� {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		ArrayList<City>[] list;
		boolean[] visited;
		PriorityQueue<City> queue = new PriorityQueue<City>();

		int N, M;
		int T = Integer.parseInt(br.readLine().trim());
		for (int tc = 1;  tc <=T; tc++) {
			st = new StringTokenizer(br.readLine().trim());

			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());		
			
			visited = new boolean[N+1];
			list = new ArrayList[N+1];
			 
			for (int i = 1; i <=N; i++) {
				list[i] = new ArrayList<City>();				
			}			
			
			
			int a,b,c;
			for (int i = 0; i < M; i++) {
				a = Integer.parseInt(st.nextToken());
				b = Integer.parseInt(st.nextToken());
				c = Integer.parseInt(st.nextToken());
				
				list[a].add(new City(b,c));
				list[b].add(new City(a,c));
				
			}
			
			int ans = -1;
			queue.clear();
			queue.add(new City(1,0));
			City now;
			while(!queue.isEmpty()) {
				now = queue.poll();
				if(visited[now.dest]) continue;
				visited[now.dest] = true;
				
				if(now.dest == N) {
					ans = now.cost;
					break;
				}
				
				for(City next:list[now.dest]) {
					if(!visited[next.dest]) {
						queue.add(new City(next.dest, now.cost+next.cost));
					}
				}				
			}
			
			System.out.println("#" + tc + " "  + ans);
			
		}		
	}

	static class City implements Comparable<City> {

		int dest;
		int cost;

		public City(int dest, int cost) {

			this.dest = dest;
			this.cost = cost;
		}

		@Override
		public int compareTo(�ִܰŸ�.City o) {
			return Integer.compare(this.cost, o.cost);
		}

	}
}
