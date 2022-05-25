package Calculator;

/**
 * Класс "Сложение"
 */

public class Addition extends Operation {
    @Override

    double getResult(double a, double b) {
        return a+b;
    }
}
