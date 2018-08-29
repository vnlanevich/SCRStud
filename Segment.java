package by.it.lanevich.plane;


import static java.lang.Math.*;

class Segment extends Point {
    private double xEnd, yEnd;

    Segment(double x1, double y1, double x2, double y2) throws FigureException {
       try{ if ((x1 == x2) && (y1 == y2)) {
            throw new FigureException("Начало отрезка совпадает с концом!");
        }} catch (FigureException ex) {
           System.out.println(ex.getMessage());
       }
        x = x1;
        y = y1;
        xEnd = x2;
        yEnd = y2;

    }


    Segment(Point begin, Point end) throws FigureException {
        try {
            if ((begin.x == end.x) && (begin.y == end.y)) {
                throw new FigureException("Начало отрезка совпадает с концом!");
            }
        } catch (FigureException ex) {
            System.out.println(ex.getMessage());
        }
        x = begin.x;
        y = begin.y;
        xEnd = end.x;
        yEnd = end.y;

    }

    Segment(Segment segment) {
        this.x = x;
        this.y = y;
        this.xEnd = xEnd;
        this.yEnd = yEnd;
    }

    private double getLenght() {
        return sqrt(pow((xEnd - x), 2) + pow((yEnd - y), 2));
    }


    public void isEquals(Segment s) {
        if (this.getLenght() == s.getLenght())
            System.out.println("Длинна отрезков равна");
    }

}
