package gitup;

import java.util.Scanner;

public class JJC_Q1380 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= 6; j++) {
				if (i + j == a)
					System.out.println(i + " " + j);
			}
		}

	}

}
/*
20220502
�������ص�:5(1~5���� ����)
���� �ذ� : o
�ڵ� �ð� : 2��
*/
