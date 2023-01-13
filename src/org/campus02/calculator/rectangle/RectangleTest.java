package org.campus02.calculator.rectangle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RectangleTest {

    Rectangle rectangle;


    // ALT + Einfg um setUp zu generieren
    @BeforeEach
    void setUp() {
        rectangle = new Rectangle(2,4);

    }

    @Test
    void berechneUmfang() {
        int umfang = rectangle.berechneUmfang();
        Assertions.assertEquals(12, umfang);
    }

    @Test
    @DisplayName("Test die berechnung der Fläche")
    void berechneFlaeche() {
        Assertions.assertEquals(8, rectangle.berechneFlaeche());

    }
}