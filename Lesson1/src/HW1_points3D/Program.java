package HW1_points3D;

// Сделать работу с точками трёхмерного пространства.
public class Program {
    public static void main(String[] args) {
        Point3D pointA = new Point3D(5, 4, -3);
        System.out.printf("Точка 1: x = %d, y = %d, z = %d\n", pointA.getX(), pointA.getY(), pointA.getZ());

        Point3D pointB = new Point3D(-1, 0, 5);
        System.out.printf("Точка 2: x = %d, y = %d, z = %d\n", pointB.getX(), pointB.getY(), pointB.getZ());

        var dis = Point3D.distance(pointA, pointB); // для static обращаемся через имя типа
        System.out.println("Расстояние между точками = " + dis);
    }
}
