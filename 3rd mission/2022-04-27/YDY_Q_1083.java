import java.util.*;

public class YDY_Q_1083 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		char x = 'X';
		for(int i = 1; i <= n; i++) {
			if(i%3 != 0) {
			System.out.print(i+" ");
				}
			if(i%3 == 0) {
				System.out.print(x+" ");
			}
		}
	}

}

/*
2022-04-27
���� ���ص� : 5
���� �ذ� : O
�ڵ� �ð� : 6��
*/