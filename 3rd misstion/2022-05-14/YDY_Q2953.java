package CodeUp;

import java.util.*;

public class YDY_Q2953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int max = 0; // �����
		int order = 0; // �� ��° �����ΰ�

		for (int i = 0; i < 5; i++) {
			int sum = 0; // �հ�
			for (int j = 0; j < 4; j++) {
				int score = sc.nextInt(); // ���� �Է�
				sum += score;
				if (max <= sum) {
					max = sum;
					order = i + 1;
				}
			}
		}
		System.out.println(order + " " + max);
	}
}
/*
2022-05-14
���� ���ص� : 4
���� �ذ� : O
�ڵ� �ð� : 15��
*/