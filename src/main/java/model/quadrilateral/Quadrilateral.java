package model.quadrilateral;

import jdk.jshell.spi.ExecutionControl;
import model.FigureBase;
import model.Validator;


public class Quadrilateral extends FigureBase{

    private final String ERROR_MESSAGE= "Четырехугольник с задаными сторонами не может существовать";
    double firstSide;
    double secondSide;
    double thirdSide;
    double fourthSide;

    Validator validator = new Validator();
        if (validator.validateTriangle(firstSide,secondSide,thirdSide,fourthSide)) {
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.fourthSide= fourthSide;
        this.name = "Треугольник";
    }else {
        throw new IllegalArgumentException(ERROR_MESSAGE);
    }

    @Override
    public double getPerimeter() {
        return firstSide+secondSide+thirdSide+fourthSide;
    }

    @Override
    public String getInfo() {
        return name + " со сторонами "+ firstSide+ ", "+secondSide+ ", "+thirdSide++ ", "+fourthSide;
    }

    @Override
    public double getSquare() throws ExecutionControl.NotImplementedException{
        String str = "вычисление площади обычного четырёхугольника не реализовано";
        throw new
    }
}
