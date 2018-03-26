package it_academy.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figure> figures = new ArrayList<>();
        Figure figure = new Circle(5);               // mojno dobovlyat tak - figures.add(new Circle(5);
        figures.add(figure);
        figures.add(new Rectangle(3, 4 ));
        figures.add(new Square(5));
        figures.add(new Triangle(3, 4));
        outPrintFigure(figures);
    }

    public static void outPrintFigure (ArrayList<Figure> figures) {
        for (Figure figure: figures){
            System.out.println("Name " + figure.name());
            System.out.println("Area of " + figure.name() + " " + figure.area());
        }
    }
}