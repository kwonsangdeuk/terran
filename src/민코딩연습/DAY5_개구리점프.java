package 민코딩연습;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;

public class DAY5_개구리점프 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	static int dp[][];
	static int row_size, col_size;
	static int[][] map;
	
//// DFS 방식	
//	static int func(int row, int col) {
//		
//		if(row == row_size) {
//			return map[row][col];
//		}
//		if(dp[row][col] != -2134567890)
//				return dp[row][col];
//		
//		int ret = Integer.MIN_VALUE;
//		
//		ret = Math.max(ret, func(row+1,col-1));
//		ret = Math.max(ret, func(row+1,col));
//		ret = Math.max(ret, func(row+1,col+1));
//		dp[row][col]=  ret+map[row][col];		
//		
//	}
//	
//	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	  
		for (int i = 1; i < row_size ; i++) {
			for (int j = 0; j < col_size; j++) {
				
				int ret = -2134567890;			

				ret = Math.max(ret, dp[row-1][col-1]);
				ret = Math.max(ret, dp[row-1][col]); 
				ret = Math.max(ret,  dp[row-1][col-1]);

				
				
			}
			
		}
		
	}
}
