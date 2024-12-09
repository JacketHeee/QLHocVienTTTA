package ui;

import java.util.Scanner;

public class GiaoDien_GiaoVien {
    public static void giaoDienChinh() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("+---------------------------------------------------------------------+");
            System.out.println("|1. Thong tin giao vien                                               |");
            System.out.println("|2. Lich phong van trinh do hoc vien dau vao                          |");
            System.out.println("|3. Lich day hoc theo khoa hien tai                                   |");
            System.out.println("|4. Lich day hoc theo khoa sap khai giang                             |");
            System.out.println("|5. Danh sach hoc vien theo tung lop                                  |");
            System.out.println("|6. Thoat                                                             |");
            System.out.println("+---------------------------------------------------------------------+");

            System.out.print("Option: ");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    thongTinGiaoVien();
                    break;
                case 2:
                    lichPhongVan();
                    break;
                case 3:
                    lichDayHocKhoaHienTai();
                    break;
                case 4:
                    lichDayHocKhoaSapKhaiGiang();
                    break;
                case 5:
                    danhSachHocVienTheoTungLop();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid Option, Try Again!");
                    break;
            }
            System.out.println("Press Enter to continue");
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
            System.out.print("\033[H\033[2J"); 
            System.out.flush();
        } while (option != 6);
    }

    public static void thongTinGiaoVien() {
        System.out.println("Bạn đã chọn option 1");

    }

    public static void lichPhongVan() {
        System.out.println("Bạn đã chọn option 2");

    }

    public static void lichDayHocKhoaHienTai() {
        System.out.println("Bạn đã chọn option 3");

    }

    public static void lichDayHocKhoaSapKhaiGiang() {
        System.out.println("Bạn đã chọn option 4");

    }

    public static void danhSachHocVienTheoTungLop() {
        System.out.println("Bạn đã chọn option 5");

    }

    public static void main(String[] args) {
        giaoDienChinh();
    }

}