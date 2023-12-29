package ¹ÎÄÚµù¿¬½À;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class leve9_4 {

	static int[] number= {3,4,2,5,7,9};
	
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int temp;
		temp = number[b];
	   number[b] = number[a];
	   number[a] = temp;
	   
	   for (int i = 0; i < 6; i++) {
		   System.out.print(number[i]+ " " );
		
	}
	   
	    
	   
		
		
		
	}

}
