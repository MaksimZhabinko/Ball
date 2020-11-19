package by.epam.report;

import by.epam.entity.Color;

import java.util.Map;

public class BasketReport {
    public void printWeight (double ballWeight) {
        System.out.println("Total weight: " + ballWeight);
    }
    public void printColorCount (Map<Color, Long> colorCount) {
        String color = String.valueOf(colorCount.keySet()).replaceAll("\\p{P}","");;
        String value = String.valueOf(colorCount.values()).replaceAll("\\p{P}","");;
        System.out.println("Number of " + color + " balls " + value);
    }
}
