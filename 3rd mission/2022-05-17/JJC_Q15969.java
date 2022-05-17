package gitup;

import java.util.Arrays;
import java.util.Scanner;

public class JJC_Q15969 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[] a = new int[count];
		for(int i = 0 ; i < count; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int result = a[count - 1] - a[0];
		System.out.println(result);
	}

}
/*
20220517
문제 이해도 : 5 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 2분*/
