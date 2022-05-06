package _2202_05_07;
import java.util.*;

public class YDY_Q_1123 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		double F = (double)C*9/5+32;
		
		String st = String.format("%.3f", F);
		System.out.printf(st);
	}

}

/*
2022-05-07
문제 이해도 : 4
문제 해결 : O
코딩 시간 : 9분
*/