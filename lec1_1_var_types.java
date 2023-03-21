/**
 * program
 */
public class lec1_1_var_types {
    public static void main(String[] args) {
        System.out.println("meow");
        String s = "2";
        s = s + "25";
        System.out.println(s);
        String n = null;
        System.out.println(n);
// типы данных - тип SHORT и INT
        short age = 10000;
        int salary = 1234567891;
        System.out.println(age); //10
        System.out.println(salary);  //123456
// вещественные числа - FLOAT , DOUBLE
        float e = 2.7f; // без f переменная не будет работать
        double pi = 3.1415;
        double d = 55.22D; // D не обязательна, и без нее работает
        System.out.println(e); // 2.7
        System.out.println(pi); // 3.1415
        System.out.println(d);
// символьные данные CHAR
        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); //false
        ch = '{';
        System.out.println(ch);

// из одного типа в другой, важно уучитывать количество байтов
        int a = 13; // 4 байта целый тип
        double dob = a; // 8 байтов вещественный тип
        // наоборот не получится без определенных преобразований
        System.out.println(dob);

// тип бУЛЕАН
        boolean flag1 = 123 <= 234;
        System.out.println(flag1); 
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2);
// ^ - логическая разделительная дизъюнкция
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3);
// логические операции && - и, || - или
// есть еще побитовые операции & - и, | - или
        boolean f = true && false;
        System.out.println(f);

// СТРОКИ - не все так просто, не примитивные типы. 1 символ занимает в памяти 2 байта
        String msg = "Helllo meow!";
        System.out.println(msg); // Hello world


// НЕЯВНАЯ ТИПИЗАЦИЯ
        var i = 123; // при компиляции вместо var будет подставлен тот тип данных который наиболее вероятен
        System.out.println(i); //123
        System.out.println(getType(i)); //Integer
        var j = 13.13;
        System.out.println(j); //13.13
        System.out.println(getType(j)); //Double
        j = 1234;
        System.out.println(j); // 1234.0
    }
    // статический член класса 
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}