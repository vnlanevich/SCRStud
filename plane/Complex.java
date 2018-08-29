package by.it.lanevich.plane;

import static java.lang.Math.*;

class Complex extends Point {

    Complex(double re, double im) {
        x = re;
        y = im;
    }

    Complex(Point complex) {
        this.x = x;
        this.y = y;
    }

    public double getModules(Complex complex1) {

        return sqrt(pow((this.x + complex1.x), 2.0)
                + pow((this.y + complex1.y), 2.0));
    }

}

