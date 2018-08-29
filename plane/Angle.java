package by.it.lanevich.plane;

import static java.lang.Math.*;

class Angle extends Point {

    Angle(double degree) {
        x = tan(toRadians(degree));
        y = 0;
    }

    Angle(Point angle) {
        this.x = angle.x;
        this.y = 0;
    }

    public void isPerpendicular(Angle angle1) {
        
        if ((double) round((this.x * angle1.x) * 100000) / 100000 == -1.0)
            System.out.println("Углы задают перпендикулярные прямые");
    }
}

