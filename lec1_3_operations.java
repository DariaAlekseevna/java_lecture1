public class lec1_3_operations {
    public static void main(String[] args) {
        int a = 123;
        a++;
        System.out.println(a); // 124

        int b = 456;
        System.out.println(b++); // приоритет вывода на экран, поэтому видим то же значение
        System.out.println(b);

        int c = 789;
        System.out.println(++c); // теперь выполнение инкремента по приоритету выше чем вывод на консоль
        // есть постфиксный инкремент, и есть префиксный инкримент. Приоритет префиксного выше.

        int d = 123;
        d = d-- - --d;
        System.out.println(d);

        boolean f = 123 > 234;
        System.out.println(f);

        // побитовые сдвиги
        int e = 8;
        // 1000 в двоичной форме
        // e = e << 1;
        System.out.println(e << 1);
        // 10000
        int g = 18;
        //10010
        System.out.println(g >> 1);
        // 1001
        int h = 5;
        int i = 2;
        System.out.println(h | i);
        // 101
        // 010
        // 1 или 0 = 1, 0 или 1 = 1, 1 или 0 = 1 т.е. 111
        // обратная конвертация и ответ 7
        System.out.println(h ^ i); // строго одно истино
        System.out.println(h & i);

        String s = "q1e1"; // длина 4, индексы 0..3
        // && быстрая конъюнкция, проверят только первое значение, если есть р-т,то второе не проверяет
        // boolean j = s.length() >= 5 && s.charAt(4) == '1'; //  проверяет первое условие, оно false, поэтому второе не смотрит
        // boolean j = s.length() >= 5 & s.charAt(4) == '1'; // не работает // обязательно проверяет оба условия не смотря на их значения
        boolean j = s.length() >= 4 & s.charAt(3) == '1'; // когда true работает
        boolean k = true;
        System.out.println(j);
        System.out.println(j & k);
        System.out.println(j && k);
 

    }
}

/** Операции Java
 *  Присваивание =
 *  Арифметические *, /, +, -, %, ++, --
 *  Операции сравнения <, >, ==, !=, >=, <=
 *  Логические операции ||, &&, ^, !
 *  Побитовые операции <<, >>, &, |, ^
 */

 // тонкости деления целых и вещественных типов