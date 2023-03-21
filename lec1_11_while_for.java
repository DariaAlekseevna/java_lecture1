public class lec1_11_while_for {
    public static void main(String[] args) {

// WHILE
        int value = 321;
        int count = 0;

        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);
        System.out.println();

        count = 0;
        value = 12345;
        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);
        System.out.println();

// FOR  
    int[] arr = new int[] {1, 2, 3, 11, 22, 33};
        int s = 0;
        for (int i = 1; i <= 10; i++) {
            s += i; // считает сумму от 1 до 10
        }
        System.out.println(s);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10;
        }

// FOR IN (для перебора коллекций/ итерируемых типов) - паттерн итератор

        for (int item : arr) {
            System.out.println(item);
            
        }
        System.out.println();
        for (int item : arr) {
            item = 13;
            System.out.println(item);
            // работаем только с локальной переменной, 13 не присвоится в исходной коллекции
        }
        System.out.println();
        
        for (int item : arr) {
            System.out.println(item);
        }

// ВЛОЖЕННЫЕ ЦИКЛЫ
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("meow ");
            }
            System.out.println();
        }
        System.out.println();

// CONTINUE BREAK - оператор безусловного перевода - лучше не делать никогда, плохой тон
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            } 
            System.out.println(i);
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0)
                break;
            System.out.println(i);
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5;) {
                System.out.printf("meow");
                break;
            }
            System.out.println(i);
        }
    }
}
