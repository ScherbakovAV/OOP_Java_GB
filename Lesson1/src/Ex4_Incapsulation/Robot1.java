package Ex4_Incapsulation;

public class Robot1 {
    /**Уровень робота */
    public int level; // поле 1

    /**Имя робота */
    public String name; // поле 2

    /**
     * Создание робота
     * @param name Имя робота, не должно начинаться с цифры
     * @param level Уровень робота
     */
    public Robot1(String name, int level) { // конструктор
        this.name = name;
        this.level = level;
    }

    // Методы вкл\выкл подсистем

    /**Загрузка BIOS */
    public void startBIOS() {System.out.println("Start BIOS...");}

    /**Загрузка OS */
    public void startOS() {System.out.println("Start OS...");}

    /**Приветствие */
    public void sayHi() {System.out.println("Hello world...");}

    /**Выгрузка BIOS */
    public void stopBIOS() {System.out.println("Stop BIOS...");}

    /**Выгрузка OS */
    public void stopOS() {System.out.println("Stop OS...");}

    /**Прощание */
    public void sayBye() {System.out.println("Bye...");}

    /**Работа */
    public void work() {System.out.println("Working...");}
}
