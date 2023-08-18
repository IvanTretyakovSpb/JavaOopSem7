package seminar_7.task_1;

public interface GetNumberFromUser {
    /**
     * Этот метод выполняет ввод числа от пользователя
     *
     * @return введенное значение типа double
     */
    default public double getNumberFromUser() {
        System.out.print("Введите число: \n");
        return CalculatorView.scanner.nextDouble();
    }
}
