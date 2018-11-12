package tests;

import com.company.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test()
    @DisplayName("Pie test for 15 and 15")
    public void testEqualsNumbers() {
        assertEquals(15, Main.getPiecesNumber(15, 15));
    }

    @Test()
    @DisplayName("Pie test for 7 and 5")
    public void testNumbers7_5() {
        assertEquals(35, Main.getPiecesNumber(7, 5));
    }

    @Test()
    @DisplayName("Pie test for 12 and 16")
    public void testNumbers12_16() {
        assertEquals(48, Main.getPiecesNumber(12, 16));
    }

    @Test()
    @DisplayName("Pie test for 36 and 48")
    public void testNumbers36_48() {
        assertEquals(144, Main.getPiecesNumber(36, 48));
    }

    @Test()
    @DisplayName("Pie test for 60 and 24")
    public void testNumbers60_24() {
        assertEquals(120, Main.getPiecesNumber(60, 24));
    }

    @Test()
    @DisplayName("Pie test for 60 and 15")
    public void testNumbers60_15() {
        assertEquals(60, Main.getPiecesNumber(60, 15));
    }

}
