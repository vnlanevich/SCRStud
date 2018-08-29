package by.it.lanevich.plane;

class Circle extends Point {
    private double r;

    //конструктор с входными параметрами
    Circle(double x, double y, double r) throws FigureException {
        try {
            if (r <= 0) {
                throw new FigureException("Радиус окружности должен быть больше нуля!");
            }
        } catch (FigureException ex) {
            System.out.println(ex.getMessage());
        }

        this.x = x;
        this.y = y;
        this.r = r;

    }

    Circle(Point o, double r) {
        this.x = o.x;
        this.r = r;
    }

    public void isEqualArea(Circle circle1) {
        if (this.r == circle1.r) System.out.println("Площади окружностей равны");
    }

}


