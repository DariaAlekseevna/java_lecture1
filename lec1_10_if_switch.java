import java.util.Scanner;

public class lec1_10_if_switch {
    public static void main(String[] args) {
// управляющие конструкции
// оператор ветвления if
        int a = 1;
        int b = 2;
        int c;
        if (a > b) {
            c = a;
        } else{
            c = b;
        }
        System.out.println(c);

        // сокращенно
        if (a > b) c = a;
        if (b > a) c = b;

        System.out.println(c);

// тернарный оператор
        int min = a < b ? a : b; // если условие выполнено - возвращается часть до : (a)
        // если условие не выполнено возвращ. чать после : (b)
        // после ? все что угодно писать нельзя, только переменные
        System.out.println(min);

// оператор выбора  SWITCH
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите месяц числом от 1 до 12: ");
        int mounth = iScanner.nextInt();
        String text = "";
        switch (mounth) {
            case 1:
            case 2:
                text = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                text = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                text = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                text = "Autmn";
                break;
            case 12:
                text = "Winter";
                break;
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        iScanner.close();
        // каждый пункт заканчивается break
        // не обязательный case default
    }
    
}
