package gitup;

import java.util.Arrays;
import java.util.Scanner;

public class JJC_Q1293 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] a = new int[count];
		for (int i = 0 ; i < count ; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.print(a[count - 1] + " " + a[0]);

	}

}
/*
20220427
문제이해도:5(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 3분
*/
