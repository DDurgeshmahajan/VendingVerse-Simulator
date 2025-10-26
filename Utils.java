public class Utils {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void displayHeader(String title) {
        System.out.println("+" + "-".repeat(48) + "+");
        System.out.println("|" + title.center(50) + "|");
        System.out.println("+" + "-".repeat(48) + "+");
    }

    public static void displayFooter() {
        System.out.println("+" + "-".repeat(48) + "+");
        System.out.println();
    }

    public static void displayMessage(String message) {
        System.out.println("|" + message.center(50) + "|");
    }

    public static String center(String str, int size) {
        if (str.length() >= size) {
            return str;
        }
        int padding = (size - str.length()) / 2;
        return " ".repeat(padding) + str + " ".repeat(size - str.length() - padding);
    }
}
