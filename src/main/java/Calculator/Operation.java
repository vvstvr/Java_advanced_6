package Calculator;

/**
 * Абстрактный класс по которому далее будут создаваны дочерние классы.
 */
abstract class Operation {
    abstract double getResult(double a, double b) throws myExeption;
}
