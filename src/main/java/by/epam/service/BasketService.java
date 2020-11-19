package by.epam.service;

import by.epam.entity.Basket;
import by.epam.entity.Color;

import java.util.HashMap;
import java.util.Map;

public class BasketService {
    public double findWeight (Basket basket) {
        double res = basket.getBalls().stream().mapToDouble(b -> b.getWeight()).sum();
        return res;
    }
    public Map<Color, Long> findColorCount (Color color, Basket basket) {
        long res = basket.getBalls().stream().filter(b -> b.getColor().equals(color)).count();
        Map<Color, Long> map = new HashMap<>();
        map.put(color, res);
        return map;
    }
}
