package CodeUp;
import java.util.Scanner;
public class BSH_Q2633 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		int[] s = new int[n];
		
		for(int i=0; i<s.length; i++) {
			s[i] = sc.nextInt();
			if(s[i]>=k) {
				System.out.println(i+1);
				break;
			}else if(s[i]<k) {
				count++;
				if(count==n) System.out.println(n+1);
			}
		}
		
	}
}
/*
20220510
�������ص�:4(1~5���� ����)
���� �ذ� : o
�ڵ� �ð� : 25��
*/
