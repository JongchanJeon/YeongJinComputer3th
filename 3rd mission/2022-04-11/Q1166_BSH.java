package CodeUp;
import java.util.Scanner;
public class Q1166_BSH {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if((year%4==0&&year%100!=0)||year%400==0) {
			System.out.print("yes");
		}else
			System.out.print("no");

	}
}
/*
���� ���ص� : 4 (1 ~ 5 ���� ����)
���� �ذ� : O
�ڵ� �ð� : 3��*/