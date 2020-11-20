package by.epam.service;

import by.epam.entity.Ball;
import by.epam.entity.Basket;
import by.epam.entity.Color;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BasketServiceTest {

    private static final Basket basket = new Basket();
    private static final BasketService service = new BasketService();
    private double expectedForWeight = 17.5;
    private static final Map<Color, Long> expectedForColorCount = new HashMap<>();
    private double delta = 0.0;

    @BeforeClass
    public static void initListOfBalls() {
        // Given
        Ball redBall = new Ball(1, Color.RED);
        Ball redBall2 = new Ball(15.5, Color.RED);
        Ball orangeBall = new Ball(1, Color.ORANGE);
        basket.add(redBall);
        basket.add(redBall2);
        basket.add(orangeBall);
        expectedForColorCount.put(Color.RED, 2l);
    }

    @Test
    public void findWeight() {
        // When
        double actual = service.findWeight(basket);
        // Then
        assertEquals(expectedForWeight, actual, delta);
    }

    @Test
    public void findColorCount() {
        // When
        Map<Color, Long> actual = service.findColorCount(Color.RED, basket);
        // Then
        assertEquals(expectedForColorCount, actual);
    }
}
