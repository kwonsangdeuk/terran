package 민코딩연습;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 입력연습1 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String temp = br.readLine();
		int a = Integer.parseInt(temp);
		System.out.println(a + 1);

		StringTokenizer st = new StringTokenizer(br.readLine());
		
	    int b = Integer.parseInt(st.nextToken());    
	    int c = Integer.parseInt(st.nextToken());
	    
	    
//	    System.out.println(b);
//	    System.out.println(c);
	    bw.write(b+" "+c);
	    bw.close();
	}
	
	
	

}
