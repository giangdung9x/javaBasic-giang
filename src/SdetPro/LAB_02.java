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
    }
}
