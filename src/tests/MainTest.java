package tests;

import com.company.Main;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test()
    @DisplayName("Turtle test #1")
    public void test1() {
        List<String> list = new ArrayList<>();
        list.add("North 10");
        list.add("West 20");
        list.add("South 30");
        list.add("East 40");

        assertEquals("20 -20", Main.getCoords(list));
    }

    @Test()
    @DisplayName("Turtle test #2")
    public void test2() {
        List<String> list = new ArrayList<>();
        list.add("North 30");
        list.add("West 20");
        list.add("South 30");
        list.add("East 40");

        assertEquals("20 0", Main.getCoords(list));
    }

    @Test()
    @DisplayName("Turtle test #3")
    public void test3() {
        List<String> list = new ArrayList<>();
        list.add("North 10");
        list.add("West 20");
        list.add("South 30");
        list.add("East 40");
        list.add("North 20");

        assertEquals("20 0", Main.getCoords(list));
    }


}
