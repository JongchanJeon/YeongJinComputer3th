package CodeUp;

import java.util.*;

public class Q1078_DaYeon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(a >= 90) {
			System.out.println("A");
		}
		else if (a >= 70) {
			System.out.println("B");
		}
		else if (a >= 40) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
	}

}

/*
문제 이해도 : 3 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 10분
*/