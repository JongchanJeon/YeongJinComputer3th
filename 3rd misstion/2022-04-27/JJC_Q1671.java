package gitup;

import java.util.Scanner;

public class JJC_Q1671 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user = sc.nextInt();
		int computer = sc.nextInt();
		
		if (user - computer == -1 && user != 2 || user - computer == 2) {
			System.out.println("win");
		}else if (user == computer) {
			System.out.println("tie");
		}else {
			System.out.println("lose");
		}
		
	}

}
/*
20220427
문제이해도:4(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 9분
*/