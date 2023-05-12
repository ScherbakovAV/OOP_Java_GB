package Ex5_Inheritance;

public class Program { // без наследования
    public static void main(String[] args) {
        Magican hero1 = new Magican();
        System.out.println(hero1.getInfo());

        Priest hero2 = new Priest();
        System.out.println(hero2.getInfo());

        Priest hero3 = new Priest();
        System.out.println(hero3.getInfo());
    }
}
