package ¹ÎÄÚµù¿¬½À;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.concurrent.LinkedBlockingDeque;

public class DAY4_ÆøÅºÅõÇÏ {

	static char[][] map = { { '_', '_', '_', '_', '_' }, { '_', '_', '_', '_', '_' }, { '_', '_', '_', '_', '_' },
			{ '_', '_', '_', '_', '_' },

	};

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int row, col;
	static int[] dr = { -1, 1, 0, 0, -1, 1, -1, 1 }; // 8¹æÇâ (»óÈ­ÁÂ¿ì)
	static int[] dc = { 0, 0, -1, 1, -1, -1, 1, 1 };

	static void BFS(int r, int c) {
		
		for (int i = 0; i < 8; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			if (nr < 0 || nc < 0 || nr >= 4 || nc >= 5)
				continue;
			map[nr][nc] = '#';

		}	

	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		StringTokenizer st = new StringTokenizer(br.readLine());

		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		
		BFS(row, col);

		st = new StringTokenizer(br.readLine());

		row = Integer.parseInt(st.nextToken());
		col = Integer.parseInt(st.nextToken());
		BFS(row, col);

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println(" ");
		}
		
	}

}
