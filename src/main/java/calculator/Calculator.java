package calculator;

import java.util.*;

public class Calculator {
    protected List<Double> results;
    protected List<Double> areaResults;

    public Calculator() {
        this.results = new ArrayList<>();
        this.areaResults = new ArrayList<>();
    }

    public List<Double> getResults() {
        return results;
    }

    public void setResults(List<Double> results) {
        this.results = results;
    }

    public List<Double> getAreaResults() {
        return areaResults;
    }

    public void setAreaResults(List<Double> areaResults) {
        this.areaResults = areaResults;
    }

    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }

    public void inquiryResults() {
        for (double element : results) {
            System.out.println(element);
        }
    }

    public void inquiryAreaResults() {
        for (double element : areaResults) {
            System.out.println(element);
        }
    }
}

