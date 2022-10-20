package HandWrittenWeek6Hw;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

/** Write a Java program to convert a decimal number to binary number.
 * Input Data : Input a Decimal Number : 5
 * Expected Output : Binary numb is : 101
 */
public class Programme_17_DecimalToBinary {
    public static void main(String[] args) {
        // Scanner declaration for reading input from console
        System.out.println("Welcome to Java program to convert decimal to binary numbers");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter decimal number : ");
        int number = scanner.nextInt();
        convertDecimalToBinary(number);
        //Closing scanner object
        scanner.close();
    }
    // Converting decimal to binary
    public static void convertDecimalToBinary(int number){
        String binary = Integer.toBinaryString(number);
        System.out.println("The binary vakue is : " + binary);
    }
}
