package CodeUp;
import java.util.Scanner;
public class Q1068_BSH {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		if(score >= 90 && score <= 100) {
			System.out.println('A');
		}else if(score >= 70) {
			System.out.println('B');
		}else if(score >= 40) {
			System.out.println('C');
		}else
			System.out.println('D');
		
	}

}
/*
���� ���ص� : 4 (1 ~ 5 ���� ����)
���� �ذ� : O
�ڵ� �ð� : 8��*/