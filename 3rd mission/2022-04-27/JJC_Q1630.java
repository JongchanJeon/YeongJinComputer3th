package gitup;

import java.util.Scanner;

public class JJC_Q1630 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i = 0 ; i < count ; i++) {
			System.out.println(sc.next());
			if(i < count - 1)
				System.out.println("AMOLED");
		}

	}

}
/*
20220427
문제이해도: 2(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 12분
*/
