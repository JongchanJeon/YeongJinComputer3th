import java.util.*;

public class YDY_Q_1380 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt(); // �� �ֻ��� ���� ��
		
		for(int i = 1; i<=6; i++) {
			for(int j = 1; j<=6; j++) {
				if(k == i+j) {
					System.out.println(i+" "+j);
				}
			}
		}
	}

}

/*
2022-05-02
���� ���ص� : 5
���� �ذ� : O
�ڵ� �ð� : 3��
*/