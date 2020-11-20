package by.epam.entity;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Ball> balls;

    public Basket() {
        this.balls = new ArrayList<>();
    }

    public List<Ball> getBalls() {
        return balls;
    }

    public void setBalls(List<Ball> balls) {
        this.balls = balls;
    }

    public void add (Ball ball) {
        this.balls.add(ball);
    }

    public void remove(Ball ball) {
        balls.remove(ball);
    }
}
