public class Point {
    private int x;
    private int y;
    private String label;
    public Point(String label, int x, int y) {
        this.x = x;
        this.y = y;
        this.label = label;
    }
    public String toString() {
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        Point objPoint = (Point) obj;
        if (x == objPoint.x && y == objPoint.y) {
            return true;
        }
        return false;
    }
}
