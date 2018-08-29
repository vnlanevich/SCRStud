package by.it.lanevich.plane;

import java.text.ParseException;

class Triangle {
    private double cathet1;
    private double cathet2;

    Triangle(double cathet1, double cathet2) throws FigureException {
        try {
            if ((cathet1 <= 0) || (cathet2 <= 0)) {
                throw new FigureException("Длинна катетов у треугольника должна быть больше нуля!");
            }
        } catch (FigureException ex) {
            System.out.println(ex.getMessage());
        }
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
    }

    Triangle(Triangle triangle) {
        this.cathet1 = triangle.cathet1;
        this.cathet2 = triangle.cathet2;

    }

    public void isSimilarTriangles(Triangle t) {
        if ((cathet1 / cathet2) == (t.cathet1 / t.cathet2)) System.out.println("Треугольники подобны");
    }

}
