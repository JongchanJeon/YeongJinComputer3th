import java.util.*;

public class YDY_Q_1089 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int d = sc.nextInt();
		int n = sc.nextInt();
		int s = 0;
		
		for(int i = a; i <= n; i++) {
			s = (d*n+d)-d;
		}
		System.out.println(s);
		
	}

}

/*
2022-04-27
문제 이해도 : 0
문제 해결 : X
코딩 시간 : 17분
*/