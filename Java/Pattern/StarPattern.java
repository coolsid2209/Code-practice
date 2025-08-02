package Java.Pattern;

import java.util.Scanner;

public class StarPattern {

    public static void main(String[] args) {

        int n;

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
