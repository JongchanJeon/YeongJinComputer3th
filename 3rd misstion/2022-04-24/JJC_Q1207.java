package gitup;

import java.util.Scanner;

public class JJC_Q1207 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		int result = 0;
		for (int i = 0; i < 4 ; i++) {
			a[i] = sc.nextInt();
			result += a[i];
		}
		switch (result){
		case 0:
			System.out.println("��");
			break;
		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("��");
			break;
		case 3:
			System.out.println("��");
			break;
		case 4:
			System.out.println("��");
			break;
		}
		

	}

}
/*
20220414
���� ���ص� : 5 (1 ~ 5 ���� ����)
���� �ذ� : O
�ڵ� �ð� : 4��*/