public class lec1_5_converting {
    
    public static void main(String[] args) {
        int i = 123; double d = i; // ЯВНАЯ ТИПИЗАЦИЯ
        System.out.println(i); // 123
        System.out.println(d); // 123.0
        d = 3.1415; i = (int)d;
        System.out.println(d); // 3.1415
        System.out.println(i); //3
        d = 3.9415; i = (int)d; 
        System.out.println(d); // 3.9415
        System.out.println(i); // 3
        byte b = Byte.parseByte("123"); 
        System.out.println(b); //123
        //b = Byte.parseByte("1234"); 
        System.out.println(b); // NumberFormatException: Value out of range
        // тип byte позволят хранить значения от 0 до 255

// НО МАССИВЫ

        int[] a = new int[10];
        // double[] dob = a; // изучаем ковариантность и контравариативность
        // нельзя просто перевести массив инт в массив дабл
        System.out.println(a[1]);
    }
}

// НЕЯВНАЯ ТИПИЗАЦИЯ - когда не указывается что во что преобразовавается

/**    ПРЕОБРАЗОВАНИЯ
 * 
 *                  float   double
 *                     ^ / \  ^
 *  byte -> short -> int -> long
 *                    ^
 *                   char
 *  INT может стать long, double, float
 *  LONG может стать  float, double
 */ 