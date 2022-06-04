package _2022_06_06;

import java.util.*;

public class YDY_Q17618 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
        int result = 0;
        
        for (int i = 1; i <= n; i++) {
            int sum = 0, temp = i;
            while (temp != 0) {
                sum += (temp % 10);
                temp /= 10;
            }

            if (i % sum == 0) result++;
        }

        System.out.println(result);
    }
}

/*
 * 2022-06-06
 * ���� ���ص� : 4
 * ���� �ذ� : O 
 * �ڵ� �ð� : 48��
 */