package Ex4_Incapsulation;

public class Robot2 {
    // Более правильный вариант реализации с помощью инкапсуляции, т.е. скрытия от пользователя реализации программного кода
    // скрываем от пользователя через private поля и методы

    /**Уровень робота */
    private int level;

    /**Имя робота */
    private String name;

    /**
     * Создание робота
     * @param name Имя робота, не должно начинаться с цифры
     * @param level Уровень робота
     */
    public Robot2(String name, int level) { // конструктор
        this.name = name;
        this.level = level;
    }

    // Методы вкл\выкл подсистем

    public void powerOn() { // кнопка Вкл
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    public void powerOff() { // кнопка Выкл
        this.sayBye();
        this.stopBIOS();
        this.stopOS();
    }

    public int getLevel() { // геттера на чтение
        return this.level;
    }

    public String getName() { // геттера на чтение
        return this.name;
    }

    /**Загрузка BIOS */
    private void startBIOS() {System.out.println("Start BIOS...");}

    /**Загрузка OS */
    private void startOS() {System.out.println("Start OS...");}

    /**Приветствие */
    private void sayHi() {System.out.println("Hello world...");}

    /**Выгрузка BIOS */
    private void stopBIOS() {System.out.println("Stop BIOS...");}

    /**Выгрузка OS */
    private void stopOS() {System.out.println("Stop OS...");}

    /**Прощание */
    private void sayBye() {System.out.println("Bye...");}

    /**Работа */
    public void work() {System.out.println("Working...");}
}
