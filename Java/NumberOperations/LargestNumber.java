package Java.NumberOperations;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

    int a, b, c;

    Scanner sc = new Scanner(System.in);

    a = sc.nextInt();
    System.out.println("Enter value of a : " + a);

    b = sc.nextInt();
    System.out.println("Enter value of b : " + b);

    c = sc.nextInt();
    System.out.println("Enter value of b : " + c);

    if (a > b && a > c) {
        System.out.println(" a is the largest number with value : " + a);
    } else if (b > a && b > c) {
        System.out.println(" b is the largest number with value : " + b);
    } else{
        System.out.println(" c is the largest number with value : " + c);
    }
    
}
}