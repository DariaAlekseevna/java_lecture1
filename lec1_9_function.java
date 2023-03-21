import java.util.Scanner;

public class lec1_9_function {
    static void sayHi() {
        System.out.println("hi!");
    }
    static double factor1(int n) {
        if(n==1)return 1;
        return n * factor1(n-1);
    }
    public static void main(String[] args) {
        
// ФУНКЦИИ И МЕТОДЫ - технически одно и то же
// ф-ции могут не принадлежать классам, а методы принадлежат.
// в java все функции являются методами.

// описание - вызов - возвращаемое значение; рекурсия

// можно функции сделать в ОТДЕЛЬНОЙ БИБЛИОТЕКЕ, запушить на гит и потом клонировать в проекты
        sayHi(); //hi!
        System.out.println(lib.sum(2, 3)); // 5
        System.out.println(lib.factor(5)); // 120.0
        HelloName();
    }
    // public - модификатор доступа

    static void HelloName() {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите имя: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!\n", name);
        iScanner.close();
    }
}
// не торопиться складывать ф-ции в одну библиотеку, так как static это плохо
// но не понятно почему пока
