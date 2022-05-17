package _2202_05_07;

import java.util.*;

public class YDY_Q_1204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		if (n % 10 == 1 && n != 11) {
			System.out.println(n + "st");
		} else if (n % 10 == 2 && n != 12) {
			System.out.println(n + "nd");
		} else if (n % 10 == 3 && n != 13) {
			System.out.println(n + "rd");
		} else {
			System.out.println(n + "th");
		}
	}

}

/*
 * 2022-05-07 
 * 문제 이해도 : 5 
 * 문제 해결 : O 
 * 코딩 시간 : 6분
 */