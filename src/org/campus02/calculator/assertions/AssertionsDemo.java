package org.campus02.calculator.assertions;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AssertionsDemo {

    // 1. Step: Setup
    int a;
    String s;

    // Wird vor jedem Testcase (@Test) aufgerufen
    @BeforeEach
    void setUp() {
        a = 1;
        s = "Hallo Welt";

        System.out.println("before each");
    }

    // 2. Step: Exercise
    @Test
    @DisplayName("Test assertEquals")
    void assertEqualsTest() {
        // assertEquals(expectedValue, actualValue)
        // Es werden zwei Werte miteinander verglichen
        int actual = 1;
        Assertions.assertEquals(a, actual);
    }

    @Test
    void assertTrueTest(){
        String halloWelt = "hallo welt";
        String lower = s.toLowerCase();

        Assertions.assertTrue(halloWelt.equals(lower));
        Assertions.assertTrue(a > 0);

    }


    // 3. Step: Verify

    //Es wird geprüft ob die Bedienung falsch ist
    @Test
    void assertFalseTest(){
        Assertions.assertFalse(a < 0);
    }

    @Test
    void assertThrowsTest(){
        int[] array = new int [1];

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int i = array[1];
        });
    }

    // 4. Step: Tear-Down

    @AfterEach
    void tearDown() {
        // wird nach jedem Testcase ausgeführt
        System.out.println("after each");
    }
}
