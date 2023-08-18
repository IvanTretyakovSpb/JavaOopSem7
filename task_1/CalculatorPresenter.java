package seminar_7.task_1;

/**
 * Этот класс представляет собой Презентер (Presenter), который связывает модель и представление.
 * Он получает пользовательский ввод из представления, обрабатывает его и обновляет модель.
 * Затем он получает обновленные данные из модели и передает их обратно представлению для отображения.
 */
public class CalculatorPresenter {
    private final CalculatorModel model;
    private final CalculatorView view;

    // Реализация паттерна проектирования Singleton (Одиночка)
    private static CalculatorPresenter presenter;

    // устанавливаем приватный статус для конструктора класса
    private CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public static CalculatorPresenter getPresenter(CalculatorModel model, CalculatorView view) {
        if (presenter == null) {                       //если объект еще не создан
            presenter = new CalculatorPresenter(model, view);          //создать новый объект
        }
        return presenter;        // вернуть ранее созданный (или первоначально созданный) объект
    }

    public void calculation() {
//      Получаем из представления данные о числовых значениях и виде выполняемой операции
        model.setNumber1(view.getNumberFromUser());
        model.setNumber2(view.getNumberFromUser());
        char kindOfOperation = view.getOperation();
        double result = 0;

        //      В зависимости от вида выполняемой операциии получаем от модели результат вычисления
        switch (kindOfOperation) {
            case '+' -> result = model.addition(model.getNumber1(), model.getNumber2());
            case '-' -> result = model.subtraction(model.getNumber1(), model.getNumber2());
            case '*' -> result = model.multiplication(model.getNumber1(), model.getNumber2());
            case '/' -> result = model.division(model.getNumber1(), model.getNumber2());
            default -> System.out.println("Вид операции введен некорректно!");
        }

//        Если вид операции введен корректно, то выводим в консоль результат вычислений.
        if (kindOfOperation == '+' || kindOfOperation == '-' || kindOfOperation == '*' || kindOfOperation == '/') {
            view.displayResult(result);
        }
    }
}
