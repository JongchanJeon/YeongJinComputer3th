package CodeUp;

import java.util.Scanner;

public class KJW_Q1411 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []arr=new int[n]; // 받을 정수의 길이 만큼 값이 다 0 인 배열 생성 

		for(int i=0; i<arr.length-1; i++) { // 한 개 빼고 받으니까 길이 -1만큼 반복문 
			int tmp=sc.nextInt(); // 한 개씩 입력 받음 
			arr[tmp-1]++;  // 입력받는 수의 배열 인덱스에 1을 더해줌 
			// 배열의 초기값은 다 0이기 때문에 1이 되면 값이 있다는 말(배열의 인덱스는 0부터 시작이기때문에 tmp-1)
		}
		for(int i=0; i<arr.length; i++) { 
			if(arr[i]==0) System.out.print(i+1);
			// 기존 배열이 다 0이었고, 입력받은 수의 인덱스엔 1을 더했기 때문에 입력 안받은 곳만 0이 됨   
		}
	}

}
/* 20220508 
 * 문제 이해도 : 5 (1 ~ 5 사이 숫자)
 * 문제 해결 : O
 * 코딩 시간 : 3분
 */
