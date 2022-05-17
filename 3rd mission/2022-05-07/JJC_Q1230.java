package gitup;

import java.util.Scanner;

public class JJC_Q1230 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		
		for(int i = 0 ; i < 3; i++) {
			a = sc.nextInt();
			if (a <= 170) {
				System.out.println("CRASH " + a);
				break;
			}
			if (i == 2 && a > 170) {
				System.out.println("PASS");
			}
			
		}

	}

}
/*
20220507
문제 이해도 : 5 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 5분
*/