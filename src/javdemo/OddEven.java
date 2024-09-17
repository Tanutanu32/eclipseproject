package javdemo;

public class OddEven {

    // Function to check if a number is odd or even using bitwise AND
    public static String isOddOrEven(int number) {
        // Get the least significant bit (LSB) using bitwise AND with 1
        if ((number & 1) == 1) {
            return "Odd";  // LSB is 1, so the number is odd
        } else {
            return "Even"; // LSB is 0, so the number is even
        }
    }

    public static void main(String[] args) {
        // Test numbers
        int number1 = 5;
        int number2 = 8;

        System.out.println(number1 + " is " + isOddOrEven(number1));
        System.out.println(number2 + " is " + isOddOrEven(number2));
    }
}
