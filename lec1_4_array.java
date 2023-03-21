public class lec1_4_array {
    public static void main(String[] args) {

// ОДНОМЕРНЫЕ МАССИВЫ
        int[] arr = new int[10]; // задает массив заполненный нулями
        System.out.println(arr.length);

        arr = new int[] {1, 2, 3, 4, 5}; // массив заполенный числами, длину уже не пишемб итак понятно
        System.out.println(arr.length);

        System.out.println(arr[3]); // обращение к элементу массива
        arr[3] = 13;
        System.out.println(arr[3]);

        int brr[]; // так тоже можно, но пока не понятно зачем
        brr = new int[] {1, 3, 1, 3};
        System.out.println(brr[1]);

// ДВУМЕРНЫЕ МАССИВЫ
        int[] arr2[] = new int[3][5]; // 3 строки и 5 столбцов
        for (int[] line : arr2) {
            for (int item : line) {
                System.out.printf("%d", item);
            }
            System.out.println();
        }

        int[][] arr3 = new int[3][5]; // не совсем двумерные массивы, а массивы массивов

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.printf("%d", arr3[i][j]);
            }
            System.out.println();
        }

    }
}
