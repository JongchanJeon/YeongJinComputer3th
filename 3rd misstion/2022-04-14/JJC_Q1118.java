package gitup;

import java.util.Scanner;

public class JJC_Q1118 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		double result = 0;
		result = (double)(w * h) / 2;
		System.out.printf("%.1f", result);
	}

}
/*
20220414
���� ���ص� : 4 (1 ~ 5 ���� ����)
���� �ذ� : O
�ڵ� �ð� : 5��*/