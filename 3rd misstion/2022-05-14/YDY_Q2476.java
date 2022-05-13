package CodeUp;

import java.util.*;

public class YDY_Q2476 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 사람 수 입력
		int max = 0;
		int money = 0; // 상금

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

			if (a == b && b == c) {
				money = 10000 + (a * 1000);
			} else if (a == b || b == c) {
				money = 1000 + (b * 100);
			} else if (a == c) {
				money = 1000 + (c * 100);
			} else {
				if (a >= b && a >= c) {
					money = a * 100;
				} else if (b >= a && b >= c) {
					money = b * 100;
				} else if (c >= a && c > b) {
					money = c * 100;
				}
			}
			if (money > max)
				max = money;
		}

		System.out.println(max);
	}

}
/*
2022-05-14
문제 이해도 : 5(1~5사이 숫자)
문제 해결 : O
코딩 시간 : 5분
*/