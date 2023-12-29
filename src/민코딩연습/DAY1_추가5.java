package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DAY1_추가5 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int[] arr1;
	static int[] arr2;
	static int[] arr3;
	static int number;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		number = Integer.parseInt(br.readLine());

		if (number == 1) {
			type1();
		} else if (number == 2) {
			type2();
		} else {
			type3();
		}

	}

	static void type1() throws IOException {

		StringTokenizer st = new StringTokenizer(br.readLine());

		arr1 = new int[3];
		for (int i = 0; i < 3; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
			
		}		
		int max = Integer.MIN_VALUE;
		int idx = 0;
		for (int i = 0; i < 3; i++) {
			if (max < arr1[i]) {
				max = arr1[i];
				idx = i;
			}
		}

		if (idx == 0) {
			System.out.println("A");
		} else if (idx == 1) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}

	}

	static void type2() throws IOException {

		int number1 = Integer.parseInt(br.readLine());
		
		arr2 = new int[number1+1];
				
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= number1; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
     
		if(arr2[number1] >= 1 && arr2[number1] <= number1) { 
			 System.out.println(arr2[arr2[number1]]);
		}
		else {
		System.out.println(-1);
    
	}
	}

	static void type3() throws IOException {

		int number3 = Integer.parseInt(br.readLine());
		arr3 = new int[number3];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < number3; i++) {
			arr3[i] = Integer.parseInt(st.nextToken());
		}
		int sum1 = 0;
		int sum2 = 1;

		for (int i = 0; i < number3; i++) {
			sum1 += arr3[i];
		}

		for (int i = 0; i < number3; i++) {
			sum2 *= arr3[i];
		}

		System.out.print(sum1 + " " + sum2);

	}

}