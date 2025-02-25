/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    @DisplayName("should display bmi after adding weigth and height of person one")
    void testBmiCalculationPerson1() {
        BMI bmiCalculator = new BMI();
        double person1Bmi = bmiCalculator.calculateBMI(1.75, 70);
        double expected = 22.9;
        assertEquals(expected, person1Bmi);
    }

    @Test
    @DisplayName("should display bmi after adding weigth and height of a person two")
    void testBmiCalculationPerson2() {
        BMI bmiCalculator = new BMI();
        double person1Bmi = bmiCalculator.calculateBMI(1.80, 85);
        double expected = 26.2;
        assertEquals(expected, person1Bmi);
    }
}
