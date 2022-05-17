package gitup;

import java.util.Scanner;

public class JJC_Q1409 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for(int i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		int guess = sc.nextInt();
		System.out.println(a[guess - 1]);
	}

}
/*
20220502
문제 이해도 : 5 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 2분
*/