package CodeUp;
import java.util.Scanner;
public class BSH_Q1173 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m<30 && h>0) {
			h = h - 1;
			m = 30 + m;
			System.out.println(h + " " + m);
		}else if(m>=30 && h>0){
			m = m - 30;
			System.out.println(h + " " + m);
		}else if(h==0 && m>=30){
			h = 0;
			m = m - 30;
			System.out.println(h + " " + m);
		}else if(h==0 && m<30) {
			h = 23;
			m = 30 + m;
			System.out.println(h + " " + m);
		}

	}

}
/*
20220507
문제이해도:3(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 15분
*/