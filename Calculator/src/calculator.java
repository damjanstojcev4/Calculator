import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
           Scanner Input = new Scanner(System.in);

            System.out.print("Внеси Број: ");
            int num1 = Input.nextInt();

            System.out.print("Внеси Оператор: ");
            char operator = Input.next().charAt(0);

            System.out.print("Внеси Број: ");
            int num2 = Input.nextInt();

            if ('+' == operator) {
                System.out.println("Резултатот е " + (num1 + num2));
            } else if ('-' == operator) {
                System.out.println("Резултатот е " + (num1 - num2));
            } else if ('*' == operator) {
                System.out.println("Резултатот е " + (num1 * num2));
            } else if ('/' == operator) {
                System.out.println("Резултатот е " + (num1 / num2));
            } else if ('%' == operator) {
                System.out.println("Резултатот е " + (num1 % num2));
            } else {
                System.out.println("Грешка");
            }
        }
    }


