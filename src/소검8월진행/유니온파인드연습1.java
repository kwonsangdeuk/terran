package 소검8월진행;

public class 유니온파인드연습1 {
	public static int[] parent = new int[10];
	
	public static int find(int n) {
		if (n == parent[n])
			return n;
		else
			return parent[n] = find(parent[n]);
	}

	public static void union(int a, int b) {
		a = find(a);
		b = find(b);
		// 같은 부모를 가지고 있지 않을 때
		if (a < b) // y가 x 보다 크다는 것을 가정한다면 아래와 같이 표현
			parent[b] = a;

		else {
			parent[a] = b;
		}

	}
	// 더 작은 값으로 넣어 줄 때 다음과 같이도 표현 가능
	/*
	 * if(x < y) parent[y] = x; else parent[x] = y;
	 */

	// 같은 부모 노드를 가지는지 확인
	public static boolean isSameParent(int a, int b) {
		a = find(a);
		b = find(b);
		if (a == b)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) {
			parent[i] = i;
		}
		int d = -2;
		union(2, 1);

		union(3, 2);

		System.out.println("1과 3은 연결되어 있나요? " + isSameParent(1, 3));
	}
}