package seminar_7.task_1;

import java.util.Scanner;

/**
 * Этот класс отвечает за отображение данных пользователю и обработку пользовательского ввода.
 * Он не содержит бизнес-логики, а только отображает данные, полученные от презентера,
 * и передает пользовательский ввод обратно презентеру.
 */
public class CalculatorView implements GetNumberFromUser, GetOperation {

    // Реализация паттерна проектирования Singleton (Одиночка)
    private static CalculatorView view; // устанавливаем приватный статус для объекта типа CalculatorView

    // устанавливаем приватный статус для конструктора класса
    private CalculatorView() {
    }

    public static CalculatorView getView() {
        if (view == null) {                       //если объект еще не создан
            view = new CalculatorView();          //создать новый объект
        }
        return view;        // вернуть ранее созданный (или первоначально созданный) объект
    }

    static Scanner scanner = new Scanner(System.in);

    /**
     * Этот метод отображает в консоли результат произведенных вычислений
     *
     * @param result - результат произведенной математической операции типа double
     */
    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }
}
