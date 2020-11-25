package by.epam.busket.service;

import by.epam.busket.entity.Ball;
import by.epam.busket.entity.Basket;
import by.epam.busket.entity.Color;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class BasketServiceTest {

    static Basket basket = new Basket();
    static BasketService service = new BasketService();

    @BeforeClass
    public static void initListOfBalls() {
        // Given
        Ball redBall = new Ball(1, Color.RED);
        Ball redBall2 = new Ball(15.5, Color.RED);
        Ball orangeBall = new Ball(1, Color.ORANGE);
        basket.add(redBall);
        basket.add(redBall2);
        basket.add(orangeBall);
    }

    @Test
    public void findWeight() {
        // When
        double actual = service.findWeight(basket);
        // Then
        assertEquals(17.5, actual, 0.0);
    }

    @Test
    public void findColorCount() {
        // Given
        Map<Color, Long> expected = new HashMap<>();
        expected.put(Color.RED, 2l);
        // When
        Map<Color, Long> actual = service.findColorCount(Color.RED, basket);
        // Then
        assertEquals(expected, actual);
    }
}
