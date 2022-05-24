package gitup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JJC_Q2605 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		List<Integer> student = new ArrayList<Integer>();
		for(int i = 0; i < count; i++) {
			student.add(i + 1);
		}
		for(int i = 0 ; i < count; i++) {
			int change = sc.nextInt();
			if (change == 0)
				continue;
			student.remove(i);
			student.add(i - change, i + 1);
		}
		for(int i = 0 ; i < count ; i++) {
			System.out.print(student.get(i) + " ");
		}
		
	}
}
/*
20220524
문제이해도 : 2(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 40분
*/
