package HW2_addHealer;

public class Program {
    public static void main(String[] args) {
        Magician hero1 = new Magician("Рейстлин Маджере");
        System.out.println(hero1.getInfo());
        
        Priest hero2 = new Priest("Танис Полуэльф");
        System.out.println(hero2.getInfo());

        Healer hero3 = new Healer("Киара Светлоокая");
        System.out.println(hero3.getInfo());

        int attck1, attck2, heal;
        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Раунд " + i + "...");
            attck1 = hero1.Attack();
            hero2.GetDamage(attck1);
            System.out.printf("%s атакует %s и наносит урон %d\n%s\n", hero1.name, hero2.name, attck1, hero2.getInfo());
            if (hero2.getLife()) {
                System.out.printf("%s убит...\n", hero2.name);
                break;
            }

            attck2 = hero2.Attack();
            hero1.GetDamage(attck2);
            System.out.printf("%s атакует %s и наносит урон %d\n%s\n", hero2.name, hero1.name, attck2, hero1.getInfo());
            if (hero1.getLife()) {
                System.out.printf("%s убит...\n", hero1.name);
                break;
            }

            heal = hero3.heal();
            hero1.healed(heal);
            System.out.printf("%s излечивает %s на %d урона\n%s\n", hero3.name, hero1.name, heal, hero1.getInfo());

            System.out.println();
        }

    }
}