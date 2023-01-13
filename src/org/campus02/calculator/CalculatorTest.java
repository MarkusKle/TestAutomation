package org.campus02.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    // Step 2: exercise

    @Test
    void add() {
        // das Ergebnis der Methode
        int result = Calculator.add(2,2);
        // erwartetes Ergebnis
        int erwartet = 4;


        // Step 3: verify
        // Vergleiche erwartetes Ergebnis mit tatsächlichem
        Assertions.assertEquals(erwartet, result); // STRG + P


    }

    @Test
    void subract() {
        int result = Calculator.subract(5,5);
        int erwartet = 0;
        Assertions.assertEquals(erwartet, result);
    }

    @Test
    void multiply() {
        Assertions.assertEquals(30, Calculator.multiply(5,6));
        Assertions.assertEquals(25, Calculator.multiply(5,5));
    }
}