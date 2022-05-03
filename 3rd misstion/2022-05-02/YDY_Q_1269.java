import java.util.*;

public class YDY_Q_1269 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 구해야 하는 건 n항의 값.
		
		int a = sc.nextInt(); // 시작 값
		int b = sc.nextInt(); // 곱할 값
		int c = sc.nextInt(); // 더할 값
		int n = sc.nextInt(); // 몇 번째 항
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			if(i == 0) {
				sum = a;
			}
			else if (i<n) {
				sum = sum*b+c;
			}
		}
		System.out.println(sum);
	}

}

/*
2022-05-02
문제 이해도 : 5
문제 해결 : O
코딩 시간 : 4분
*/