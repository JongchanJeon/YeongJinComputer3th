package gitup;

import java.util.Scanner;

public class JJC_Q1082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int a = Integer.parseInt(s, 16);
		for(int i = 1 ; i <= 16; i++) {
			String result = Integer.toHexString(a * i);
			if(i < 10)
				System.out.println(s + "*" + i + "=" + result.toUpperCase());
			else if(i == 10)
				System.out.println(s + "*A=" + result.toUpperCase());
			else if(i == 11)
				System.out.println(s + "*B=" + result.toUpperCase());
			else if(i == 12)
				System.out.println(s + "*C=" + result.toUpperCase());
			else if(i == 13)
				System.out.println(s + "*D=" + result.toUpperCase());
			else if(i == 14)
				System.out.println(s + "*E=" + result.toUpperCase());
			else if(i == 15)
				System.out.println(s + "*F=" + result.toUpperCase());
				
		}

	}

}
/*
20220505
문제 이해도 : 4 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 7분*/
