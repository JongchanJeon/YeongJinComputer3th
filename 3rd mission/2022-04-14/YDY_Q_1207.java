import java.util.*;

public class YDY_Q_1207 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if(a+b+c+d == 1) {
			System.out.println("도");
		}
		if(a+b+c+d == 2) {
			System.out.println("개");
		}
		if(a+b+c+d == 3) {
			System.out.println("걸");
		}
		if(a+b+c+d == 4) {
			System.out.println("윷");
		}
		if(a+b+c+d == 0) {
			System.out.println("모");
		}
		
		
	}

}
/*
2022-04-14
문제 이해도 : 1
문제 해결 : O
코딩 시간 : 12분
*/