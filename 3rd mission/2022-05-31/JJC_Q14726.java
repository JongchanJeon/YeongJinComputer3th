package gitup;

import java.util.Scanner;

public class JJC_Q14726 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		for(int i = 0 ; i < count; i++) {
			String num = sc.next();
			int result = 0;
			for(int j = 15; j >= 0; j--) {
				int temp = num.charAt(j) - '0';
				if(j % 2 == 0) {
					if ((num.charAt(j) - '0') * 2 >= 10)
						result += ((num.charAt(j) - '0') * 2 / 10) + ((num.charAt(j) - '0') * 2 % 10);
					else
						result += (num.charAt(j) - '0') * 2;
				}else {
					result += num.charAt(j) - '0';
				}
			}
			if (result % 10 == 0)
				System.out.println("T");
			else 
				System.out.println("F");
		}
		

	}

}
/*
20220531
문제 이해도 : 4 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 20분
*/

