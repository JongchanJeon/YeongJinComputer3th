package _2022_05_15;

import java.util.ArrayList;
import java.util.Scanner;

public class YDY_Q2605 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		ArrayList list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(sc.nextInt(),i+1);
		}
		for (int i = n-1; i >= 0; i--) {
			System.out.print(list.get(i)+" ");
		}
		
	}
}
/*
2022-05-24
���� ���ص� : 5
���� �ذ� : O
�ڵ� �ð� : 7��
*/