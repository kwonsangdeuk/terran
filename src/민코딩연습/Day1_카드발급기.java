package 민코딩연습;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day1_카드발급기 {

	static int[] H;
	static int[] card;
	static int[] DAT;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());


		for (int ts = 1; ts <= T; ts++) {
			int N = Integer.parseInt(br.readLine());			
			
			H = new int[N];
			card = new int[N];
			DAT = new int[N + 1];

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				H[i] = Integer.parseInt(st.nextToken());
			}

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				card[i] = Integer.parseInt(st.nextToken());
			}

			for (int i = 0; i < N; i++) {
				DAT[card[i]] = H[i];
			}

			int ans = 0;
			for (int i = 1; i < N; i++) {
				if (DAT[i] < DAT[i + 1]) {
					ans = 1;
				}
			}

			if (ans == 1) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
			}
		}		
	}

}
