package CodeUp;
import java.util.Scanner;
public class BSH_Q1230 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int car_h = 170;
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(car_h < a && car_h < b && car_h < c) 
			System.out.println("PASS");
		else if(car_h >= a)
			System.out.println("CRASH" + " " + a);
		else if(car_h < a && car_h >= b)
			System.out.println("CRASH" + " " + b);
		else if(car_h < a && car_h < b && car_h >= c)
			System.out.println("CRASH" + " " +c);

	}

}
/*
20220507
�������ص�:3(1~5���� ����)
���� �ذ� : o
�ڵ� �ð� : 9��
*/