package gitup;

import java.util.Scanner;

public class JJC_Q2633 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int findNum = sc.nextInt();
		int[] a = new int[count];
		for(int i = 0 ;i < count; i++) {
			a[i] = sc.nextInt();
			if (a[i] >= findNum) {
				System.out.println(i + 1);
				break;
			}
			if (i == count - 1 && a[i] != findNum)
				System.out.println(count + 1);
		}

	}

}
/*
20220510
���� ���ص� : 1 (1 ~ 5 ���� ����)
���� �ذ� : O
�ڵ� �ð� : 15��*/

