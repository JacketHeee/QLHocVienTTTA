package services;

import database.lichhoc.KhoaKhaiGiangDB;
import model.lichhoc.KhoaKhaiGiang;

public class KhoaKhaiGiangServices {
    private KhoaKhaiGiangDB KhoaKhaiGiangDB; 

    public KhoaKhaiGiangServices() {
        KhoaKhaiGiangDB = new KhoaKhaiGiangDB();
    }

    // private NgayThangNam tinhThoiGianKetKhoaKhaiGiangc(NgayThangNam batDau, int soTuan) {
    //     int ngay = batDau.getNgay();
    //     int thang = batDau.getThang();
    //     int nam = batDau.getNam();

    //     // Cong so ngay cua so tuan vao ngay bat dau
    //     ngay += soTuan * 7;

    //     // Xu ly khi ngay vuot qua so ngay trong thang
    //     while (ngay > getSoNgayTrongThang(thang, nam)) {
    //         ngay -= getSoNgayTrongThang(thang, nam);
    //         thang++;
    //         if (thang > 12) { // Neu vuot qua thang 12, chuyen sang nam moi
    //             thang = 1;
    //             nam++;
    //         }
    //     }

    //     return new NgayThangNam(ngay, thang, nam);
    // }

    // // Lay so ngay trong thang
    // private int getSoNgayTrongThang(int thang, int nam) {
    //     switch (thang) {
    //         case 1: case 3: case 5: case 7: case 8: case 10: case 12:
    //             return 31;
    //         case 4: case 6: case 9: case 11:
    //             return 30;
    //         case 2:
    //             return (nam % 4 == 0 && (nam % 100 != 0 || nam % 400 == 0)) ? 29 : 28; // Nam nhuan
    //         default:
    //             throw new IllegalArgumentException("Thang khong hop le: " + thang);
    //     }
    // }
}
