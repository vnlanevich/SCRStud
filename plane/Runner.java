package by.it.lanevich.plane;

public class Runner {
    public static void main(String[] args) throws FigureException {
        //#1-1 Segment
        Segment segment1 = new Segment(1.0, 1.0, 2.0, 2.0);
        Segment segment2 = new Segment(3.0, 0.0, 1.0, 1.0);
        // Segment segment3 = new Segment(-3.0, 0.0, 1.0, 1.0);
        // Segment segment3 = new Segment(0, 0, 0, 0);
        segment1.isEquals(segment2);
        //  segment3.isEquals(segment2);
        //#1-2 Complex
        Complex complex1 = new Complex(1.0, 3.0);
        Complex complex2 = new Complex(-1.0, 2.0);
        System.out.println("Модуль суммы двух комплексных чисел равен : " + complex1.getModules(complex2));
        //#1-3 Line
        Line line1 = new Line(2.0, 8.0);
        Line line2 = new Line(8.0, 3.0);
        line1.isParallel(line2);
        //#1-4 Angle
        Angle alfa = new Angle(10.0);
        Angle beta = new Angle(280.0);
        alfa.isPerpendicular(beta);
        //#2-1 Circle
        Circle c1 = new Circle(0.0, 0.0, 12.0);
        Circle c2 = new Circle(3.0, 5.0, 11.0);
        c1.isEqualArea(c2);
        //#2-2 Triangle
        Triangle triangle1 = new Triangle(3.0, 4.0);
        Triangle triangle2 = new Triangle(5.0, 6.0);
        triangle1.isSimilarTriangles(triangle2);
        //#2-3 RegularPolygon
        RegularPolygon regularPolygon1 = new RegularPolygon(6.0, 7);
        System.out.println("Радиус описанной вокруг многоугольника окужности r = " + regularPolygon1.getR());
        //#2-4 Rectangle
        Rectangle rectangle1 = new Rectangle(3.0, 8.0);
        Rectangle rectangle2 = new Rectangle(6.0, 4.0);
        rectangle1.isEqualAreaRectangles(rectangle2);
        //      System.out.println(rectangle1.getArea()+ " равны? " + rectangle1.isAreaEquals(rectangle1,rectangle2));

    }
}
