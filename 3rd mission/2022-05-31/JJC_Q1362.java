package gitup;

import java.util.Scanner;

public class JJC_Q1362 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int genWeight = sc.nextInt();
		double minWeight = genWeight / 2;
		int maxWeight = genWeight * 2;
		int weight = sc.nextInt();
		int count = 0;
		int forRip = 0;
		while (true) {
			if (weight > 0 || forRip == 1) {
				char a = sc.next().charAt(0);
				int b = sc.nextInt();
			if (a == 'F' ) {
				weight += b;
			}else if(a == 'E') {
				weight -= b;
			}else if (a == '#' && b == 0){
				count += 1;
				if (forRip == 1)
					System.out.println("RIP");
				else if(weight > minWeight && weight < maxWeight)
					System.out.println(count +" :-)");
				else
					System.out.println(count +" :-(");
				genWeight = sc.nextInt();
				minWeight = genWeight / 2;
				maxWeight = genWeight * 2;
				weight = sc.nextInt();
				forRip = 0;
				if(genWeight == 0 && weight == 0) 
					break;
			}
			}else {
				forRip = 1;	
			}
			

	}

	}
}
