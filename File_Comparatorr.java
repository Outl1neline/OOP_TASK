import java.util.ArrayList;
import java.util.List;

public class File_Comparatorr {

    public List<DE> compare(List<String> first, List<String> second) {
        List<DE> result = new ArrayList<>();

        int common = Math.min(first.size(), second.size());
        for (int i = 0; i < common; i++) {
            if (!first.get(i).equals(second.get(i))) {
                result.add(new DE(i + 1, DT.CHANGED, first.get(i), second.get(i)));
            }
        }

        for (int i = common; i < first.size(); i++) {
            result.add(new DE(i + 1, DT.REMOVED, first.get(i), null));
        }
        for (int i = common; i < second.size(); i++) {
            result.add(new DE(i + 1, DT.ADDED, null, second.get(i)));
        }

        return result;
    }
}