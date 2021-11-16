package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shoudSumSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService stats = new StatsService();
        long expected = 180;

        long actual = stats.sumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shoudAverageSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService stats = new StatsService();
        long expected = 15;

        long actual = stats.averageSale(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shoudMaximumSaleMonthIndex() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService stats = new StatsService();
        long expected = 8;

        long actual = stats.maximumSaleMonthIndex(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shoudMinimumSaleMonthIndex() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService stats = new StatsService();
        long expected = 9;

        long actual = stats.minimumSaleMonthIndex(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shoudCountMonthBelowAverageSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService stats = new StatsService();
        long expected = 5;

        long actual = stats.countMonthBelowAverageSale(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shoudCountMonthAboveAverageSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService stats = new StatsService();
        long expected = 5;

        long actual = stats.countMonthAboveAverageSale(sales);

        assertEquals(expected, actual);
    }
}