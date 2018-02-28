package model.triangle;

import static java.lang.Math.*;

public class RightTriangle extends Triangle {
    private final String ERROR_MESSAGE= "Треугольник с задаными сторонами не является прямоугольным";

    @Override
    public String getInfo() {
        return name +" с катетами " + firstSide +" и "+ secondSide +" и гипотенузой " + thirdSide;
    }

    public RightTriangle(double firstSide, double secondSide, double thirdSide) {
        super(firstSide, secondSide, thirdSide);
        if(thirdSide == Math.sqrt(Math.pow(firstSide,2)+Math.pow(secondSide,2))){
            this.firstSide = firstSide;
            this.secondSide = secondSide;
            this.thirdSide = thirdSide;
            this.name = "Прямоугольный треугольник";
        }else {
            throw new IllegalArgumentException(ERROR_MESSAGE);
        }
    }

    @Override
    public double getSquare() {
        return firstSide*secondSide/2;
    }
}
