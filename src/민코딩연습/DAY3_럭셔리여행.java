package ¹ÎÄÚµù¿¬½À;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DAY3_·°¼Å¸®¿©Çà {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[][] map;
	static int[] visited;
	static int sum;
	static int N;
	static int max = Integer.MIN_VALUE;
	static int min = Integer.MAX_VALUE;
	static int start,end;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

        N = Integer.parseInt(br.readLine());
        
        map = new int[N][N];
        visited = new int[N];
        

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		start = Integer.parseInt(st.nextToken());
		end =  Integer.parseInt(st.nextToken());
		
		visited[start] = 1;
		dfs(start);
		System.out.println(min);
		System.out.print(max);

	}

	static void dfs(int start) {

		if (start == end) {
			if (max < sum) max=sum;
			if(min > sum) min = sum;	
			
			return;
		}
		
		
		

		for (int i = 0; i < N; i++) {
			int next = i;
			if (visited[i] == 0 && map[start][next] != 0) {
				visited[i] = 1;
				sum +=map[start][next];
				dfs(next);
				visited[i] = 0;
				sum -=map[start][next];
			}
		}

	}
}