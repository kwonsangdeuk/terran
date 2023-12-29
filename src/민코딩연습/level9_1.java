package 민코딩연습;


import java.util.*;
import java.io.*;

public class level9_1 {

	static int[] ar= {4,3,6,1,3,1,5,3};
	static int cnt;
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		int number = Integer.parseInt(br.readLine());
		
		cnt=0;
		for (int i = 0; i < 8; i++) {
			
			if(ar[i] == number) {
				cnt++;
			}
			
			
		}
		
		System.out.println("숫자"+number+"개수는"+cnt+"개");
		
		
		
	}

}
