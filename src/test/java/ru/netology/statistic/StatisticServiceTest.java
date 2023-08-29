package ru.netology.statistic;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
public class StatisticServiceTest {
    @Test
    void findMax() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void test() {
        StatisticService service = new StatisticService();
        long[] incomesInBillions = {3, 8, 13};
        long expected = 13;
        long actual = service.findMax(incomesInBillions);
        Assertions.assertEquals(expected, actual);

    }
}


