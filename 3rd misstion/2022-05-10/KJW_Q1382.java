package CodeUp;

public class KJW_Q1382 {

	public static void main(String[] args) {
		for(int i=1; i<=9; i++ ) {
			for(int j=2; j<=5; j++) {
				if(i*j<10) 
				System.out.printf("%d x %d = %2d\t", j,i,i*j); 
				else System.out.printf("%d x %d = %d\t", j,i,i*j); 
			}
			System.out.println();
		}	
	}
}

/* 20220508
 * 문제 이해도 : 4 (1 ~ 5 사이 숫자)
 * 문제 해결 : O
 * 코딩 시간 : 5분
 */