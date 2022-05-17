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
		
		int result=-1; // result에 임의의 값 정함 
		
		for(int i=0; i<arr.length; i++) {
			if(k<=arr[i]) { // 배열 돌면서 k 이상인 값 찾고 
				result=i+1; break; // result 에 값을 넣으면 포문 나감
			}
		}
		if(result==-1) System.out.print(n+1); // result가 초기값과 같다는 건 이상인 값이 없다는 것 
		else System.out.print(result); // 아니면 result 출력 
	}

}
/* 20220508 
 * 문제 이해도 : 4 (1 ~ 5 사이 숫자)
 * 문제 해결 : O
 * 코딩 시간 : 9분
 */
