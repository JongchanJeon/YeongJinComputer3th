package CodeUp;
import java.util.Scanner;
public class Q1078_BSH {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1; i<=num; i++) {
			if(i%2==0) {
				sum += i;
			}
		}
		System.out.print(sum);
	}

}
/*
���� ���ص� : 4 (1 ~ 5 ���� ����)
���� �ذ� : O
�ڵ� �ð� : 8��*/