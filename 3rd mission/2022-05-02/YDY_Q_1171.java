import java.util.*;

public class YDY_Q_1171 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
		
		System.out.print(a);
		
		if(b < 10) {
			System.out.print(0);
		}
		System.out.print(b);
		
		if(c < 100) {
			System.out.print(0);
		}
		if(c < 10) {
			System.out.print(0);
		}
		System.out.print(c);
	}
}

/*
2022-05-02
문제 이해도 : 0
문제 해결 : X
코딩 시간 : 15분
*/
