package CodeUp;
import java.util.Scanner;
public class BSH_Q1293_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] s = new int[n];
		int max = 0;
		int min = 100;
		
		for(int i=0; i<n; i++) {
			s[i] = sc.nextInt();
			if(s[i] > max) {
				max = s[i];
			}else if(s[i] < min) {
				min = s[i];
			}
				
		}
		System.out.print(max + " " + min);
		

}
}