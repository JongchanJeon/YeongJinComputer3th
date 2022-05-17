package gitup;

import java.util.Arrays;
import java.util.Scanner;

public class JJC_Q2480 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		int result = 0;
		for(int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		if(a[0] == a[1] && a[1] == a[2]) {
			result = 10000 + a[0] * 1000;
		}
		else if (a[0] == a[1] || a[1] == a[2] || a[0] == a[2]) {
			result = 1000 + a[1] * 100;
		}
		else
			result = a[2] * 100;
		System.out.println(result);

	}

}/*
20220514
문제 이해도 : 5 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 6분*/
