package ¹ÎÄÚµù¿¬½À;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DAY2_´ÙÅ÷Ä£±¸ {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static String S;
	static char[] map;
	static char[] munja;
	static int[] visited;
	static int size;
	
	
	static void dfs(int now) {
		
		if(now == size) {
			for (int i = 0; i < 4; i++) {
				System.out.print(munja[i]);				
			}
			System.out.println(" ");
			return;
		}
		
		for (int i = 0; i < 4; i++) {
			int next = i;						
			munja[now] = map[next];			
			dfs(next+1);
			
		}
		
	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		S = br.readLine();
		size = S.length();		
		map = new char[size];
		munja = new char[size];
		visited = new int[size];
	    for (int i = 0; i < size; i++) {
			
	    	map[i] = S.charAt(i);
		}		
	    dfs(0);	    
	}

	

	
}
