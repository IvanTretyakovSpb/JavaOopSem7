package seminar_7.task_1;

public interface Addition {
    /**
     * Сложение двух чисел
     *
     * @param number1 первое слагаемое
     * @param number2 второе слагаемое
     * @return Сумма двух слагаемых типа double
     */
    default public double addition(double number1, double number2) {
        return number1 + number2;
    }
}
