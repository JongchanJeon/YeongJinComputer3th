package CodeUp;
import java.util.Scanner;
public class BSH_Q1380 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		int a = 0;
		
		for(int i=1; i<=6; i++) {
			a = k - i;
			if(a<=6 && a>=1) {
				System.out.println(i + " " + a);
			}
		}

	}
}
/*
20220502
�������ص�:4(1~5���� ����)
���� �ذ� : o
�ڵ� �ð� : 7��
*/
