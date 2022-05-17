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
문제 이해도 : 4 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 8분*/