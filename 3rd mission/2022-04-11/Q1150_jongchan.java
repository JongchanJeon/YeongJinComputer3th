package CodeUp;
import java.util.Arrays;
import java.util.Scanner;
public class Q1150_jongchan {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[3];
		for (int i = 0; i < 3; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[0]);

	}

}
/*
���� ���ص� : 5 (1 ~ 5 ���� ����)
���� �ذ� : O
�ڵ� �ð� : 3��*/