package Lab_02;

import java.util.Scanner;

public class lab_2_2 {
    public static void main(String[] args) {

        // Get input from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input your number: ");
        int yourNumber = scanner.nextInt();

        if (yourNumber % 2 == 0) {
            System.out.println("Your input number is even number");
        } else {
            System.out.println("Your input number is odd number");
        }
    }
}
