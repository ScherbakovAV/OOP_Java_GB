package HW2_addHealer;

public class Healer extends BaseHero{
    private int elixir;
    private int maxElixir;

    public Healer(String heroName) {
        super(heroName, BaseHero.r.nextInt(250, 300));
        this.maxElixir = BaseHero.r.nextInt(600, 800);
        this.elixir = maxElixir;
    }

    public Healer() {
        this(String.format("Hero_Healer #%d", ++Priest.number));
    }

    public int heal() {
        int heal = BaseHero.r.nextInt(1, 20);
        this.elixir -= (int) (heal * 2);
        if (elixir < 0) return 0;
        else return heal;
    }

    public String getInfo() {
        return String.format("%s  Elixir: %d", super.getInfo(), this.elixir);
    }
}
