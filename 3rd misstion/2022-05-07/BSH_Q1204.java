package CodeUp;
import java.util.Scanner;
public class BSH_Q1204 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num >= 1 && num <= 99) {
			if(num%10==2 && num != 12) {
				System.out.println(num + "nd");
			}else if(num%10==3 && num!=13) {
				System.out.println(num + "rd");
			}else if(num%10==1 && num!=11) {
				System.out.println(num + "st");
			}else
				System.out.println(num + "th");
		}

	}

}
/*
20220507
�������ص� : 4(1~5���� ����)
���� �ذ� : o
�ڵ� �ð� : 9��
*/