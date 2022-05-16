package gitup;

import java.util.Scanner;

public class JJC_Q24883 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char a = sc.next().charAt(0);
		if (a == 'n' || a == 'N')
			System.out.println("Naver D2");
		else
			System.out.println("Naver Whale");

	}

}
/*
20220517
문제 이해도 : 4 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 5분*/