package gitup;

import java.util.Scanner;

public class JJC_Q1267 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int people = sc.nextInt();
		int[] a = new int[people];
		int M = 0;
		
		int Y = 0;
		
		for(int i = 0 ; i < people; i++) {
			a[i] = sc.nextInt();
				Y += 10 * (a[i] / 30 + 1);
			 
				M += 15 * (a[i] / 60 + 1);
		}
		if (M == Y)
			System.out.println("Y M " + Y);
		else if (M > Y)
			System.out.println("Y " + Y);
		else
			System.out.println("M " + M);
		
	}

}
/*
20220514
문제 이해도 : 1 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 45분*/

