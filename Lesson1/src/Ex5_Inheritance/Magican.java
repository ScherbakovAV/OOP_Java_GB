package Ex5_Inheritance;
import java.util.Random;

public class Magican {
    private static int number;
    private static Random r;

    private String name;
    private int hp;
    private int maxHp;

    private int mana;
    private int maxMana;

    static {
        Magican.number = 0;
        Magican.r = new Random();
    }

    public Magican(String name, int hp, int mana) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.mana = mana;
        this. maxMana = mana;
    }
    public Magican() {
        this(String.format("Hero_Magican #%d", ++Magican.number),
                Magican.r.nextInt(100, 200),
                Magican.r.nextInt(50, 150));
    }

    public int Attack() {
        int damage = Magican.r.nextInt(20, 30);
        this.mana -= (int)(damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("Name: %s, HP: %d, Energy: %d, Type: %s",
                this.name, this.hp, this.mana, this.getClass().getSimpleName());
    }

    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
    }

    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        //else {die();}
    }
}
