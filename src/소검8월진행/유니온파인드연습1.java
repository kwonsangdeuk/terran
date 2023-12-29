package �Ұ�8������;

public class ���Ͽ����ε忬��1 {
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
		// ���� �θ� ������ ���� ���� ��
		if (a < b) // y�� x ���� ũ�ٴ� ���� �����Ѵٸ� �Ʒ��� ���� ǥ��
			parent[b] = a;

		else {
			parent[a] = b;
		}

	}
	// �� ���� ������ �־� �� �� ������ ���̵� ǥ�� ����
	/*
	 * if(x < y) parent[y] = x; else parent[x] = y;
	 */

	// ���� �θ� ��带 �������� Ȯ��
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

		System.out.println("1�� 3�� ����Ǿ� �ֳ���? " + isSameParent(1, 3));
	}
}