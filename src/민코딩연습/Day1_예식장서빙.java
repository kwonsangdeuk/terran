package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day1_예식장서빙 {

	static int[] food;
	static int[] DAT;
	static int[] Menu;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {

			StringTokenizer st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int R = Integer.parseInt(st.nextToken());

			food = new int[N];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				food[i] = Integer.parseInt(st.nextToken());
			}

			DAT = new int[N * 2];
			Menu = new int[210];
			
			for (int i = 0; i < N; i++) {
				DAT[i] = food[i];
			}
			for (int i = N; i < N * 2; i++) {
				DAT[i] = food[i - N];
			}

			int flag = 0;
			
			for(int i=0; i< 2*R; i++) {
				Menu[DAT[i]] += 1;
				
				 if(Menu[DAT[i]] >2){
					 flag=1;
				 }				
			}			
					
			for (int i = R; i < N+R; i++) {				
				Menu[DAT[i+R]] +=1;
				
				 if(Menu[DAT[i+R]] >2){
					 flag=1;
				 }
				
				Menu[DAT[i-R]] -=1;
				
			}
			if (flag == 1) {
				System.out.println("#" + tc + " " + "NO");
			} else {
				System.out.println("#" + tc + " " + "YES");
			}

		}

	}
}
