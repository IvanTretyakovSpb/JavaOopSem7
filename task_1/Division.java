package seminar_7.task_1;

public interface Division {
    /**
     * Деление двух чисел
     *
     * @param number1 делимое
     * @param number2 делитель
     * @return Частное от деления первого числа на второе типа double
     * @throws IllegalArgumentException Возникает при делении на ноль
     * @see IllegalArgumentException
     */
    default public double division(double number1, double number2) {
        if (number2 != 0) {
            return number1 / number2;
        }
        throw new IllegalArgumentException("Деление на ноль недопустимо!");
    }
}
