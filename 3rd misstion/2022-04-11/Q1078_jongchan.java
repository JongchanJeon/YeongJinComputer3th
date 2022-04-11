package CodeUp;

import java.util.Scanner;

public class Q1078_jongchan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result = 0;	
		for(int i = 1; i <= a; i++) {
			if(i % 2 == 0) {
				result += i;
			}
		}
		System.out.println(result);
		
	}

}
/*
문제 이해도 : 4 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 4분*/