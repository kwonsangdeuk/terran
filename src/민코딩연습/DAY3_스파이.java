package ���ڵ�����;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DAY3_������ {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	static ArrayList<Integer>[] al;

	public static void main(String[] args) throws IOException {
		int DAT[] = { 0, 1004, 1680, 9941, 3367, 3261, 2976, 4889, 1234, 6461, 7329, 5518 };
		// index : ��� ��ȣ, value : �ش� ����� ���

		int num = 0; // ã�� ���� ��� ��ȣ
		int input = Integer.parseInt(br.readLine()); // ��� �Է¹ޱ�
		for (int i = 1; i <= 11; i++)
			if (input == DAT[i]) // input�� ���� ����� ���� ��� ã��
				num = i;
		if (num == 0) // ���� ����̸� no person
			System.out.println("no person");
		else { // �ִ� ����� ���� ����, ����, ���ϸ� ã�´�.
			al = new ArrayList[12];
			for (int i = 0; i < 12; i++)
				al[i] = new ArrayList<>();
			// ������ ArrayList�����

			al[1].add(2);
			al[1].add(3);
			al[2].add(4);
			al[2].add(5);
			al[3].add(6);
			al[3].add(7);
			al[5].add(8);
			al[5].add(9);
			al[6].add(10);
			al[6].add(11);

			int boss = -1;
			for (int from = 1; from <= 11; from++)
			// from�� ���� ����� ����
			{
				for (int i = 0; i < al[from].size(); i++) {
					int to = al[from].get(i);
					if (to == num) {
						boss = from;
					}
				}
			} // ���� ��� ã��
			if (boss == -1)
				System.out.println("no boss");
			else
				System.out.println(DAT[boss]);

			if (boss == -1)
				System.out.println("no company");
			else {
				int company = -1;
				for (int i = 0; i < al[boss].size(); i++) {
					int to = al[boss].get(i);
					if (to != num)
						company = to;
				} // ���� ã��
				System.out.println(DAT[company]);
			}

			if (al[num].size() == 0)
				System.out.println("no junior");
			else {
				for (int i = 0; i < al[num].size(); i++) {
					int to = al[num].get(i); // ��������
					System.out.print(DAT[to] + " ");
				}
			}

		}
	}
}