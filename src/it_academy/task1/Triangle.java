package it_academy.task1;

public class Triangle extends Figure {
    private double baseOfTriangle;
    private double height;

    public Triangle (double baseOfTriangle, double height){
        this.baseOfTriangle = baseOfTriangle;
        this.height = height;
    }

    @Override
    public String name() {
        return "Triangle";
    }

    @Override
    public Double area() {
        return baseOfTriangle * height / 2;
    }
}