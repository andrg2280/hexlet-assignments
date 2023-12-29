package exercise;

// BEGIN
public class Segment {
    Point beginPoint = new Point();;
    Point endPoint = new Point();
    Point midPoint = new Point();
    int x = 0;
    int y = 0;

    public Segment(Point p1, Point p2) {
        this.beginPoint = p1;
        this.endPoint = p2;
        this.x = (p1.getX() + p2.getX()) / 2;
        this.y = (p1.getY() + p2.getY()) / 2;
    }
    public Point getBeginPoint () {
        return this.beginPoint;
    }
    public Point getEndPoint () {
        return this.endPoint;
    }
    public Point getMidPoint () {
        this.midPoint.setX(this.x);
        this.midPoint.setY(this.y);
        return this.midPoint;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
// END
