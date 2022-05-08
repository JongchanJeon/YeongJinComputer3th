package CodeUp;

import java.util.Scanner;

public class KJW_Q1411 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n];

		for(int i=0; i<arr.length-1; i++) {
			int tmp=sc.nextInt();
			arr[tmp-1]++;
		}
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) System.out.print(i+1);
		}
	}

}
/* 20220508 
 * 문제 이해도 : 5 (1 ~ 5 사이 숫자)
 * 문제 해결 : O
 * 코딩 시간 : 3분
 */