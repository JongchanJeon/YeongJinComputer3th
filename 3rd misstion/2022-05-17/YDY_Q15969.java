package _2022_05_17;

import java.util.*;

public class YDY_Q15969 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int max = 0, min = 1000;
		
		for(int i = 0; i < N; i++) {
			int score = sc.nextInt();
			if(score >=max) {
				max = score;
			}
			if(score <= min) {
				min = score;
			}
		}
		System.out.println(max-min);
	}
}

/*
 * 2022-05-17
 * 문제 이해도 : 5
 * 문제 해결 : O
 * 코딩 시간 : 20분
 */