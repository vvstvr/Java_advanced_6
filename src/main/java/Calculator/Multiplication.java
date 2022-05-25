package Calculator;

/**
 * Класс "Умножение"
 */
public class Multiplication extends Operation{
    @Override
    double getResult(double a, double b) {
        return a*b;
    }
}