package CodeUp;
import java.util.Scanner;
public class BSH_Q1367 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		
		for(int i=1; i<=h; i++) {
			for(int j=1; j<=2 * h - i; j++) {
				if(j <= h - i) {
					System.out.print(" ");
				}else
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
/*
20220502
�������ص� : 2(1~5���� ����)
���� �ذ� : x
�ڵ� �ð� : 20��
*/