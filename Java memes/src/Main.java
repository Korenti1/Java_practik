import geo.Calculations;
import geo.Rectangle;
import geo.Triangle;

public class Main {
    public static void main(String[] args ){
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(6);
        rectangle.setHeight(4);

        Triangle triangle = new Triangle();
        triangle.setA(5);
        triangle.setB(4);
        triangle.setC(6);

        Calculations calculations = new Calculations();
        System.out.println("Периметр прямоугольника равен: " + calculations.calculationsRectanglePerimeter(rectangle));
        System.out.println("Площадь прямоугольника равна: " + calculations.calculationsRectangleSquare(rectangle));
        System.out.println("Периметр треугольника равен: " + calculations.calculationsTrianglePerimeter(triangle));
        System.out.println("Площадь треугольника равна: " + String.format("%.3f", (calculations.calculationsTriangleSquare(triangle))));
    }
}