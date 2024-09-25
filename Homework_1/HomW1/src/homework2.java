import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трёхзначное число: ");
        int number = scanner.nextInt();


        int hundreds = number / 100;          // первая цифра (сотни)
        int tens = (number / 10) % 10;        // вторая цифра (десятки)
        int ones = number % 10;               // третья цифра (единицы)


        System.out.println("Число " + number + " -> " + hundreds + ", " + tens + ", " + ones);
    }
}

