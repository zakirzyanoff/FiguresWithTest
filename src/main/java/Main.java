
import model.FigureBase;
import model.triangle.EquilateralTriangle;
import model.triangle.IsoscelesTriangle;
import model.triangle.RightTriangle;
import model.triangle.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FigureBase[] figures = {
                    new Triangle(2, 3, 4),
                    new IsoscelesTriangle(4,5),
                    new EquilateralTriangle(8),
                    new RightTriangle(3,4,5)};
             for (int i =0; i<figures.length;i++){
                System.out.println(figures[i].getInfo());
                System.out.println("Периметр: " + figures[i].getPerimeter());
                 System.out.println("Площадь " + figures[i].getSquare());
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
