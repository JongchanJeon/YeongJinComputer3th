package gitup;

import java.util.Scanner;

public class JJC_Q1024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String output = sc.next();
		
		for(int i = 0; i < output.length(); i++) {
			System.out.println("'" + output.charAt(i) + "'");
		}
	}

}
/*
20220510
문제 이해도 : 5 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 4분*/
