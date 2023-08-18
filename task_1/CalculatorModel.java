package seminar_7.task_1;

/**
 * Этот класс отвечает за обработку данных и бизнес-логику приложения, содержит данные и методы для их обработки.
 */
public class CalculatorModel implements Addition, Subtraction, Multiplication, Division {
    /**
     * Переменная типа double для хранения первого числа
     */
    private double number1;
    /**
     * Переменная типа double для хранения второго числа
     */
    private double number2;

    // Реализация паттерна проектирования Singleton (Одиночка)
    private static CalculatorModel model;

    private CalculatorModel() {

    }

    public static CalculatorModel getModel() {
        if (model == null) {                       //если объект еще не создан
            model = new CalculatorModel();          //создать новый объект
        }
        return model;        // вернуть ранее созданный (или первоначально созданный) объект
    }

    /**
     * Геттер для приватного поля класса
     *
     * @return значение первого числа типа double
     */
    public double getNumber1() {
        return number1;
    }

    /**
     * Геттер для приватного поля класса
     *
     * @return значение первого числа типа double
     */
    public double getNumber2() {
        return number2;
    }

    /**
     * Сеттер для первого числа
     *
     * @param number1 число типа double
     */
    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    /**
     * Сеттер для второго числа
     *
     * @param number2 число типа double
     */
    public void setNumber2(double number2) {
        this.number2 = number2;
    }
}