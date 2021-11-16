package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldSumSales() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService stats = new StatsService();
        long expected = 180;

        long actual = stats.sumSales(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService stats = new StatsService();
        long expected = 15;

        long actual = stats.averageSale(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaximumSaleMonthIndex() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService stats = new StatsService();
        long expected = 8;

        long actual = stats.maximumSaleMonthIndex(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinimumSaleMonthIndex() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService stats = new StatsService();
        long expected = 9;

        long actual = stats.minimumSaleMonthIndex(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthBelowAverageSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService stats = new StatsService();
        long expected = 5;

        long actual = stats.countMonthBelowAverageSale(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCountMonthAboveAverageSale() {
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService stats = new StatsService();
        long expected = 5;

        long actual = stats.countMonthAboveAverageSale(sales);

        assertEquals(expected, actual);
    }
}