package seminar_7.task_1;

/**
 * Это приложение представляет собой калькулятор для выполнения простейших операций с дробными числами.
 * Приложение реализовано в архитектуре MVP (Model-View-Presenter)
 *
 * @author Ivan Tretyakov
 * @version 1.0
 */
public class Application {
    public static void main(String[] args) {
        //        Создание Модели через реализацию паттерна проектирования Singleton (Одиночка)
        CalculatorModel model = CalculatorModel.getModel();

        //        Создание Представления через реализацию паттерна проектирования Singleton (Одиночка)
        CalculatorView view = CalculatorView.getView();

        //        Создание Презентера через реализацию паттерна проектирования Singleton (Одиночка)
        CalculatorPresenter presenter = CalculatorPresenter.getPresenter(model, view);

        presenter.calculation();
    }
}
