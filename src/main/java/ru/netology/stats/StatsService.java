package ru.netology.stats;

public class StatsService {

    public long sumSales (long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public long averageSale(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int maximumSaleMonthIndex (long[] sales) {
        long currentMaximum = sales[0];
        int index = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] >= currentMaximum) {
                currentMaximum = sales[i];
                index = i;
            }
        }
        return index + 1;
    }

    public int minimumSaleMonthIndex (long[] sales) {
        long currentMinimum = sales[0];
        int index = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] <= currentMinimum) {
                currentMinimum = sales[i];
                index = i;
            }
        }
        return index + 1;
    }

    public int countMonthBelowAverageSale (long[] sales) {
        long average = averageSale(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    public int countMonthAboveAverageSale (long[] sales) {
        long average = averageSale(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}
