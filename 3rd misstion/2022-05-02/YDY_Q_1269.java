import java.util.*;

public class YDY_Q_1269 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// ���ؾ� �ϴ� �� n���� ��.
		
		int a = sc.nextInt(); // ���� ��
		int b = sc.nextInt(); // ���� ��
		int c = sc.nextInt(); // ���� ��
		int n = sc.nextInt(); // �� ��° ��
		int sum = 0;
		
		for(int i = 0; i < n; i++) {
			if(i == 0) {
				sum = a;
			}
			else if (i<n) {
				sum = sum*b+c;
			}
		}
		System.out.println(sum);
	}

}

/*
2022-05-02
���� ���ص� : 5
���� �ذ� : O
�ڵ� �ð� : 4��
*/