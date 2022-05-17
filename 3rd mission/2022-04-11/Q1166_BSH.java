package CodeUp;
import java.util.Scanner;
public class Q1166_BSH {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if((year%4==0&&year%100!=0)||year%400==0) {
			System.out.print("yes");
		}else
			System.out.print("no");

	}
}
/*
문제 이해도 : 4 (1 ~ 5 사이 숫자)
문제 해결 : O
코딩 시간 : 3분*/