package gitup;

import java.util.Arrays;
import java.util.Scanner;

public class JJC_Q1411 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] a = new int[count - 1];
		int[] b = new int[count];
		for(int i = 0; i < count - 1; i++) {
			a[i] = sc.nextInt();
			b[a[i]-1]++;
		}
		for(int i = 0; i < count; i++) {
			if (b[i] != 1) {
				System.out.println(i + 1);
				break;
			}
		}

	}

}/*
20220510
���� ���ص� : 4 (1 ~ 5 ���� ����)
���� �ذ� : O
�ڵ� �ð� : 10��*/
