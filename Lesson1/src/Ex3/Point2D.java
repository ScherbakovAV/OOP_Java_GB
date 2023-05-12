package Ex3;

/**
 *  Это точка 2D
 */
public class Point2D {
    private int x, y; // если модификатора доступа нет, то по умолчанию public

    /**
     * Это конструктор
     * @param valueX это координата x
     * @param valueY это координата y
     */
    public Point2D(int valueX, int valueY) { // перегрузка // это не метод
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
        this(value, value);
    }

    public Point2D() {
        this(0); // вместо того, что внизу
    }

//    public Point2D() { // перегрузка
//        x = 0;
//        y = 0;
//    }
//
//    public Point2D(int value) { // перегрузка
//        x = value;
//        y = value;
//    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }
    public String getInfo() { // технически не нужен
        return String.format("x: %d, y: %d", x, y);
    }

    @Override // переопределение метода - изменение поведения, написанного ранее
    public String toString() { // public - этим методом можно пользоваться везде, а не только внутри класса
        return getInfo();
    }

    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

    // перегрузка метода - описание в рамках одного класса метода, отличающиеся сигнатурой (одно название)
    // ctor
    // get, set
    // docs
}
