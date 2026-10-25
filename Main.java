public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Исп: java Main <файл1> <файл2>");
            return;
        }
        System.out.println("Сравниваю: " + args[0] + " и " + args[1]);
    }
}