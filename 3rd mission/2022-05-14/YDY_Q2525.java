package CodeUp;

import java.util.*;

public class YDY_Q2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt(), B = sc.nextInt();
		int C = sc.nextInt();

		if (C >= 60) {
			B += C;
			A += B / 60;
			if (A >= 24) {
				A -= 24;
				B = B % 60;
			}
			if (B % 60 == 0) {
				B = 0;
			}
			if(A <= 23) {
				B = B % 60;
			}
		} else if (C < 60) {
			if (B + C >= 60) {
				A += 1;
				B = (B + C) % 60;

				if (A >= 24) {
					A -= 24;
				}
			} else {
				B += C;
			}
		}
		System.out.println(A + " " + B);
	}
}

/*
 * 2022-05-14
 * ���� ���ص� : 3
 * ���� �ذ� : O
 * �ڵ� �ð� : �� 120��
 */