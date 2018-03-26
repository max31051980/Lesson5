package it_academy.task1;

public class Rectangle extends Figure{
    private double height;
    private double width;

    public Rectangle (double height, double width){
        this.height = height;
        this.width = width;
    }

    @Override
    public String name() {
        return "Rectangle";
    }

    @Override
    public Double area() {
        return height * width;
    }
}