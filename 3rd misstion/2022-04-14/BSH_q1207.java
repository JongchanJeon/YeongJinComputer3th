package CodeUp;
import java.util.Scanner;
public class BSH_q1207 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		for(int i=0; i<4; i++) {
			int input = sc.nextInt();
			sum = sum + input;
		}
		
		if(sum==1) {
			System.out.print("��");
		}else if(sum==2) {
			System.out.print("��");
		}else if(sum==3) {
			System.out.print("��");
		}else if(sum==4) {
			System.out.print("��");
		}else if(sum==0) {
			System.out.print("��");
		}
		
		/*
		 20220414
		 �������ص�:1(1~5���� ����)
		 ���� �ذ� : o
		 �ڵ� �ð� : 13��
		 */

	}
}
