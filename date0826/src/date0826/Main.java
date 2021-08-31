package date0826;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, inp, cnt = 0;
		
		do {
			inp = sc.nextInt();
			sum += inp;
			cnt++;
		} while (inp < 100 );
				sc.close();
				
		System.out.println(sum);
		System.out.printf("%.1f\n", (double) sum / cnt);
	}
}