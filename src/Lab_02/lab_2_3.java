package Lab_02;

import java.util.Scanner;

public class lab_2_3 {
    public static void main(String[] args) {

        // Get input from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please input your height in cm: ");
        float yourHeight = scanner.nextFloat();

        System.out.print("Please input your weight in kg: ");
        float yourWeight = scanner.nextFloat();

        // Calculate BMI
        float bmi = (100*100*yourWeight) / (yourHeight * yourHeight);
        System.out.printf("Your BMI is: %.1f\n", bmi);

        float increaseWeight = (18.6f - bmi) * (yourHeight * 2);
        float decreaseWeight = (bmi - 24.9f) * (yourHeight * 2);

        if (bmi < 18.5) {
            System.out.printf("=> You need to increase %.0f kg\", increaseWeight");
        } else if (bmi <= 24.9) {
            System.out.println("=> You are perfect");
        } else {
            System.out.printf("=> You need to decrease %.0f kg", decreaseWeight);
        }
    }
}
