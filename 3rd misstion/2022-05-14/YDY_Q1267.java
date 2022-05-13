package CodeUp;

import java.util.*;

public class YDY_Q1267 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 통화의 개수 n개
		int y = 0, m = 0;

		for (int i = 0; i < n; i++) {
			int time = sc.nextInt(); // 통화 시간

			y += (time / 30 + 1) * 10;
			m += (time / 60 + 1) * 15;
		}
		if (y < m) {
			System.out.println("Y " + y);
		} else if (y > m) {
			System.out.println("M " + m);
		} else {
			System.out.println("Y M " + y);
		}
	}
}

/*
 * 2022-05-10
 * 문제 이해도 : 4(1~5사이 숫자) 
 * 문제 해결 : O 
 * 코딩 시간 : 15분
 */
