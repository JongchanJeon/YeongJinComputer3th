package CodeUp;

import java.util.*;

public class Q1068_DaYeon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0; 
		int a = sc.nextInt();
		
		for(int i = 1; i <= a; i++) {
			if(i%2 == 0) {
				sum += i;			
			}
		}
		System.out.println(sum);
	}

}

/*
���� ���ص� : 5 (1 ~ 5 ���� ����)
���� �ذ� : O
�ڵ� �ð� : 3��
*/