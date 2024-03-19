public class ThreeDPoint extends Point {
    private int z;
    public ThreeDPoint(String label, int x, int y, int z) {
        super(label, x, y);
        this.z = z;
    }
    public String toString() {
        return super.toString() + ", z = " + z;
    }
    public boolean equals(Object obj) {
        if (!(obj instanceof ThreeDPoint)) {
            return false;
        }
        ThreeDPoint objPoint = (ThreeDPoint) obj;
        if (super.equals(objPoint)) {
            if (z == objPoint.z) {
                return true;
            }
        }
        return false;
    }
}
