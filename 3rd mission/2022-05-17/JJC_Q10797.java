package gitup;

import java.util.Scanner;

public class JJC_Q10797 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[5];
		int except = sc.nextInt();
		int count = 0;
		for (int i = 0 ; i < 5; i++) {
			a[i] = sc.nextInt();
			if (a[i] == except)
				count += 1;
		}
		System.out.println(count);

	}

}
/*
20220517
문제 이해도 : 5 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 2분*/
