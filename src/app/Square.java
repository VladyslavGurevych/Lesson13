package app;

import service.Area;

public class Square implements Area {

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getSquare() {
        return side * side;
    }
}
