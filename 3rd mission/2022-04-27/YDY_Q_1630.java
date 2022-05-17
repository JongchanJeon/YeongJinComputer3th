import java.util.*;

public class YDY_Q_1630 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String[] song = new String[n];
		
		for(int i = 0; i < n; i++) {
			song[i] = sc.next();
			System.out.println(song[i]);
			if(i != n-1) {
				System.out.println("AMOLED");
			}
		}
		
	}

}

/*
2022-04-27
문제 이해도 : 2
문제 해결 : O
코딩 시간 : 11분
*/