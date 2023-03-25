
/**
 * task2
 *  Вычислить n! (произведение чисел от 1 до n)
 */
import java.util.Scanner;

public class task2 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        int i = iScanner.nextInt();
        System.out.printf("Факториал равен: %d\n", getFactorial(i));
        iScanner.close();
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
        }
        return result;
    }
}