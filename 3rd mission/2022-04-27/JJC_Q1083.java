package gitup;

import java.util.Scanner;

public class JJC_Q1083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1 ; i <= num; i++) {
			if(i % 3 == 0) {
				System.out.print("X");
			}else
				System.out.print(i);
			System.out.print(" ");
		}

	}

}
/*
20220427
�������ص�: 5(1~5���� ����)
���� �ذ� : o
�ڵ� �ð� : 3��
*/
