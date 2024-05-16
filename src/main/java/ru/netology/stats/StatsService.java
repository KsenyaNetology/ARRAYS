package ru.netology.stats;

public class StatsService {
    public int sumSales(long[] sales) {
        int sumsales = 0;
        for (long s : sales) {
            sumsales += s;
        }

        return sumsales;
    }

    public int averageSales(long[] sales) {
        int averagesales = (int) sales[0];
        int sumsales = sumSales(sales);
        for (long s : sales) {
            averagesales = (int) (sumsales / sales.length);
        }

        return averagesales;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int belowTheAverageSale(long[] sales) {
        int belowtheaverege = 0;
        int averagesales = averageSales(sales);
        for (long s : sales) {
            if (s < averagesales) {
                belowtheaverege++;
            }
        }

        return belowtheaverege;
    }

    public int aboveAverageSale(long[] sales) {
        int aboveaverege = 0;
        int averagesales = averageSales(sales);
        for (long s : sales) {
            if (s > averagesales) {
                aboveaverege++;
            }
        }

        return aboveaverege;


    }
}