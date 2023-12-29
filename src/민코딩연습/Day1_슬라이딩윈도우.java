package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day1_슬라이딩윈도우 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] point;
	static int s, e;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		int T = Integer.parseInt(br.readLine());

		for (int ts = 1; ts <= T; ts++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());

			point = new int[N];

			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < N; i++) {
				point[i] = Integer.parseInt(st.nextToken());
			}
			int sum = 0;
			for (int i = 0; i < W - 1; i++)
				sum += point[i];

			int max_sum = Integer.MIN_VALUE;
			
			
			for (int i = 0; i <= N - W; i++) // 기준점 (구간의 시작점)
			{
				sum += point[i + W - 1];
				// i ~ i+size-1구간의 size개수 data 생성
				if (max_sum < sum)// 값에 대한 처리
				{
					max_sum = sum;
					s = i;
					e = i+W-1; 
				}

				sum -= point[i];
			}			

			System.out.println("#"+ts+" "+s + " " + e + " " + max_sum);
		}

	}

}
