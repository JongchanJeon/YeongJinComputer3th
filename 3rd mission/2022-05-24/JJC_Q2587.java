package gitup;

import java.util.Arrays;
import java.util.Scanner;

public class JJC_Q2587 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int sum = 0;
		for (int i = 0 ; i < 5; i++) {
			a[i] = sc.nextInt();
			sum += a[i];
		}
		System.out.println(sum / 5);
		Arrays.sort(a);
		System.out.println(a[2]);

	}

}
/*
20220524
�������ص� : 5(1~5���� ����)
���� �ذ� : o
�ڵ� �ð� : 2��
*/
