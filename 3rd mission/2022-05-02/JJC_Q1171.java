package gitup;

import java.util.Scanner;

public class JJC_Q1171 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		int class1 = sc.nextInt();
		int number = sc.nextInt();
		System.out.print(grade);
		if(class1 <= 9) {
			System.out.print(0);
		}
		System.out.print(class1);
		if(number <= 9)
			System.out.print(0);
		if(number <= 99)
			System.out.print(0);
		System.out.print(number);
		
		
		
	}

}
/*
20220502
���� ���ص� : 5 (1 ~ 5 ���� ����)
���� �ذ� : O
�ڵ� �ð� : 3��
*/