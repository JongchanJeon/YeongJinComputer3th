package gitup;

import java.util.Scanner;

public class JJC_Q2525 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int t = sc.nextInt();
		
		m += t;
		while(m >= 60) {
		if (m >= 60) {
			m -= 60;
			h += 1;
			if (h >= 24) {
				h -= 24;
			}
		}
		}
		System.out.println(h + " " + m);
	}

}
/*
20220514
���� ���ص� : 5 (1 ~ 5 ���� ����)
���� �ذ� : O
�ڵ� �ð� : 5��*/
