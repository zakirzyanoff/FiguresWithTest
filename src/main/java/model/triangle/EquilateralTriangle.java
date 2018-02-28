package model.triangle;

public class EquilateralTriangle  extends IsoscelesTriangle{
    public EquilateralTriangle(double side) {
        super(side,side);
        this.name = "Равносторонний треугольник";
    }

    @Override
    public String getInfo() {
        return name + " со стороной " + firstSide;
    }

    @Override
    public double getSquare() {
        return Math.sqrt(3)/4*Math.pow(firstSide, 2);
    }
}
