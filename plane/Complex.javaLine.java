package by.it.lanevich.plane;

class Line extends Point {

    //конструктор с входными параметрами
    Line(double k, double b) {
        this.x = k;
        this.y = b;
    }

    Line(Point line) {
        this.x = line.x;
        this.y = line.y;
    }

    public void isParallel(Line l) {
        if (this.x == l.x)
            System.out.println("Прямые параллельны");
    }

}


