package seminar_7.task_1;

public interface Subtraction {
    /**
     * Разность двух чисел
     *
     * @param number1 уменьшаемое число
     * @param number2 вычитаемое число
     * @return Результат вычитания из первого числа второго типа double
     */
    default public double subtraction(double number1, double number2) {
        return number1 - number2;
    }
}
