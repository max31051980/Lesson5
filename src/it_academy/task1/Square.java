package it_academy.task1;

public class Square extends Figure{
    private double width;

    public Square(double width) {
        this.width = width;
    }

    @Override
    public String name() {
        return "Square";
    }

    @Override
    public Double area() {
        return width * width;
    }
}