import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Использование: java Main <файл1> <файл2>");
            return;
        }

        TFR reader = new TFR();
        try {
            List<String> first = reader.readLines(args[0]);
            List<String> second = reader.readLines(args[1]);
            System.out.println("Строк в 1 файле: " + first.size());
            System.out.println("Строк во 2 файле: " + second.size());
        } catch (IOException e) {
            System.out.println("Не получилось прочитать файлик: " + e.getMessage());
        }
    }
}