package gitup;

import java.util.Scanner;

public class JJC_Q1089 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();

		for (int i = 1; i < n; i++) {
			a += d;
		}
		System.out.println(a);
	}

}
/*
20220427
�������ص�: 4(1~5���� ����)
���� �ذ� : o
�ڵ� �ð� : 5��
*/