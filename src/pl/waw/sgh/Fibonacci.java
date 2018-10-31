package pl.waw.sgh;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int run = sc.nextInt();

        int numA = 1;
        int numB = 0;
        int result = 0;

        while (true) {
            result = numA + numB;
            numB = numA;
            numA = result;
            System.out.println(result);
            if (result >= run)
                break;
        }

        sc.close();
    }
}
