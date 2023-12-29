package ¹ÎÄÚµù¿¬½À;

import java.util.Iterator;

public class Â¦²á¹Ù²Ù±â {

	static int[][] student = { { 3, 4 }, { 2, 6 }, { 7, 1 }, { 2, 8 }, { 1, 9 }, { 1, 2 } };
	static int cnt;
	static int temp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 6; i++) {

			if (student[i][0] < student[i][1]) {

				temp = student[i][0];
				student[i][0] = student[i][1];
				student[i][1] = temp;
				cnt++;

			}

		}

		for (int i = 0; i < 6; i++) {

			for (int j = 0; j < 2; j++) {
				System.out.print(student[i][j]+" ");
			}

			System.out.println(" ");
		}

	     System.out.println(cnt+"¸í");
	
	
	}

}
