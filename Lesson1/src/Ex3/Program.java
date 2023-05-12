package Ex3;

public class Program {
    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);
        a.setX(12);

        System.out.println("x: " + a.getX() + ", y: " +  a.getY());

        Point2D b = new Point2D(0, 10);
        System.out.println(b); // toString по умолчанию, при переопределении метода выводит нужную информацию

        var dis = Point2D.distance(a, b); // для static обращаемся через имя типа
        System.out.println(dis);
    }
}
