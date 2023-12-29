package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DAY2_입력받은레벨까지 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int e;
	static int[] visited;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		e = Integer.parseInt(br.readLine());
		visited = new int[1000];
		sub(0);

	}
	
	static void sub(int now) {
		
		if(now > e)
		{
			return;
			
		}
		System.out.print(now);
		sub(now+1);
		sub(now+1);
	}
	
	

//	static void sub(int n) {
//
//		if (n > N) {
//			return;
//		}
//		for (int i = 0; i < N; i++) {
//			if (visited[n] != 1) {
//				System.out.print(n + " ");
//				visited[n] =1 ;
//				sub(n + 1);
//				visited[n] = 0;
//			}
//		}
//	}

}
