package utils;

public class Sleep {   
    public static void tamDung(int x) {
        try {
            Thread.sleep(x); // Dừng chương trình 1 giây
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }  

    public static void dangNhap() {
        System.out.print("Dang dang nhap");
        for (int i=0; i<3; i++) {
            tamDung(500);
            System.out.print(".");
        }
    }

    public static void dangXuat() {
        System.out.print("Dang dang xuat");
        for (int i=0; i<3; i++) {
            tamDung(500);
            System.out.print(".");
        }
        Console.clearConsole();
        System.out.println("Da dang xuat!");
    }

    public static void load() {
        for (int i=0; i<2; i++) {
            tamDung(350);
            System.out.print(".");
        }
    }

    public static void load(int mili) {
        for (int i=0; i<3; i++) {
            tamDung(mili);
            System.out.print(".");
        }
    }
}
