package 소검8월진행;

import java.util.*;
import java.io.*;

public class 유니온파인드연습2 {

	static int[] parent = new int[10];

	static int find(int n) {

		if (parent[n] == n) {
			return n;
		} else {
			return parent[n] = find(parent[n]);
			
		}

	}

	static void union(int a, int b) {

		a = find(a);
		b = find(b);

		if (parent[a] > parent[b]) {
			parent[a] = b;
		} else {
			parent[b] = a;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < parent.length; i++) {
			parent[i] = i;
		}
		union(1, 2);
		union(2, 3);

		for (int i = 1; i < parent.length; i++) {
			System.out.println(parent[i]);
		}
	}

}
