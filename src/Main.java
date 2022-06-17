import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>(); // массив продуктов
        ArrayList<Stock> stocks = new ArrayList<>(); // массив складов

        System.out.println("Главное меню");
        System.out.println("Для работы с товаром введите 1");
        System.out.println("Для работы со складами введите 2");
        System.out.println("Для выхода введите любое целое число кроме 1 или 2");
        int mainMenu = scanner.nextInt();
        if (mainMenu == 1) {
            System.out.println("""
                    Для добавления товара введите 1
                    Для удаления товара ведите 2
                    для выхода введите любую цифру""");
            int add = scanner.nextInt();
            if (add == 1) {
                System.out.println("""
                        Выберите товар который хотите добавить
                        Введите 1 для добавления шампуня
                        Введите 2 для добавления мыла
                        Введите 3 для добавления сока
                        или любое другое число для выхода
                        """);
                int choose = scanner.nextInt();
                if (choose == 1) {
                    System.out.println("Введите количество коробок товара которые хотите добавить");
                    int howMuch = scanner.nextInt();
                    for (int i = 0; i <= howMuch; i++){
                        products.add(addShampoo());
                    }
                }
                else if (choose == 2){
                    System.out.println("Введите количество коробок товара которые хотите добавить");
                    int howMuch = scanner.nextInt();
                    for (int i = 0; i <= howMuch; i++){
                        products.add(addSoap());
                    }
                }
                else if (choose == 3){
                    System.out.println("Введите количество коробок товара которые хотите добавить");
                    int howMuch = scanner.nextInt();
                    for (int i = 0; i <= howMuch; i++){
                        products.add(addJuice());
                    }

                }
            }
            else if (add == 2){

                System.out.println("""
                        Выберите товар который хотите удалить
                        Введите 1 для удалить шампуня
                        Введите 2 для удалить мыла
                        Введите 3 для удалить сока
                        или любое другое число для выхода
                        """);
                int choose = scanner.nextInt();
                if (choose == 1) {
                    System.out.println("Введите количество коробок товара которые хотите добавить");
                    int howMuch = scanner.nextInt();
                    for (int i = 0; i <= howMuch; i++){
                        products.remove(0);
                    }
                }
                else if (choose == 2){
                    System.out.println("Введите количество коробок товара которые хотите добавить");
                    int howMuch = scanner.nextInt();
                    for (int i = 0; i <= howMuch; i++){
                        products.remove(0);
                    }
                }
                else if (choose == 3){
                    System.out.println("Введите количество коробок товара которые хотите добавить");
                    int howMuch = scanner.nextInt();
                    for (int i = 0; i <= howMuch; i++){
                        products.remove(0);
                    }

                }
                else System.out.println("Всего доброго");

            }
            else System.out.println("Всего доброго");
        }
        else if (mainMenu == 2) {

            System.out.println("""
                    Для добавления Склада введите 1
                    Для удаления Склада ведите 2
                    для выхода введите любую цифру""");
            int stock = scanner.nextInt();

            if (stock == 1) {
                stocks.add(new Stock());
            }
            else if (stock == 2){
                stocks.remove(0);
            }
            else System.out.println("Всего доброго");
        } else System.out.println("Всего доброго");

    }
    private static Product addSoap() {
        return new Soap("Банное","Soap",4);
    }
    private static Product addJuice() {
        return new Juice("Da-Da","Juice",5);
    }
    private static Product addShampoo() {
        return new Shampoo("H&S","Shampoo",3);
    }
}


