package by.epam.service;

import by.epam.entity.Ball;
import by.epam.entity.Basket;
import by.epam.entity.Color;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BasketServiceTest {

    Ball redBall = new Ball(1, Color.RED);
    Ball redBall2 = new Ball(15.5, Color.RED);
    Ball orangeBall = new Ball(1, Color.ORANGE);
    Basket basket = new Basket();

    double expectedForWeight = 17.5;
    Map<Color, Long> expectedForColorCount = new HashMap<>();
    double delta = 0.0;

    @Test
    public void findWeight() {
        // Given
        basket.add(redBall);
        basket.add(redBall2);
        basket.add(orangeBall);
        BasketService service = new BasketService();
        // When
        double actual = service.findWeight(basket);
        // Then
        assertEquals(expectedForWeight, actual, delta);
    }

    @Test
    public void findColorCount() {
        // Given
        basket.add(redBall);
        basket.add(redBall2);
        basket.add(orangeBall);
        BasketService service = new BasketService();
        // When
        Map<Color, Long> actual = service.findColorCount(Color.RED, basket);
        expectedForColorCount.put(Color.RED, 2l);
        // Then
        assertEquals(expectedForColorCount, actual);
    }
}
