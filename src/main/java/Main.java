import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите первое число: ");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число: ");
        int secondNumber = new Scanner(System.in).nextInt();

        int sum = firstNumber + secondNumber;
        int subtract = firstNumber - secondNumber;
        int multiply = firstNumber * secondNumber;
        double quotient = (double) firstNumber / secondNumber;

        System.out.println("Сумма чисел: " + sum + "\nРазница чисел: " + subtract + "\nПроизведение чисел: " + multiply + "\nЧастное чисел: " + quotient);
    }
}
