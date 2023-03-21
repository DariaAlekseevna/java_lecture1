public class lec1_2_class {
    public static void main(String[] args) {
// КЛАССЫ ОБЕРТКИ
        int i = 12_234_231; // разделить _ можно применятьдля удобства восприятия больших значений
        System.out.println(i);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
// через точку обращаемся к членам класса с которым работаем или к примитивам 
        String s = "qwer";
        System.out.println(s.length()); // 4
        System.out.println(s.charAt(1)); // w
        //Character.
    }
}

/**
* int - Integer
* short - Short
* long - Long
* byte - Byte
* float - Float
* double - Double
* char - Character
* boolean - Boolean
*/