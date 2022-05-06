package _2202_05_07;

import java.util.*;

public class YDY_Q_1082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String n = sc.next();

		int num = Integer.parseInt(n, 16); // 16진수를 10진수로

		for (int i = 1; i <= 15; i++) {
			int mul = num * i;

			String a = Integer.toHexString(i); // 10진수를 16진수로
			String b = Integer.toHexString(mul); //

			System.out.println(n + "*" + a.toUpperCase() + "=" + b.toUpperCase());
		}

	}
}

/*
 * 2022-05-07 
 * 문제 이해도 : 2
 * 문제 해결 : O 
 * 코딩 시간 : 25분
 */
