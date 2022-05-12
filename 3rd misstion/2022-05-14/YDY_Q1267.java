package CodeUp;

import java.util.*;

public class YDY_Q1267 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // ��ȭ�� ���� n��
		int y = 0, m = 0;

		for (int i = 0; i < n; i++) {
			int time = sc.nextInt(); // ��ȭ �ð�

			y += (time / 30 + 1) * 10;
			m += (time / 60 + 1) * 15;
		}
		if (y < m) {
			System.out.println("Y " + y);
		} else if (y > m) {
			System.out.println("M " + m);
		} else {
			System.out.println("Y M " + y);
		}
	}
}

/*
 * 2022-05-10 
 * ���� ���ص� : 4(1~5���� ����) 
 * ���� �ذ� : O 
 * �ڵ� �ð� : 15��
 */