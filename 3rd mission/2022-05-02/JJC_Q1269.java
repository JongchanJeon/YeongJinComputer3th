package gitup;

import java.util.Scanner;

public class JJC_Q1269 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();
		int result = a;
		for (int i = 0; i < n - 1; i++) {
			result = result * b + c;
		}
		System.out.println(result);
	}

}
/*
20220502
�������ص�:5(1~5���� ����)
���� �ذ� : o
�ڵ� �ð� : 4��
*/