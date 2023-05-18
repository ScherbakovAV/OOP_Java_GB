package Ex000;

public class Program {

//    static void A() {
//        System.out.println("A");
//    }

    void A() {
        System.out.println("A");
    }
    public static void main(String[] args) {
//        A(); // это работает, если метод статический

        Program prog = new Program();
        prog.A(); // такой вызов в случае вызова нестатического метода

        Foo f1 = new Foo();
        f1.value = 123;
        System.out.println(f1.value);
        f1.printCount();

        Foo f2 = new Foo();
        f2.value = 234;
        System.out.println(f2.value);
        f2.printCount();

        Foo f3 = new Foo();
        f3.value = 432;
        System.out.println(f3.value);
        f3.printCount();
    }
}
