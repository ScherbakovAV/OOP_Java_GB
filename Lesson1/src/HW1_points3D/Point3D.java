package HW1_points3D;

public class Point3D extends Point2D{
    private int z;

    public Point3D(int valueX, int valueY, int valueZ) {
        super(valueX, valueY);
        this.z = valueZ;
    }

    public int getZ() {
        return this.z;
    }

    public void setZ(int value) {
        this.z = value;
    }

    public static double distance(Point3D a, Point3D b, Point3D c) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2) + Math.pow(a.getZ() - b.getZ(), 2));
    }
}
