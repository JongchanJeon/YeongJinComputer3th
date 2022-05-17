package CodeUp;

import java.util.Scanner;

public class KJW_Q1024 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a = sc.next();
		
		for(int i=0; i<a.length(); i++) {
			System.out.println("'"+a.charAt(i)+"'");
		}
	}

}

/* 20220508 
 * 문제 이해도 : 5 (1 ~ 5 사이 숫자)
 * 문제 해결 : O
 * 코딩 시간 : 2분
 */