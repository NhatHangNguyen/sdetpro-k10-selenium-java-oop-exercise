package Lab_02;

import java.util.Scanner;

public class lab_2_1 {
    public static void main(String[] args) {

        // Get input from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input your height in cm: ");
        float yourHeight = scanner.nextFloat();

        System.out.print("Please input your weight in kg: ");
        float yourWeight = scanner.nextFloat();

        // Calculate BMI
        float bmi = (100*100*yourWeight) / (yourHeight * yourHeight);
        System.out.printf("Your BMI is: %.1f", bmi);

        if (bmi <= 18.5){
            System.out.println("=> You are underweight");
        } else if (bmi <= 24.9){
            System.out.println("=> You are normal weight");
        } else if (bmi <= 29.9){
            System.out.println("=> You are overweight");
        } else {
            System.out.println("=> You are obesity");
        }
    }
}
