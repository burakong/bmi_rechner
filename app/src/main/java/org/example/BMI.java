package org.example;

public class BMI {

    public double calculateBMI(double height, double weight) {
        double bmi = weight / (height * height);
        return Math.round(bmi * 10.0) / 10.0;
    }
}
