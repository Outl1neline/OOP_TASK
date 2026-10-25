public class DE {
    private final int lineNumber;
    private final DT type;
    private final String oldText;
    private final String newText;

    public DE(int lineNumber, DT type, String oldText, String newText) {
        this.lineNumber = lineNumber;
        this.type = type;
        this.oldText = oldText;
        this.newText = newText;
    }

    public int getLineNumber() { return lineNumber; }
    public DT getType() { return type; }
    public String getOldText() { return oldText; }
    public String getNewText() { return newText; }
}