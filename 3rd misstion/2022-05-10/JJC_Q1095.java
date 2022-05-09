package gitup;

import java.util.Arrays;
import java.util.Scanner;
public class JJC_Q1095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[num];
		for(int i = 0; i < num; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[0]);
		

	}

}
/*
20220510
문제 이해도 : 5 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 7분*/