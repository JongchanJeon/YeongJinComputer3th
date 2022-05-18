package gitup;

import java.util.Scanner;

public class JJC_Q4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		
		
		for (int i = 0; i < count; i++) {
			int people = sc.nextInt();
			int[] a = new int[people];
			double result = 0;
			int over = 0;
			for(int j = 0; j < people; j++) {
				a[j] = sc.nextInt();
				result += a[j];
			}
			result = result / people;
			for (int j = 0; j < people; j++) {
				if (result < a[j])
					over += 1;
			}
			result = (double)over / people * 100;
			System.out.printf("%.3f", result);
			System.out.println("%");
		}

	}

}
/*
20220521
문제 이해도 : 4 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 20분
*/
