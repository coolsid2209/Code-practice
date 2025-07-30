// How to swap 2 no without using 3rd variable Program in java

package Java.NumberOperations;

import java.util.Scanner;

public class SwapWithoutVariable {

    public static void main(String[] args) {

        int a, b;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        System.out.println("Enter value of a : " + a);

        b = sc.nextInt();
        System.out.println("Enter value of b : " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Value of a after swapping : " + a);
        System.out.println("Value of b after swapping : " + b);
    }
    
}
