import java.util.*;

public class YDY_Q_1671 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		if(i == 0) {
			if(j == 1) {
				System.out.println("win");
			}
			else if (j == 0) {
				System.out.println("tie");
			}
			else {
				System.out.println("lose");
			}
		}
		if(i == 1) {
			if(j == 1) {
				System.out.println("tie");
			}
			else if(j == 0) {
				System.out.println("win");
			}
			else {
				System.out.println("lose");
			}
		}
		if(i == 2) {
			if (j == 2) {
				System.out.println("tie");
			}
			else if(j == 0) {
				System.out.println("win");
			}
			else {
				System.out.println("lose");
			}
		}
	}

}

/*
2022-04-27
���� ���ص� : 1
���� �ذ� : X
�ڵ� �ð� : 10�� �ʰ�
*/