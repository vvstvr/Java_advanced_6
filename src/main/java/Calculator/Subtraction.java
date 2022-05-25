package Calculator;

/**
 * Класс "Вычитание"
 */
public class Subtraction extends Operation{
    @Override
    double getResult(double a, double b) {
        return a-b;
    }
}
