import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {


    public static void actionStock()throws InputMismatchException {

        System.out.println("Введите 1 Работа c добавлениями товаров в склад" +
                "Введите 2 Работа с удалением товаров со склада\n" +
                "Введите 3 Выход из программы – в главное меню");
    }

    public static void actionProduct ()throws InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 1 Работа c добавлениями товаров" +
                            "Введите 2 Работа с удалением товаров\n" +
                            "Введите любое число кроме 2 или 3 Выход из программы – в главное меню");
        int add = scanner.nextInt();
        if (add == 1){
            addProd();
        }
        else if (add == 2){
            removeProd();
        }
    }



    public static void addProd(){
        Scanner scanner = new Scanner(System.in);

            System.out.println("""
                    Выберите товар который хотите добавить
                    Введите 1 для добавления шампуня
                    Введите 2 для добавления мыла
                    Введите 3 для добавления сока
                    или любое другое число для выхода
                    """);
        int choose = scanner.nextInt();
        if (choose == 1)
        {
            System.out.println("Введите количество коробок товара которые хотите добавить");
            int howMuch = scanner.nextInt();
                ArrayList <Object> shampoosArray = new ArrayList<>();
                for (int i = 0; i <= howMuch; i++){
                    Shampoo shampoo = new Shampoo();
                    shampoosArray.add(shampoo);
                }
            }

        else if (choose == 2)
        {
            System.out.println("Введите количество коробок товара которые хотите добавить");
            int howMuch = scanner.nextInt();
                ArrayList <Object> soapsArray = new ArrayList<>();
                for (int i = 0; i <= howMuch; i++){
                    Soap soap = new Soap();
                    soapsArray.add(soap);
                }
        }
        else if (choose == 3)
        {
            System.out.println("Введите количество коробок товара которые хотите добавить");
            int howMuch = scanner.nextInt();
                ArrayList <Object> juiceArray = new ArrayList<>();
                for (int i = 0; i <= howMuch; i++){
                    Shampoo shampoo = new Shampoo();
                    juiceArray.add(shampoo);
                }
        }
        else System.out.println("Bye");
    }
    private static void removeProd() {


    }
}
