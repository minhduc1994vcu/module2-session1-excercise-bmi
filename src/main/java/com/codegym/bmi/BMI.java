package com.codegym.bmi;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your weight: ");
        float weight = scanner.nextFloat();
        System.out.print("enter you height: ");
        float height = scanner.nextFloat();
        float bmi = weight / (height * height);

        if (bmi < 18.5) {
            System.out.print(bmi + " Under weight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.print(bmi + " Normal");
        } else if ((bmi >= 25) && (bmi < 30)) {
            System.out.print(bmi + " Over weight");
        } else {
            System.out.print(bmi + " obese");
        }
    }
}
