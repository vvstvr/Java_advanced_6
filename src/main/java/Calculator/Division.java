package Calculator;

/**
 * Класс "Деление"
 */
public class Division extends Operation {
    @Override
    double getResult(double a, double b) throws myExeption {
        if (b!=0) return a/b;
        else throw new myExeption(0);
    }
}
