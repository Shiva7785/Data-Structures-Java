package PatterPinting.CompositePatterns;

import java.util.Scanner;

public class NumberTriangleFlipped1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();


//        for (int i = 1; i <= n; i++) {
//            int num = 1;
//            for (int j = 1; j <= n; j++) {
//                if(i+j > n) System.out.print(num++ + " ");
//                else System.out.print(" " + " ");
//
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= i; j++) {
//                System.out.print(j + " ");
                System.out.print((char)j+64 + " ");
            }

            System.out.println();
        }
    }
}
