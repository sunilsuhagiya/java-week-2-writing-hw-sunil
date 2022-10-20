package HandWrittenWeek6Hw;

import java.util.Locale;
import java.util.Scanner;

/**
 * Write a java program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUpperToLowerCase {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string :  ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLowerCase t = new Programme_9_ConvertUpperToLowerCase();
        t.convertUppercaseToLowerCase(uppercase);
        // Closing the scanner object
        scanner.close();
    }
    public void convertUppercaseToLowerCase(String text){
        System.out.println("The Lowercase value is =   " + text.toLowerCase());
    }
}
