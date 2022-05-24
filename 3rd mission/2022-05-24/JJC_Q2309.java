package gitup;

import java.util.Arrays;
import java.util.Scanner;

public class JJC_Q2309 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] people = new int[9];
		int[] realFriends = new int[7];
		int result = 0;
		int count = 0;
		boolean check = false;
		for(int i = 0; i < 9; i++) {
			people[i] = sc.nextInt();
			result += people[i];
		}
		result -= 100;
		finish :for(int i = 0; i < 8; i++) {
			for(int j = 1; j < 9 ;j++) {
				if (result == people[i] + people[j]) {
					people[i] = 0;
					people[j] = 0;
					check = true;
					break finish;
				}
			}
		}
		if(check == true) {
		for(int i = 0; i < 9; i++) {
			if (people[i] != 0) {
				realFriends[count] = people[i];
				count++;
			}			
		}
		Arrays.sort(realFriends);
		for(int i = 0 ; i < 7; i++)
			System.out.println(realFriends[i]);
		}
		else {
			Arrays.sort(people);
			for(int i = 0 ; i < 7; i++)
				System.out.println(people[i]);
		}
		
	}
}
/*
20220524
문제이해도 : 3(1~5사이 숫자)
문제 해결 : o
코딩 시간 : 40분
*/

