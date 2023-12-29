package 민코딩연습;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InaccessibleObjectException;


public class level9_2 {
	
	
	

	public level9_2() {
		// TODO Auto-generated constructor stub
	}

	
	static char[][] ar = {{'A','B','C','D','E'},
			              {'E','A','B','A','B'},
			              {'A','C','D','E','R'}};
	
	
	static int cnt;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char word = (char)br.read();
		cnt = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j <5; j++) {
				
				if(ar[i][j] == word) cnt++;				
				
			}
			
		}
    
	  if(cnt >=3) {
		  System.out.println("대발견");
		
		}
		else if( cnt >=1 && cnt <=2) {
			System.out.println("발견");
		}
		else {
			System.out.println("미발견");
		}		
	}

}
