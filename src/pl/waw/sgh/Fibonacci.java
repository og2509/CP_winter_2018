package pl.waw.sgh;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = 0;
        a = scan.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.print(fibo(i) + " ");
        }
    }

    public static int fibo(int num) {
        if (num <= 2) {
            return 1;
        }
        return fibo(num - 2) + fibo(num - 1);
    }
}