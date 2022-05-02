package gitup;

import java.util.Scanner;

public class JJC_Q1367 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = n ; i > 0; i--) {
			for(int j = 0; j < i - 1; j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
/*
20220502
문제 이해도 : 5 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 3분
*/