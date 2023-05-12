package HW2_addHealer;

public class Magician extends BaseHero {
    private int mana;
    private int maxMana;

    public Magician(String heroName) {
        super(heroName, BaseHero.r.nextInt(100, 150));
        this.maxMana = BaseHero.r.nextInt(800, 1000);
        this.mana = maxMana;
    }

    public Magician() {
        this(String.format("Hero_Magician #%d", ++Magician.number));
    }

    public int Attack() {
        int damage = BaseHero.r.nextInt(30, 50);
        this.mana -= (int)(damage * 0.8);
        if (mana < 0) return 0;
        else return damage;
    }

    public String getInfo() {
        return String.format("%s  Mana: %d", super.getInfo(), this.mana);
    }
}