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
���� ���ص� : 5 (1 ~ 5 ���� ����)
���� �ذ� : O
�ڵ� �ð� : 10��
*/
