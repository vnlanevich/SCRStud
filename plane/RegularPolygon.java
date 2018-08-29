package by.it.lanevich.plane;

import static java.lang.Math.*;

class RegularPolygon {
    private double a;
    private int n;

    RegularPolygon(double a, int n) throws FigureException {
        try {
            if (n <= 2) {
                throw new FigureException("Количество граней у многоугольника должны быть больше двух!");
            } else if (a <= 0) {
                throw new FigureException("Длинна грани у многоугольника должна быть больше нуля!");
            }
        } catch (FigureException ex) {
            System.out.println(ex.getMessage());
        }
        this.a = a;
        this.n = n;

    }

    public double getR() {
        return (a / (2 * sin(PI / n)));
    }

}
