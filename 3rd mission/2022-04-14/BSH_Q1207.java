package CodeUp;
import java.util.Scanner;
public class BSH_Q1207 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i=0; i<4; i++) {
			int input = sc.nextInt();
			sum = sum + input;
		}
		
		if(sum==1) {
			System.out.print("도");
		}else if(sum==2) {
			System.out.print("개");
		}else if(sum==3) {
			System.out.print("걸");
		}else if(sum==4) {
			System.out.print("윷");
		}else if(sum==0) {
			System.out.print("모");
		}
		
		/*
		 20220414
		 문제이해도:1(1~5사이 숫자)
		 문제 해결 : o
		 코딩 시간 : 13분
		 */

	}
}
