package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class callbyvalue2 {

	static char[][] ar = { { 'F', 'E', 'W' }, { 'D', 'C', 'A' } };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char input = (char) (br.read());

		findCh(input);

	}

	static void findCh(char target) {

		int index = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {

				if (ar[i][j] == target)
					index = 1;

			}

		}

		if (index == 1) {
			System.out.println("발견");

		} else {
			System.out.println("미발견");

		}

	}

}