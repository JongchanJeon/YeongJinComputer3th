package _2202_05_07;

import java.util.*;

public class YDY_Q_1230 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		int car = 170;

		if (car < a && car < b && car < c) {
			System.out.println("PASS");
		} else if (car >= a) {
			System.out.println("CRASH " + a);
		} else if (car >= b) {
			System.out.println("CRASH " + b);
		} else if (car >= c) {
			System.out.println("CRASH " + c);
		}
	}

}

/*
 * 2022-05-07
 * ���� ���ص� : 5
 * ���� �ذ� : O
 * �ڵ� �ð� : 9��
 */