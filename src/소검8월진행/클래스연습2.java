package 소검8월진행;



public class 클래스연습2 {
   
	static int ans, ans1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	bank m = new bank();
	
	ans = m.sang(50);
	ans1 = m.jun(30);
	
	System.out.println(ans);
	System.out.println(ans1);
		
	}
	
}
	

	
	
 class bank{
	
   static int sang(int a) {
		
		int sum = a +1000;		
	    return sum;
	}
   
   static int jun(int b) {
	   int minus = b-3;
	   return minus;
   }
   
}


