public class lec1_7_formatted_output {
    
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c;
        System.out.println(res);

        String s = "qwe";
        int d = 123;
        String q = s + d; // получаем четыре строки, конкотенация для строк дает просадку по производительности
        // строки: s, d(стала строкой), s+d, q. Для соответствующих операция есть соотв. типы.
        // например strig builder, но про это нам пока не расскажут
        System.out.println(q);
        c = a + d;
// спецификаторы или маски
// %d - для целочисленных значений
        String res1 = String.format("%d + %d = %d \n", a, d, c);
        System.out.printf("%d + %d = %d \n", a, d, c);
        System.out.println(res1);
// %x - для шестнадцатеричных чисел

// %f - для чисел с плавающей точкой
        float pi = 3.1415f;
        System.out.printf("%f\n", pi); // 3,141500
        System.out.printf("%.2f\n", pi); // 3.14
        System.out.printf("%.3f\n", pi); //3.141
// %e - вывад чисел в экспоненциальной форме
        System.out.printf("%e\n", pi); // 3,141500e+00
        System.out.printf("%.2e\n", pi); // 3,14e+00
        System.out.printf("%.3e\n", pi); // 3,141e+00
// %c - для одиночного символа
        char ch = '(';
        System.out.printf("%c\n", ch);
// %s - для вывода строковых значений
        String st = "meow";
        System.out.printf("%s\n", st);
    }
}
