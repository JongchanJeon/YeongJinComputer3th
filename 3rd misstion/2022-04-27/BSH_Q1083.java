package CodeUp;
import java.util.Scanner;
public class BSH_Q1083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i%3==0) {
				System.out.print("X ");
			}else
				System.out.printf("%d ", i);
		}

	}

}
/*
20220427
�������ص�:3(1~5���� ����)
���� �ذ� : o
�ڵ� �ð� : 10��
*/