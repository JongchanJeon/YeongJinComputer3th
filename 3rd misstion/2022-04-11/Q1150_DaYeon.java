package CodeUp;

import java.util.*;

public class Q1150_DaYeon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min = 0;
		
		if(a>b && b>c) {
			min += c;
		}
		else if(b>c && c>a) {
			min += a;
		}
		else if(c>a && a>b) {
			min += b;
		}
		System.out.println(min);
	}
}

/*
���� ���ص� : 5 (1 ~ 5 ���� ����)
���� �ذ� : O
�ڵ� �ð� : 2��
*/