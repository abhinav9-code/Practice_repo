package java_practice;

import java.util.Scanner;

public class PyramidInConsole {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter height of the pyramid: ");
        int n = sc.nextInt();

        // Upper part of the pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        // Lower part of the pyramid
        for (int i = n - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        sc.close();
    }
}