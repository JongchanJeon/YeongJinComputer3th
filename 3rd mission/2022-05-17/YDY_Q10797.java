package _2022_05_15;

import java.util.*;

public class YDY_Q10797 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		int day = sc.nextInt();
		
		for (int i = 0; i < 5; i++) {
			int carNum = sc.nextInt();
			if(day == carNum) {
				count++;
			}
		}
		System.out.println(count);
	}
}
/*
2022-05-17
���� ���ص� : 5
���� �ذ� : O
�ڵ� �ð� : 7��
*/