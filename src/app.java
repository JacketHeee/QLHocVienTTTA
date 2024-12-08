import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        // Đường dẫn đến tệp txt
        File file = new File("data/users.txt");

        // Tạo đối tượng Scanner để đọc tệp
        try (Scanner scanner = new Scanner(file)) {
            // Đọc tệp dòng theo dòng
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);  // In ra từng dòng
            }
            
        } catch (FileNotFoundException e) {
            // Nếu không tìm thấy tệp, sẽ có thông báo lỗi
            System.out.println("Tep khong tim thay!");
        }
    }
}
