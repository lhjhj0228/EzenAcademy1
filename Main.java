package java5;


import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
 
        double[] arr = {85.6, 79.5, 83.1, 80.0 ,78.2 ,75.0};

		double sum = arr[num1-1] + arr[num2-1];

		System.out.printf("%.1f", sum);
    }
}
  