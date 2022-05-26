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
문제이해도 : 5(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 2분
*/
