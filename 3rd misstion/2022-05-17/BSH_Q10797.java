package Git;

import java.util.Scanner;

public class BSH_Q10797 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt();
        int count = 0;

        for(int i=0; i<5; i++){
            int cars_num = sc.nextInt();
            if(day==cars_num) count++;
        }
        System.out.println(count);
    }
}
/*
 * 20220517
 * 문제이해도:4(1~5사이 숫자)
 * 문제 해결 : o
 * 코딩 시간 : 5분
 */