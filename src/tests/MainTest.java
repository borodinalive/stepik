package tests;

import com.company.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test()
    @DisplayName("Fact test for 0")
    public void test0() {
        assertEquals(BigInteger.valueOf(1), Main.getFact(0));
    }

    @Test()
    @DisplayName("Fact test for 7")
    public void test7() {
        assertEquals(BigInteger.valueOf(105), Main.getFact(7));
    }

}
