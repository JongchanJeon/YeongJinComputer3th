package CodeUp;
import java.util.Scanner;
public class BSH_Q1082 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String s;
		
		s = sc.next();
		
		int num = Integer.parseInt(s, 16);
		
		if(num>=10 && num<=15) {
			for(int i=1; i<=15; i++) {
				int mul = num * i;
				String s2 = Integer.toHexString(mul);
				String s3 = Integer.toHexString(i);
				System.out.println(s + "*" + s3.toUpperCase() + "=" + s2.toUpperCase());
		}
		}
		
	}

}
/*
20220507
문제이해도:4(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 25분
*/