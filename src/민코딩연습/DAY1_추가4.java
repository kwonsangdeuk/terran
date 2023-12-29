package 민코딩연습;

public class DAY1_추가4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] map = { { 3, 4, 1, 2 }, { 2, 2, 3, 5 }, { 6, 6, 1, 2 } };

		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 4; x++) {
				if (map[y][x] % 2 == 0 && map[y][x] > 4) {
					System.out.println(map[y][x]);
				}
			}
		}

	}

}
