package ui;

import java.util.Scanner;

public class GiaoDien_TuyenSinhGiaoVu {
    public static void giaoDienChinh() {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("+---------------------------------------------------------------------------------------------+");
            System.out.println("|1.   Nhap thong tin ung vien dang ky                                                         |");
            System.out.println("|2.   Ghi danh cho hoc vien                                                                   |");
            System.out.println("|3.   Xep lop cho hoc vien da dong tien nhieu khoa                                            |");
            System.out.println("|4.   In bien lai hoc phi va xuat hoa don                                                     |");
            System.out.println("|5.   Tim kiem thong tin hoc vien                                                             |");
            System.out.println("|6.   Truy cap danh sach cac lop hoc                                                          |");
            System.out.println("|7.   Truy cap danh sach hoc vien theo tung lop                                               |");
            System.out.println("|8.   Xem ho so hoc vien                                                                      |");
            System.out.println("|9.   Dat lich kiem tra dau vao cho GV                                                        |");
            System.out.println("|10.  Sap xep GV day lop                                                                      |");
            System.out.println("|11.  Chuyen doi lop hoc cho hoc vien                                                         |");
            System.out.println("|12.  Thong ke so luong hoc vien moi lop                                                      |");
            System.out.println("|13.  Thuc hien bao cao so luong hoc vien moi khoa hoc theo tung trinh do                     |");
            System.out.println("|14.  Thoat                                                                                   |");
            System.out.println("+---------------------------------------------------------------------------------------------+");
            
            System.out.print("Option: ");
            option = Integer.parseInt(scanner.nextLine());
            switch (option) {
                case 1:
                    nhapThongTinUngVienDangKy();
                    break;
                case 2:
                    ghiDanhChoHocVien();
                    break;
                case 3:
                    xepLopChoHocVienDaDongTienNhieuKhoa();
                    break;
                case 4:
                    inBienLaiHocPhiVaXuatHoaDon();
                    break;
                case 5:
                    timKiemThongTinHocVien();
                    break;
                case 6:
                    truyCapDanhSachCacLopHoc();
                    break;
                case 7:
                    truyCapDanhSachHocVienTheoTungLop();
                    break;
                case 8:
                    xemHoSoHocVien();
                    break;
                case 9:
                    datLichKiemTraDauVaoChoGV();
                    break;
                case 10:
                    sapXepGVDayLop();
                    break;
                case 11:
                    chuyenDoiLopHocChoHocVien();
                    break;
                case 12:
                    thongKeSoLuongHocVienMoiLop();
                    break;
                case 13:
                    thucHienBaoCaoSoLuongHocVienMoiKhoaHocTheoTungTrinhDo();
                    break;
                case 14:
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
        } while (option != 14);
    }

    public static void nhapThongTinUngVienDangKy() {
        System.out.println("|1.   Nhap thong tin ung vien dang ky                                                         |");
    }

    public static void ghiDanhChoHocVien() {
        System.out.println("|2.   Ghi danh cho hoc vien                                                                   |");
    }

    public static void xepLopChoHocVienDaDongTienNhieuKhoa() {
        System.out.println("|3.   Xep lop cho hoc vien da dong tien nhieu khoa                                            |");
    }

    public static void inBienLaiHocPhiVaXuatHoaDon() {
        System.out.println("|4.   In bien lai hoc phi va xuat hoa don                                                     |");
    }

    public static void timKiemThongTinHocVien() {
        System.out.println("|5.   Tim kiem thong tin hoc vien                                                             |");
    }

    public static void truyCapDanhSachCacLopHoc() {
        System.out.println("|6.   Truy cap danh sach cac lop hoc                                                          |");
    }

    public static void truyCapDanhSachHocVienTheoTungLop() {
        System.out.println("|7.   Truy cap danh sach hoc vien theo tung lop                                               |");
    }

    public static void xemHoSoHocVien() {
        System.out.println("|8.   Xem ho so hoc vien                                                                      |");
    }

    public static void datLichKiemTraDauVaoChoGV() {
        System.out.println("|9.   Dat lich kiem tra dau vao cho GV                                                        |");
    }

    public static void sapXepGVDayLop() {
        System.out.println("|10.  Sap xep GV day lop                                                                      |");
    }

    public static void chuyenDoiLopHocChoHocVien() {
        System.out.println("|11.  Chuyen doi lop hoc cho hoc vien                                                         |");
    }

    public static void thongKeSoLuongHocVienMoiLop() {
        System.out.println("|12.  Thong ke so luong hoc vien moi lop                                                      |");
    }

    public static void thucHienBaoCaoSoLuongHocVienMoiKhoaHocTheoTungTrinhDo() {
        System.out.println("|13.  Thuc hien bao cao so luong hoc vien moi khoa hoc theo tung trinh do                     |");
    }    

    public static void main(String[] args) {
        giaoDienChinh();
    }
}
