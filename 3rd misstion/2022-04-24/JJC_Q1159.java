package gitup;

import java.util.Scanner;

public class JJC_Q1159 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		if ((s >= 50 && s <= 70) || s % 6 == 0)
			System.out.println("win");
		else
			System.out.println("lose");

	}

}
/*
20220414
���� ���ص� : 5 (1 ~ 5 ���� ����)
���� �ذ� : O
�ڵ� �ð� : 1��*/
