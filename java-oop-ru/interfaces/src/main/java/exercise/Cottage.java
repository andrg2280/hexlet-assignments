package exercise;

// BEGIN
public class Cottage implements Home {
    double area;
    int floorCount;

    public Cottage(double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }

    @Override
    public double getArea() {
        return this.area;
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
    public String toString() {
        return this.floorCount + " этажный коттедж площадью " +getArea()+ " метров";
    }
    public void Cottage (double area, int floorCount) {
        this.area = area;
        this.floorCount = floorCount;
    }
}
// END
