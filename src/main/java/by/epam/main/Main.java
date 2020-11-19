package by.epam.main;

import by.epam.entity.Ball;
import by.epam.entity.Basket;
import by.epam.entity.Color;
import by.epam.report.BasketReport;
import by.epam.service.BasketService;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Ball redBall = new Ball(1, Color.RED);
        Ball redBall2 = new Ball(15.5, Color.RED);
        Ball redBall3 = new Ball(25.9, Color.RED);
        Ball orangeBall = new Ball(1, Color.ORANGE);
        Ball yellowBall = new Ball(1, Color.YELLOW);
        Ball greenBall = new Ball(1, Color.GREEN);
        Ball blueBall = new Ball(1, Color.BLUE);
        Ball purpleBall = new Ball(1, Color.PURPLE);

        Basket basket = new Basket();
        basket.add(redBall);
        basket.add(redBall2);
        basket.add(redBall3);
        basket.add(orangeBall);
        basket.add(yellowBall);
        basket.add(greenBall);
        basket.add(blueBall);
        basket.add(purpleBall);

        BasketService service = new BasketService();
        double ballWeight = service.findWeight(basket);
        Map<Color, Long> colorCount = service.findColorCount(Color.RED, basket);

        BasketReport report = new BasketReport();
        report.printWeight(ballWeight);
        report.printColorCount(colorCount);
    }
}
