package CodeUp;
import java.util.Scanner;
public class BSH_Q1409 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] s = new int[10];
		
		for(int i=0; i<s.length; i++) {
			s[i] = sc.nextInt();
		}
		int num = sc.nextInt();
		System.out.print(s[num-1]);

	}

}

/*
20220502
�������ص� : 2(1~5���� ����)
���� �ذ� : o
�ڵ� �ð� : 15��
*/