package SdetPro;

import java.util.Scanner;

public class LAB_02 {
    public static void main(String[] args) {
/*
Lab 2.1:
- Get input from user about height(m) and weight(kg) then calculate BMI
- Underweight = <18.5
-Normal weight = 18.5 – 24.9
- Overweight = 25–29.9
-Obesity = BMI of 30 or greater
****BMI = weight / (height x 2)

Lab 2.2:
Allow user to input a number, print out it’s an odd or even number

Lab 2.3(Optional):
Lab 2.1 + Suggest user to increase/decrease weight
*/

        Scanner scanner = new Scanner(System.in);

        //Lab 2.1
        System.out.println("Lab 2.1");
        System.out.print("Input weight(kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Input height(m): ");
        double height = scanner.nextDouble();
        double bmi = weight/(height * height);
        if(bmi<18.5){
            System.out.println(bmi + " :Underweight");
        } else if (bmi>=18.5 && bmi<=24.9) {
            System.out.println(bmi + " :Normal weight");
        } else if (bmi>=25 && bmi <= 29.9) {
            System.out.println(bmi + " :Overweight");
        } else if (bmi>=30) {
            System.out.println(bmi + " :Obesity");
        }
        System.out.println("-------------------------------------");

        //Lab 2.2
        System.out.println("Lab 2.2");
        System.out.print("Input n: ");
        int n = scanner.nextInt();
        int sodu = n%2;
        if(sodu == 0) {
            System.out.println(n + " is even number");
        } else{
            System.out.println(n + " is odd number");
        }
        System.out.println("-------------------------------------");


        //Lab 2.3
        System.out.println("Lab 2.3");
        System.out.print("Input weight(kg): ");
        double weight23 = scanner.nextDouble();
        System.out.print("Input height(m): ");
        double height23 = scanner.nextDouble();
        double bmi23 = weight/(height * height);
        if(bmi<18.5){
            System.out.println(bmi + " :Underweight" + "- You should review your diet or eat more diligently.");
        } else if (bmi>=18.5 && bmi<=24.9) {
            System.out.println(bmi + " :Normal weight" + " - You should continue to maintain it.");
        } else if (bmi>=25 && bmi <= 29.9) {
            System.out.println(bmi + " :Overweight" + "- You are overweight, adjust your diet and exercise harder.");
        } else if (bmi>=30) {
            System.out.println(bmi + " :Obesity" + " If you are in this group, it is quite dangerous. You need to review your nutrition regimen, consult your doctor as well as hire a personal PT to guide you on how to exercise most effectively.");
        }
        System.out.println("-------------------------------------");
    }
}
