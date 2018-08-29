package by.it.lanevich.plane;

class Point {
    double x, y;

    public Point(Point point) {
        x = point.x;
        y = point.y;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
	x=0;
	y=0;
    }
}
