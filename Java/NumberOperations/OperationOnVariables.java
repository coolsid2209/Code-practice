// Different mathematical operation on variables

package Java.NumberOperations;

import java.util.Scanner;

public class OperationOnVariables {

    public static void main(String[] args) {

        int addition, subtract, multiplication, division;
        int x, y;

        Scanner input = new Scanner(System.in);

        x = input.nextInt();
        System.out.println("Input value of x : " + x);

        y = input.nextInt();
        System.out.println("Input value of y : " + y);

        addition = x + y;
        System.out.println("Sum of x and y : " + addition);

        subtract = x - y;
        System.out.println("Subtraction of x and y : " + subtract);

        multiplication = x * y;
        System.out.println("Multiplication of x and y : " + multiplication);
        
        division = x / y;
        System.out.println("Division of x and y : " + division);

    }
}