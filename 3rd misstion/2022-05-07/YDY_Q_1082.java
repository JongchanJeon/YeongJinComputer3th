package _2202_05_07;

import java.util.*;

public class YDY_Q_1082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String n = sc.next();

		int num = Integer.parseInt(n, 16); // 16������ 10������

		for (int i = 1; i <= 15; i++) {
			int mul = num * i;

			String a = Integer.toHexString(i); // 10������ 16������
			String b = Integer.toHexString(mul); //

			System.out.println(n + "*" + a.toUpperCase() + "=" + b.toUpperCase());
		}

	}
}

/*
 * 2022-05-07 
 * ���� ���ص� : 5
 * ���� �ذ� : O 
 * �ڵ� �ð� : 2��
 */