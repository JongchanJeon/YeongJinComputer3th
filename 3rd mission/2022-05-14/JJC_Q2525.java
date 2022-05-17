package gitup;

import java.util.Scanner;

public class JJC_Q2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		
		m += t;
		while(m >= 60) {
		if (m >= 60) {
			m -= 60;
			h += 1;
			if (h >= 24) {
				h -= 24;
			}
		}
		}
		System.out.println(h + " " + m);
	}

}
/*
20220514
문제 이해도 : 5 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 5분*/
