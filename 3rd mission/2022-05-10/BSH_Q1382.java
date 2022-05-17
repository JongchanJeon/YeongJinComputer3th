package CodeUp;

public class BSH_Q1382 {
	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=5; j++) {
				int  mul = i * j;
				System.out.print(j + " x " + i + " = " + String.format("%2d", mul) + "\t");
			}
			System.out.print("\n");
		}

	}

}
/*
20220510
문제이해도:4(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 6분
*/