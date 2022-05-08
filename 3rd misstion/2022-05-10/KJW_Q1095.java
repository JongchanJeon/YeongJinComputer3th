package CodeUp;

import java.util.Arrays;
import java.util.Scanner;

public class KJW_Q1095 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print(arr[0]);
	}

}

/* 20220508
 * 문제 이해도 : 5 (1 ~ 5 사이 숫자)
 * 문제 해결 : O
 * 코딩 시간 : 1분
 */