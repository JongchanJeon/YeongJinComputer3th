package gitup;

import java.util.Arrays;
import java.util.Scanner;

public class JJC_Q15969 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] a = new int[count];
		for(int i = 0 ; i < count; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int result = a[count - 1] - a[0];
		System.out.println(result);
	}

}
/*
20220517
���� ���ص� : 5 (1 ~ 5 ���� ����)
���� �ذ� : O
�ڵ� �ð� : 2��*/
