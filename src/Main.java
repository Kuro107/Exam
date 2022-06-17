import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Главное меню");
        System.out.println("Для работы с товаром введите 1");
        System.out.println("Для работы со складами введите 2");
        System.out.println("Для выхода введите любое целое число кроме 1 или 2");
        int mainMenu = scanner.nextInt();
        if (mainMenu == 1) {
            Test.actionProduct();
        }
        else if (mainMenu == 2){
            Test.actionStock();}
        else System.out.println("Всего доброго");
    }
}

