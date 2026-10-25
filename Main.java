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

            File_Comparatorr comparator = new File_Comparatorr();
            List<DE> diffs = comparator.compare(first, second);

            DiffPrinter printer = new DiffPrinter();
            printer.print(diffs);
        } catch (IOException e) {
            System.out.println("Не удалось прочитать файл: " + e.getMessage());
        }
    }
}