package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;
public class DAY5_회의실배정 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static int[][] room;
	static int N;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		N = Integer.parseInt(br.readLine());

		room = new int[N][3];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			room[i][0] = Integer.parseInt(st.nextToken());
			room[i][1] = Integer.parseInt(st.nextToken());
			room[i][2] = room[i][1] - room[i][0];
		}

		Arrays.sort(room, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub									
				return o1[2] - o2[2];
			}
		});

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < 3; j++) {
				
				System.out.print(room[i][j]+ " ");
			}
			System.out.println(" ");
		}		

	}

}
