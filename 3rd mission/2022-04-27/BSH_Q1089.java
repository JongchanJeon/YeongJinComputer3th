package CodeUp;
import java.util.Scanner;
public class BSH_Q1089 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		for(int i=1; i<=n-1; i++) {
			a = a + d;
		}
		System.out.print(a);

	}

}
/*
20220427
문제이해도:3(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 10분
*/