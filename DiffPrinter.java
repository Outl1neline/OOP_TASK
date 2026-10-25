import java.util.List;

public class DiffPrinter {

    public void print(List<DE> diffs) {
        if (diffs.isEmpty()) {
            System.out.println("Файлы одинаковые.");
            return;
        }

        for (DE d : diffs) {
            System.out.println(format(d));
        }
        System.out.println("Всего различий: " + diffs.size());
    }

    private String format(DE d) {
        switch (d.getType()) {
            case CHANGED:
                return "Строка " + d.getLineNumber() + ": \"" + d.getOldText()
                        + "\" -> \"" + d.getNewText() + "\"";
            case REMOVED:
                return "Строка " + d.getLineNumber() + ": удалена \"" + d.getOldText() + "\"";
            case ADDED:
                return "Строка " + d.getLineNumber() + ": добавлена \"" + d.getNewText() + "\"";
            default:
                return "";
        }
    }
}