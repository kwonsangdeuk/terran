package 민코딩연습;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 기본문법01 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		int a = 3;
		short b = 5;
		long c = 6L;
		float d = 3.4F;
		double e = 3.4;
		System.out.printf("결과는 %d %d %d, %.1f %.1f %n",a,b,c,d,e);
		
		exam();
		change();
		연산자();

	}

	public static void exam() {
		int num = 123456789;
		String S = "ABCD";		
		String tmp = String.valueOf(num);
		System.out.println("문자열 길이는" + S.length());
		System.out.println(tmp.length());
		
	}
	
	
	public static void change() {
		
		String arch = "12345";		
		System.out.println("결과값은 " + Integer.valueOf(arch+1));
		
		
		
		
	}
	
	
	 public static void 연산자() {
	
		 double A = 60;
		 double B = 8;
		 
		 System.out.println( A/B);
	
	 }

}
