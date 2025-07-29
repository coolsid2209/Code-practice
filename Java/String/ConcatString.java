// Different ways to join strings

package Java.String;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class ConcatString {

    private static void stringConcat() {

        String input1 = "Hello";
        String input2 = "World!";

        // 1. using .concat()
        String result1 = input1.concat(" ").concat(input2);
        System.out.println("Using concat() method : " + result1);

        // 2. using (+) operator
        String result2 = input1 + " " + input2;
        System.out.println("Using (+) operator : " + result2);

        // 3. using stringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append(input1).append(" ").append(input2);
        String result3 = sb.toString();
        System.out.println("Using stringBuilder method : " + result3);

        // 4. using .join()
        String result4 = String.join(" ", input1, input2);
        System.out.println("Using .join() method : " + result4);

        // 5. using .format()
        String result5 = String.format("%s %s", input1, input2);
        System.out.println("Using .format() method : " + result5);

        // 6. using stringJoiner
        StringJoiner str = new StringJoiner(" ");
        str.add(input1);
        str.add(input2);
        String result6 = str.toString();
        System.out.println("Using stringJoiner method : " + result6);

        // 7. using streams()
        List<String> words = Arrays.asList(input1, input2);
        String result7 = words.stream().collect(Collectors.joining(" "));
        System.out.println("Using streams() method : " + result7);

    }

    public static void main(String[] args) {
        stringConcat();

    }

}
