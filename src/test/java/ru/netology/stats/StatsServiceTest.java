package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void shouldCalcSumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 180;
        int actualDay = service.sumSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);

    }
    @Test

    public void shouldCalcAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 15;
        int actualDay = service.averageSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }
    @Test

    public void shouldCalcMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 8;
        int actualDay = service.maxSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }
    @Test

    public void shouldCalcMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 9;
        int actualDay = service.minSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }
    @Test

    public void shouldCalcBelowTheAverageSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 5;
        int actualDay = service.belowTheAverageSale(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }
    @Test

    public void shouldCalcAboveAveragesale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedDay = 5;
        int actualDay = service.aboveAverageSale(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }
}
