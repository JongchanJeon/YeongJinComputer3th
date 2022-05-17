import java.util.*;

public class YDY_Q_1367 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 높이 입력
		
		for(int i = 1; i < n+1; i++) {
			for(int j = 0; j<n-i; j++) {
				System.out.print(".");
			}
		for(int k = 0; k < n; k++) {
				System.out.print("*");
		}
			System.out.println();
		}
	}
}

/*
2022-05-02
문제 이해도 : 4
문제 해결 : O
코딩 시간 : 25분
*/