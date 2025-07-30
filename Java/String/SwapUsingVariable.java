// How to swap 2 no using 3rd variable in java Program

package Java.String;

import java.util.Scanner;

public class SwapUsingVariable {

    public static void main(String[] args) {

        int a, b, temp;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        System.out.println("Enter value of a : " + a);

        b = sc.nextInt();
        System.out.println("Enter value of b : " + b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("Value of a after swapping : " + a);
        System.out.println("Value of b after swapping : " + b);
        
    }
    
}
