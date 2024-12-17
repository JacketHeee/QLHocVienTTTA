package utils;

public class Console {
    public static void clearConsole() {
        try {
            // Lệnh để xóa màn hình trên Windows
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            // Lệnh để xóa màn hình trên Unix-based hệ thống (Linux/Mac)
            else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
