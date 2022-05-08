package CodeUp;

import java.util.Scanner;

public class KJW_Q2633 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(), k=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int result=-1;
		
		for(int i=0; i<arr.length; i++) {
			if(k<=arr[i]) {
				result=i+1; break;
			}
		}
		if(result==-1) System.out.print(n+1);
		else System.out.print(result);
	}

}
/* 20220508 
 * 문제 이해도 : 4 (1 ~ 5 사이 숫자)
 * 문제 해결 : O
 * 코딩 시간 : 9분
 */