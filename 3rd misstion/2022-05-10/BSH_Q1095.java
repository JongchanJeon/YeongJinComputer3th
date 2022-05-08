package CodeUp;
import java.util.Scanner;

public class BSH_Q1095 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int []s = new int[n];
		int min = 23;
		
		for(int i=0; i<n; i++) {
			int n2 = sc.nextInt();
			s[i] = n2;
			if(s[i] < min) {
				min = s[i];
			}
		}
		System.out.println(min);
	}

}
/*
20220510
문제이해도:4(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 9분
*/