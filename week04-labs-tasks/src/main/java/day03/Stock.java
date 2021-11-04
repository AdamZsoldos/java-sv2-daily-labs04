package day03;

import java.util.Collections;
import java.util.List;

public class Stock {

    private final List<Double> stocks;

    public Stock(List<Double> stocks) {
        this.stocks = stocks;
    }

    public double maxProfit() {
        double result = 0;
        double min;
        double max;
        for (int i = 0; i < stocks.size() - 1; i++) {
            min = max = stocks.get(i);
            for (int j = i + 1; j < stocks.size(); j++) {
                if (stocks.get(j) > max) max = stocks.get(j);
            }
            if (max - min > result) result = max - min;
        }
        return result;
    }

    public double maxProfitWithSubList() {
        double result = 0;
        List<Double> subList;
        double min;
        double max;
        for (int i = 0; i < stocks.size() - 1; i++) {
            subList = stocks.subList(i + 1, stocks.size());
            min = stocks.get(i);
            max = Collections.max(subList);
            if (max - min > result) result = max - min;
        }
        return result;
    }
}
