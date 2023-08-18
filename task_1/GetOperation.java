package seminar_7.task_1;

public interface GetOperation {
    /**
     * Этот метод выполняет ввод символа операции (+, -, *, /) от пользователя
     *
     * @return введенное значение типа char
     */
    default public char getOperation() {
        System.out.print("Укажите вид математической операции (+, -, *, /): \n");
        return CalculatorView.scanner.next().charAt(0);
    }
}
