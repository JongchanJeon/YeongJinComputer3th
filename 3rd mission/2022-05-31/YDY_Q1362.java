package _2022_05_31;

import java.util.Scanner;

public class YDY_Q1362 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      boolean alive = true; // ��Ҵ�, �׾��� ?
      String action = null; // �ۿ�? E = ����, F = ����
      int num = 0; // �󸶳�?
      int count = 1; // �ó�����

      while (true) {
         int o = sc.nextInt(); // ���� ü��
         int w = sc.nextInt(); // ���� ü��
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
 * ���� ���ص� : 0
 * ���� �ذ� : X
 * �ڵ� �ð� : 4��
 */