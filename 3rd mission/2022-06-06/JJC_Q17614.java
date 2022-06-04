package CodeUp;

import java.util.Scanner;

public class JJC_Q17614 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int result = 0;
		for(int i = 1; i <= a; i++) {
			String number = Integer.toString(i);
			for(int j = 0; j < number.length(); j++) {
				if(number.charAt(j) == '3' || number.charAt(j) == '6' || number.charAt(j) == '9') {
					result++;
				}
			}
		}
		System.out.println(result);
		

	}

}
/*
20220604
문제 이해도 : 5 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 10분
*/
