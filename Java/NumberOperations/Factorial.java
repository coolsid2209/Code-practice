package Java.NumberOperations;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        int input;
         int output = 1;

        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();

        for (int i =  1; i <= input; i++) {
            output = i * output;
            System.out.println("Factorial of " + input + " is " + output);
        }
    }
    
}
