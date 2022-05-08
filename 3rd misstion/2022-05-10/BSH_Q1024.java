package CodeUp;
import java.util.Scanner;
public class BSH_Q1024 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
		
		for(int i=0; i<s.length(); i++) {
			char s2 = s.charAt(i);
			System.out.printf("\'%c\'\n", s2);
		}

	}
}
/*
20220510
문제이해도:4(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 10분
*/