package _2022_06_06;

import java.util.*;

public class YDY_Q17614 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		
		for (int i = 1; i <= n; i++) {
			int num = i;
			String s = Integer.toString(i);
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == '3' || s.charAt(j) == '6'|| s.charAt(j) == '9') {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}

/*
 * 2022-06-06
 * ���� ���ص� : 3
 * ���� �ذ� : O 
 * �ڵ� �ð� : 64��
 */