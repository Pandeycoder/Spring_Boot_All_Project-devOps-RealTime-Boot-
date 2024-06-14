package array;

import java.util.Scanner;

public class FloatDecimal_Check {
    public static void main(String[] args) {
        float arr[] = new float[5];
        Scanner sc = new Scanner(System.in);

        // Input numbers into the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number " + (i + 1) + " :- ");
            arr[i] = sc.nextFloat();
        }

        // Array to store numbers with decimal after first digit being zero
        float[] resultArr = new float[arr.length];
        int resultIndex = 0; // Index for resultArr

        // Process each number to check and store if condition is met
        for (int i = 0; i < arr.length; i++) {
            // Convert float to string to easily manipulate digits
            String numStr = Float.toString(arr[i]);

            // Check if the decimal part after the first digit is zero
            if (numStr.contains(".")) {
                int dotIndex = numStr.indexOf('.');
                if (dotIndex + 2 < numStr.length()) {
                    char secondDigitAfterDecimal = numStr.charAt(dotIndex + 2);
                    if (secondDigitAfterDecimal == '0') {
                        resultArr[resultIndex++] = arr[i];
                    }
                }
            }
        }

        // Print numbers with decimal after first digit being zero
        System.out.println("Numbers with decimal after first digit being zero:");
        for (int i = 0; i < resultIndex; i++) {
            System.out.println(resultArr[i]);
        }

        sc.close(); // Close the scanner
    }
}
