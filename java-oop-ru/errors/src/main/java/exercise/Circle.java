package exercise;

import static java.lang.Math.PI;

// BEGIN
public class Circle {
    Point point;
    int radius = 0;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }
    public double getSquare() throws NegativeRadiusException {
        if (getRadius() < 0)
            throw new NegativeRadiusException("Не удалось посчитать площадь");
        return PI*Math.pow(radius,2);
    }
}
// END
