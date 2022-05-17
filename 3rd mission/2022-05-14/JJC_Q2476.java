package gitup;

import java.util.Arrays;
import java.util.Scanner;

public class JJC_Q2476 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		int[][] a = new int[count][3];
		int[] result = new int[count];
		for(int i = 0 ; i < count; i++) {
			for(int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
			Arrays.sort(a[i]);
		}
		for(int i = 0 ; i < count; i++) {
			if(a[i][0] == a[i][1] && a[i][1] == a[i][2])
				result[i] = a[i][0] * 1000 + 10000;
			else if (a[i][0] == a[i][1] || a[i][1] == a[i][2])
				result[i] = a[i][1] * 100 + 1000;
			else 
				result[i] = a[i][2] * 100;
		}
		Arrays.sort(result);
		System.out.println(result[count - 1]);
	}

}
/*
20220514
문제 이해도 : 3 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 15분*/