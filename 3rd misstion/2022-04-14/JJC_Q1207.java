package gitup;

import java.util.Scanner;

public class JJC_Q1207 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		int result = 0;
		for (int i = 0; i < 4 ; i++) {
			a[i] = sc.nextInt();
			result += a[i];
		}
		switch (result){
		case 0:
			System.out.println("모");
			break;
		case 1:
			System.out.println("도");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("걸");
			break;
		case 4:
			System.out.println("윷");
			break;
		}
		

	}

}
/*
20220414
문제 이해도 : 5 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 4분*/