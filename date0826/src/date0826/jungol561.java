package date0826;

import java.util.Scanner;

public class jungol561 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] ar = new int[10];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

//		for (int i = 0; i < ar.length; i++) {
//			System.out.println(ar[i] + " ");
//		}

		int max = -1, min = 10000;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < 100) {
				if (ar[i] > max) {
					max = ar[i];
				}

			} else {
				if (ar[i] < min) {
					min = ar[i];
				}

			}
		}
		if(max == -1) {
			max = 100;
		}
		if (min == 10000) {
			min = 100;
		}
		System.out.print(max + " " + min);
	}
}