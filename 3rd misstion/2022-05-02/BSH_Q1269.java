package CodeUp;
import java.util.Scanner;
public class BSH_Q1269 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i=1; i<n; i++) {
			int sum = (a * b) + c;
			a = sum;
		}
		System.out.println(a);

	}

}
/*
20220502
�������ص�:4(1~5���� ����)
���� �ذ� : o
�ڵ� �ð� : 7��
*/