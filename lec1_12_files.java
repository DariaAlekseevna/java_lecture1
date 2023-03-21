import java.io.*;

public class lec1_12_files {
    public static void main(String[] args) throws Exception {

// создание и запись\дозапись
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line1 ");
            fw.append('\n');
            fw.append('3');
            fw.append('\n');
            fw.write("line 3");
            fw.flush(); // принудительно записывать методом флаш в некоторых случаях
            // вообще нужно еще закрывать файл в большинстве случаях
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    // переменная fw -  более правильно экземпляр класса
    // идентифицируем с помощью конструктора - имя файла и аргумент false or true
    // в зависимости от того нужно ли дописывать файл

// чтение по символьно
        FileReader fr = new FileReader("file.txt");
        int c;
        while ((c = fr.read()) != -1) {
            char ch = (char) c;
            if (ch == '\n') {
                System.out.print(ch);
            } else{
                System.out.print(ch);
            }
        }
        fr.close();
        System.out.println();

// чтение построчно
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}
// вариант public static void main(String[] args) throws Exception { - позволяет обойтись без try catch