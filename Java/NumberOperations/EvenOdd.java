package Java.NumberOperations;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        int input;

        Scanner sc = new Scanner(System.in);
        
        input = sc.nextInt();

        if(input % 2 == 0) {

            System.out.println(input + " is even");
        } else {
            System.out.println(input + " is odd");
        }
    }
    
}
