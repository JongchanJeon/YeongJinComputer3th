package CodeUp;
import java.util.Scanner;
public class BSH_Q1411 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[]s = new int[n];
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i=0; i<s.length - 1; i++) {
			s[i] = sc.nextInt();
			sum1 = s[i]+sum1;
		}
		
		for(int i=1; i<=n; i++) {
			sum2 = sum2+i;
		}
		System.out.println(sum2 - sum1);

	}

}
/*
20220510
�������ص�:4(1~5���� ����)
���� �ذ� : o
�ڵ� �ð� : 6��
*/