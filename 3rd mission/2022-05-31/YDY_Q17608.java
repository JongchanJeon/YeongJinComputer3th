package _2022_05_31;

import java.util.*;

public class YDY_Q17608 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// ����� �� ��?
		int max = 0;
		int cnt = 0;
		int[] cm = new int[n];
		
		for (int i = 0; i < n; i++) {
			cm[i] = sc.nextInt();	// �� ��ġ �����?
		}
		
		for (int i = n - 1; i >= 0; i--) {
			if (cm[i] > max) {
				max = cm[i];
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}

/*
 * 2022-05-31 
 * ���� ���ص� : 4
 * ���� �ذ� : O 
 * �ڵ� �ð� : 30��
 */