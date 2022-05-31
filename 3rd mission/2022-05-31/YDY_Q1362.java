package _2022_05_31;

import java.util.Scanner;

public class YDY_Q1362 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      boolean alive = true; // 살았니, 죽었니 ?
      String action = null; // 작용? E = 감소, F = 증가
      int num = 0; // 얼마나?
      int count = 1; // 시나리오

      while (true) {
         int o = sc.nextInt(); // 적정 체중
         int w = sc.nextInt(); // 실제 체중
         action = ".";
         num = 1;
         alive = true;

         if (o == 0 && w == 0)
            break;

         while (!(action == "#" && num == 0)) {
            action = sc.next();
            num = sc.nextInt();
            if (action == "E") {
               w -= num;
               if (w <= 0)
                  alive = false;
            } else if (action == "F") {
               w += num;
            }
         }
         if (alive == true && w > o / 2 && w < o * 2) {
            System.out.println(count + " :-)");
            count++;
         }
         else if (alive == true) {
            System.out.println(count + " :-(");
            count++;
         }
         else if (alive == false) {
            System.out.println(count + " RIP");
            count++;
         }
      }

   }
}

/*
 * 2022-05-31 
 * 문제 이해도 : 0
 * 문제 해결 : X
 * 코딩 시간 : 4일
 */