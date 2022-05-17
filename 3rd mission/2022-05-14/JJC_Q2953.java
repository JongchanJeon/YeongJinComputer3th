package gitup;

import java.util.Arrays;
import java.util.Scanner;

public class JJC_Q2953 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[5][4];
		int[] result = new int[5];
		int arr = 0;
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 4; j++) {
				a[i][j] = sc.nextInt();
				result[i] += a[i][j];
			}
			if (result[arr] < result[i]) {
				arr = i;
			}
		}
		Arrays.sort(result);
		System.out.println(arr + 1 + " " + result[4]);
	}

}
/*
20220514
문제 이해도 : 5 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 6분*/
