package _2022_05_21;

import java.util.*;

public class YDY_Q14681 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt(), y = sc.nextInt();

		if (x > 0 && y > 0)
			System.out.println(1);
		else if (x < 0 && y > 0)
			System.out.println(2);
		else if (x < 0 && y < 0)
			System.out.println(3);
		else
			System.out.println(4);
	}
}

/*
2022-05-21
���� ���ص� : 5
���� �ذ� : O
�ڵ� �ð� : 4��
*/