package PatterPinting.CompositePatterns;

import java.util.Scanner;

public class StarDiamond8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();


        int nsp = n-1;
        int nst = 1;
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }

            nsp--;
            nst += 2;
            System.out.println();
        }

        nsp = 1;
        nst -= 4;
        // n-1 total bcoz I have to print 7 lines in above I have printed 4 lines
        for (int i = 1; i <= n-1 ; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("*" + " ");
            }

            nsp++;
            nst -= 2;
            System.out.println();
        }
    }
}
