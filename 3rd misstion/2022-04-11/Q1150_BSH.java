package CodeUp;

import java.util.Scanner;
public class Q1150_BSH {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		if(num1 <= num2 && num1 <= num3) {
			System.out.print(num1);
		}else if(num2 <= num1 && num2 <= num3) {
			System.out.print(num2);
		}else if(num3 <= num2 && num3 <= num1) {
			System.out.print(num3);
		}
	}
}
/*
���� ���ص� : 4 (1 ~ 5 ���� ����)
���� �ذ� : O
�ڵ� �ð� : 14��30��*/