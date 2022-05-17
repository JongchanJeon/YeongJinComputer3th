package Git;

import java.util.Scanner;

public class BSH_Q15969 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num_of_student = sc.nextInt();

        int max = 0, min = 1000;
        for(int i=0; i<num_of_student; i++) {
            int score = sc.nextInt();
            if(score > max) max = score;
            if(score < min) min = score;
        }
        System.out.println(max - min);
    }
}
/*
 * 20220517
 * 문제이해도:4(1~5사이 숫자)
 * 문제 해결 : o
 * 코딩 시간 : 3분
 */