package Java.String;

import java.util.Scanner;

public class StringComparison {

    public static void main(String[] args) {

        String s1, s2;

        Scanner input = new Scanner(System.in);

        s1 = input.nextLine();
        System.out.println("Value of s1 is : " + s1);
        s2 = input.nextLine();
        System.out.println("Value of s2 is : " + s2);

        // 1. Based on .compareTo() method which compares value
        if (s1.compareTo(s2) == 0) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

        // 2. Based on .equals() method which compares value
        if (s1.equals(s2)) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

        // 3. Based on == operator which compares references
        if (s1 == s2 ) {
            System.out.println("String are equal based on reference : " + " \n s1 hashCode is: " +  s1.hashCode() + " \n s2 hashCode is : " + s2.hashCode());
        } else {
            System.out.println("String are not equal based on reference : " + "\n s1 hashCode is : " +  s1.hashCode() + " \n s2 hashCode is : " + s2.hashCode());
        }
    }
    
}
