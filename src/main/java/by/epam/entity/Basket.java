package by.epam.entity;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls;

    public Basket() {
        this.balls = new ArrayList<>();
    }

    public ArrayList<Ball> getBalls() {
        return balls;
    }

    public void setBalls(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    public void add (Ball ball) {
        this.balls.add(ball);
    }

    public void remove(Ball ball) {
        balls.remove(ball);
    }
}
