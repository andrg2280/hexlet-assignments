package exercise;

// BEGIN
public class Flat implements Home {
    double area;
    double balconyarea;
    int floor;

    public Flat(int area, int balconyArea, int floor) {
        this.area = area;
        this.balconyarea = balconyArea;
        this.floor = floor;
    }

    @Override
    public double getArea() {
        return this.area + this.balconyarea;
    }

    @Override
    public int compareTo(Home another) {
        if (getArea() > another.getArea()) {
            return 1;
        } else if (getArea() < another.getArea()) {
            return -1;
        } else {
            return 0;
        }

    }
    public void Flat (double area, double balconyArea, int floor) {
        this.area = area;
        this.balconyarea = balconyArea;
        this.floor = floor;
    }
    public String toString() {
        return "Квартира площадью " + getArea() + " метров на " + floor + " этаже";
    }
}
// END
