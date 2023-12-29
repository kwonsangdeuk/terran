package ���ڵ�����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day1_��Ȯ�ν�ȣ {

	static String S;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		for (int test_case = 1; test_case <= T; test_case++) {
			int m = Integer.parseInt(br.readLine());

			S = br.readLine();
			int n = S.length(); // ���ڿ��� ���� ��������

			int DAT[] = new int[256];
			// index : ���� ��ȣ(ascii), value : �ش� ���ڰ� �� �� ���Դ°�?

			int flag = 0; // �߸������� 1, �����̸� 0

			// ���� ����, m - 1�� ������ ���� ó��
			for (int i = 0; i < m - 1; i++) {
				char ch = S.charAt(i);
				// String.charAt(index) => String���� index��° ���ڸ� �����´�.
				// ��ȯ : char
				DAT[ch] += 1; // ch��� ���ڰ� 1�� �߰��ƴ�!

				// if(ch��� ���ڰ� �߰��Ǹ鼭 2�� �̻��� �Ǿ��°�?)
				// flag = 1; // �߸��ƴ�!
				if (DAT[ch] >= 2) {
					flag = 1;
				}

			}
			int d = -1;

			for (int i = 0; i <= n - m; i++) {
				// i ~ i+m-1���� (m���� ���� �ϼ�)
				char e = S.charAt(i + m - 1);
				DAT[e] += 1;

				if (DAT[e] >= 2) {
					flag = 1;
				}
				// ---ó��--
				// �̹��� �߰��� e��� ���ڰ� 2�� �̻��� �Ǿ��°�?
				// �߸��ƴ�.
				// if (�̹��� �߰��� e��� ���ڰ� 2�� �̻��� �Ǿ��°�?)
				// flag = 1;

				// ���������� �غ�, �� ���� data ����
				char s = S.charAt(i);
				DAT[s] -= 1;
			}
			if (flag == 1) {
				System.out.println("#" + test_case + " " + "FAIL");
			} else {
				System.out.println("#" + test_case + " " + "PASS");
			}
		}
	}
}