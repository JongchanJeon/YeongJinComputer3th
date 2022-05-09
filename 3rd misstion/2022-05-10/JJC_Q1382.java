package gitup;

import java.util.Scanner;

public class JJC_Q1382 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1 ; i <= 9; i++) {
			for(int j = 2; j <=5; j++) {
				if(j < 5)
					System.out.printf("%d x %d = %2d\t", j, i, i * j);
				else 
					System.out.printf("%d x %d = %2d", j, i, i * j);
			}
			System.out.println();
		}
	}

}
/*
20220510
문제 이해도 : 3 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 7분*/

