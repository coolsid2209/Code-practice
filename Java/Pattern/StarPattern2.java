package Java.Pattern;

import java.util.Scanner;

public class StarPattern2 {

    public static void main(String[] args) {

        int n, i, j = 1;

        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        for (i = j; i <= n; i++) {
            for (j = i; j <= n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }