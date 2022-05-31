package _2022_05_31;

import java.util.*;

public class YDY_Q14726 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		String[] num = new String[t];

		for (int i = 0; i < t; i++) {
			String x = sc.next();
			char[] c = x.toCharArray();
			int sum = 0;
			for (int j = x.length() - 1; j >= 0; j--) {
				int n = Integer.parseInt(c[j] + "");
				if (j % 2 != 0) {
					sum += n;
				} else {
					n = n * 2;
					if (n > 9)
						n = 1 + (n % 10);
					sum += n;
				}
			}
			if (sum % 10 == 0)
				System.out.println("T");
			else
				System.out.println("F");
		}

	}

}
/*
 * 2022-05-31 
 * 문제 이해도 : 2
 * 문제 해결 : O 
 * 코딩 시간 : 64분
 */