import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Результат: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Результат: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Результат: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Результат: " + (num1 / num2));
                } else {
                    System.out.println("Ошибка: деление на ноль.");
                }
                break;
            default:
                System.out.println("Некорректный оператор.");
                break;
        }
        scanner.close();
    }
}