package gitup;

import java.util.Scanner;

public class JJC_Q17608 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int result = 0;
		
		int[] a = new int[count];
		for (int i = 0 ; i < count; i++) {
			a[i] = sc.nextInt();
		}
		int max = a[count - 1];
		for (int i = count - 2; i >= 0; i--) {
			if (max < a[i]) {
				max = a[i];
				result++;
			}
		}
		System.out.println(result + 1);
	}
}
/*
20220531
���� ���ص� : 1 (1 ~ 5 ���� ����)
���� �ذ� : O
�ڵ� �ð� : 50��
*/
