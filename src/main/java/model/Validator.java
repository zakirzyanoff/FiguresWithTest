package model;

public class Validator {
    /**
     * метод проверки входных параметров
     * @param firstSide первая сторона
     * @param secondSide вторая сторона
     * @param thirdSide третья сторона
     * @return результат проверки
     */

    public boolean validateTriangle(double firstSide, double secondSide, double thirdSide){
        return validateDouble(firstSide) && validateDouble(secondSide) && validateDouble(thirdSide) && validateTriangleSide(firstSide,secondSide,thirdSide);
    }

    public boolean validateDouble(double value){return value>0 && Double.isFinite(value);
    }

    public boolean validateTriangleSide(double firstSide, double secondSide, double thirdSide){
        return firstSide+secondSide>thirdSide &&
                secondSide+thirdSide>firstSide &&
                firstSide+thirdSide>secondSide;
    }
}
