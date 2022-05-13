package CodeUp;

import java.util.*;

public class YDY_Q2953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 0; // 우승자
		int order = 0; // 몇 번째 순서인가

		for (int i = 0; i < 5; i++) {
			int sum = 0; // 합계
			for (int j = 0; j < 4; j++) {
				int score = sc.nextInt(); // 점수 입력
				sum += score;
				if (max <= sum) {
					max = sum;
					order = i + 1;
				}
			}
		}
		System.out.println(order + " " + max);
	}
}
/*
2022-05-14
문제 이해도 : 4
문제 해결 : O
코딩 시간 : 15분
*/