package CodeUp;

import java.util.*;

public class YDY_Q1095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int min = 23;
		
		for(int i = 1; i < n; i++) {
			int k = sc.nextInt();
			if(min > k) {
				min = k;
			}
		}
		System.out.println(min);
	}
}

/*
문제 이해도 : 4
문제 해결 : O
코딩 시간 : 28분
*/