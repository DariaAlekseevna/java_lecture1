import java.util.Scanner;

public class lec1_6_input {
    // получения данных от пользователя
    public static void main(String[] args) {
// получение строк
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);
        // iScanner.close();

// получение примитовов
        // Scanner iScanner2 = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner.nextInt();
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f\n", x, y, x + y);
        // iScanner.close();

// проверка на соответствие получаемого типа
        System.out.printf("int i: ");
        boolean flag = iScanner.hasNextInt();
        System.out.println(flag);
        int i = iScanner.nextInt();
        System.out.println(i);
        // iScanner.close();

        System.out.printf("boolean b: ");
        boolean b = iScanner.nextBoolean();
        System.out.println(b);
        iScanner.close();
    }
    
}
