package gitup;

import java.util.Scanner;

public class JJC_Q1173 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if (m - 30 >= 0) {
			m -= 30;
		}else {
			m += 60;
			m -= 30;
			if (h == 0)
				h = 23;
			else
				h -= 1;
		}
		System.out.println(h + " " + m);
	}

}
/*
20220507
문제 이해도 : 5 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 5분
*/