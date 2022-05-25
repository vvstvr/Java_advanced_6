package Calculator;

/**
* Добавить обработку исключений в задание с ООП калькулятора (например, исключение может возникнуть при делении на ноль)
 */

public class Main {
    public static void main(String args[]) {
        try {
            System.out.print("Введите первое число: ");
            double a = Input.doubleNum();

            System.out.print("Введите второе число: ");
            double b = Input.doubleNum();

            System.out.print("Выберите операцию (+,-,*,/): ");
            char oper = Input.operation();

            System.out.println("Вывод:");
            Operation calc;

            switch (oper) {
                case '+':
                    calc = new Addition();
                    System.out.printf("%.4f %s %.4f %s %.4f", a, oper, b, " = ", calc.getResult(a, b));
                    break;
                case '-':
                    calc = new Subtraction();
                    System.out.printf("%.4f %s %.4f %s %.4f", a, oper, b, " = ", calc.getResult(a, b));
                    break;
                case '*':
                    calc = new Multiplication();
                    System.out.printf("%.4f %s %.4f %s %.4f", a, oper, b, " = ", calc.getResult(a, b));
                    break;
                case '/':
                    calc = new Division();
                    System.out.printf("%.4f %s %.4f %s %.4f", a, oper, b, " = ", calc.getResult(a, b));
                    break;
            }
        }
        catch (myExeption e){
            System.out.println("Ошибка деления на ноль! Результат: " + e.getResult());
            e.printStackTrace();
        }
    }
}
