package geo;

public class Calculations {

    public double calculationsRectangleSquare(Rectangle rectangle){
        return rectangle.getHeight()*rectangle.getLength();
    }

    public int calculationsRectanglePerimeter(Rectangle rectangle){
        return 2*(rectangle.getLength()+rectangle.getHeight());
    }

    public double calculationsTriangleSquare(Triangle triangle){
        double p = (triangle.getA() + triangle.getB() + triangle.getC())/2;
        return Math.sqrt(p *(p - triangle.getA())*(p - triangle.getB())*(p - triangle.getC()));
    }

    public int calculationsTrianglePerimeter(Triangle triangle){
        return triangle.getA() + triangle.getB() + triangle.getC();
    }

}
