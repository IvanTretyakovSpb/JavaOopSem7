package seminar_7.task_1;

public interface Multiplication {
    /**
     * Произведение двух чисел
     *
     * @param number1 первый множитель
     * @param number2 второй множитель
     * @return Результат умножения первого числа на второе типа double
     */
    default public double multiplication(double number1, double number2) {
        return number1 * number2;
    }
}
