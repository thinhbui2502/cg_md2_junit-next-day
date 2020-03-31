import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @org.junit.jupiter.api.Test
    void testShowNextFirstDayOfJanIn2018() {
        int number = 1;
        int month = 1;
        int year = 2018;
        int expected = 2;

        int result = NextDayCalculator.showNextDay(number, month, year);
        assertEquals(expected, result);
    }

    @Test
    void TestShowNextLastDayOfJanIn2018() {
        int number = 31;
        int month = 1;
        int year = 2018;
        int expected = 1;

        int result = NextDayCalculator.showNextDay(number, month, year);
        assertEquals(expected, result);

    }

    @Test
    void TestShowNextLastDayOfAprilIn2018() {
        int day = 30;
        int month = 4;
        int year = 2018;
        int expected = 1;

        int result = NextDayCalculator.showNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void TestShowNextLastDayOfFebIn2018() {
        int day = 28;
        int month = 2;
        int year = 2018;
        int expected = 1;

        int result = NextDayCalculator.showNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void TestShowNextLastDayOfFebIn2020() {
        int day = 29;
        int month = 2;
        int year = 2020;
        int expected = 1;

        int result = NextDayCalculator.showNextDay(day, month, year);
        assertEquals(expected, result);
    }

    @Test
    void TestShowNextLastDayOfDecIn2018() {
        int day = 31;
        int month = 12;
        int year = 2018;
        int expected = 1;

        int result = NextDayCalculator.showNextDay(day, month, year);
        assertEquals(expected, result);
    }
}