package CodeUp;

import java.util.Scanner;

public class JJC_Q17618 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		
		int result = 0;
		for(int i = 1; i <= a; i++) {
			String stringNumber = Integer.toString(i);
			int sumResult = 0;
			for(int j = 0 ; j < stringNumber.length(); j++) {
				sumResult += Integer.parseInt(String.valueOf(stringNumber.charAt(j)));
			}
			if (i % sumResult == 0) {
				result++;
		}
		
		}
		System.out.println(result);
	}

}
/*
20220604
���� ���ص� : 4 (1 ~ 5 ���� ����)
���� �ذ� : O
�ڵ� �ð� : 15��
*/
