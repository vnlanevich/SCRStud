package by.it.lanevich.plane;

class Rectangle{
    private double a;
    private double b;

    Rectangle(double a, double b)  throws FigureException {
        try{
        if ((a <= 0) || (b <= 0)) {
            throw new FigureException("Длинна стороны у прямоугольника должна быть больше нуля!");
        }} catch (FigureException ex) {
            System.out.println(ex.getMessage());
        }

        this.a = a;
        this.b = b;

    }

    public void isEqualAreaRectangles(Rectangle rectangle1){

        if(a * b == rectangle1.a * rectangle1.b) System.out.println("Прямоугольники равны по площади");
    }
}
