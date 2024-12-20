package database.thanhtoan_khuyenmai;

import java.io.*;

import java.util.ArrayList;
import java.util.Scanner;

import database.khoahoc.LopHocDB;
import database.users.HocVienDB;
import model.khoahoc.LopHoc;
import model.person.NgayThangNam;
import model.thanhtoan_khuyenmai.HoaDonThanhToan;
import model.thanhtoan_khuyenmai.KhuyenMai;
import model.user.HocVien;

public class HoaDonThanhToanDB {
    private ArrayList<HoaDonThanhToan> listHoaDonThanhToan; 
    static String src;

    public HoaDonThanhToanDB() {
        src = "data/thanhtoan_khuyenmai/HoaDonThanhToan_data.txt";
        listHoaDonThanhToan = this.docFile();
    }

    public ArrayList<HoaDonThanhToan> getlistHoaDonThanhToan() {
        return listHoaDonThanhToan;
    }

    public void setlistHoaDonThanhToan(ArrayList<HoaDonThanhToan> listHoaDonThanhToan) {
        this.listHoaDonThanhToan = listHoaDonThanhToan;
    }
    public ArrayList<HoaDonThanhToan> docFile() {
        ArrayList<HoaDonThanhToan> listHoaDonThanhToan = new ArrayList<>();
        File userFile = new File(src); 
        try (Scanner sc = new Scanner(userFile)) {
            while (sc.hasNextLine()) {
                String tmp[] = sc.nextLine().split("#"); 
                String id = tmp[0]; 
                HocVienDB hocVienDB = new HocVienDB();
                HocVien hv = hocVienDB.getHocvienByID(tmp[1]);

                LopHocDB lopHocDB = new LopHocDB();
                ArrayList<LopHoc> list = new ArrayList<>();
                int size = tmp.length - 13;
                for (int i = 2; i<size; i++) {
                    list.add(lopHocDB.getLopHocById(tmp[i]));                    
                }

                int startIndex = 2 + list.size(); 
                KhuyenMai km = null;
                if (tmp[startIndex].compareTo("null") != 0) {

                }
                startIndex++;
                NgayThangNam ngayphathanh = new NgayThangNam(tmp[startIndex++],tmp[startIndex++],tmp[startIndex++]);
                String tinhtrang = tmp[startIndex++];
                double tongTien = Double.parseDouble(tmp[startIndex++]);
                String phthuc = tmp[startIndex++]; 
                String ngay = tmp[startIndex++];
                String thang = tmp[startIndex++];
                String nam = tmp[startIndex++];
                NgayThangNam ngayThanhtoan = new NgayThangNam(ngay,thang,nam);
                double soTienThanhToan = Double.parseDouble(tmp[startIndex++]);
                String ghichu = tmp[startIndex++];
                NgayThangNam ngayhethan = null;
                if (tmp[startIndex].compareTo("null") != 0) {
                    ngayhethan = new NgayThangNam(tmp[startIndex++],tmp[startIndex++],tmp[startIndex++]);
                }
                listHoaDonThanhToan.add(new HoaDonThanhToan(id, hv, list, km, ngayphathanh, tinhtrang, tongTien, phthuc, ngayThanhtoan, soTienThanhToan, ghichu, ngayhethan));

            }
        }
        catch (IOException e) {
            System.out.println("Khong the mo file");
        }
        return listHoaDonThanhToan;
    }

    
    
    public HoaDonThanhToan getHoaDonThanhToanById(String id) {
        for (HoaDonThanhToan x : this.listHoaDonThanhToan) 
        if (x.getMaHoaDon().equals(id))
        return x;
        return null;
    }
    
    public void ghiFile(HoaDonThanhToan hoaDonThanhToan) {
        File file = new File(src);
        try (FileWriter writer = new FileWriter(file, true)) {  // "true" để ghi thêm vào file, không ghi đè
            StringBuilder sb = new StringBuilder();
    
            // Ghi từng thuộc tính của hóa đơn vào chuỗi
            sb.append(hoaDonThanhToan.getMaHoaDon()).append("#");
            sb.append(hoaDonThanhToan.gethocVien().getMaHocVien()).append("#");
    
            // Ghi danh sách lớp học
            for (LopHoc lopHoc : hoaDonThanhToan.getlopHoc()) {
                sb.append(lopHoc.getMaLopHoc()).append("#");
            }
    
            // Ghi thông tin khuyến mãi (nếu có)
            sb.append(hoaDonThanhToan.getkhuyenMai() != null ? hoaDonThanhToan.getkhuyenMai().getMaKhuyenMai() : "null").append("#");
    
            // Ghi ngày phát hành
            NgayThangNam ngayPhatHanh = hoaDonThanhToan.getNgayPhatHanh();
            sb.append(ngayPhatHanh.getNgay()).append("#")
              .append(ngayPhatHanh.getThang()).append("#")
              .append(ngayPhatHanh.getNam()).append("#");
    
            // Ghi tình trạng
            sb.append(hoaDonThanhToan.getTinhTrang()).append("#");
    
            // Ghi tổng tiền
            sb.append(String.format("%.1f", hoaDonThanhToan.getTongTien())).append("#");
    
            // Ghi phương thức thanh toán
            sb.append(hoaDonThanhToan.getPhuongThucThanhToan()).append("#");
    
            // Ghi ngày thanh toán
            NgayThangNam ngayThanhToan = hoaDonThanhToan.getNgayThanhToan();
            sb.append(ngayThanhToan.getNgay()).append("#")
              .append(ngayThanhToan.getThang()).append("#")
              .append(ngayThanhToan.getNam()).append("#");
    
            // Ghi số tiền thanh toán
            sb.append(String.format("%.1f",hoaDonThanhToan.getSoTienThanhToan())).append("#");
    
            // Ghi ghi chú
            sb.append(hoaDonThanhToan.getGhiChu()).append("#");
    
            // Ghi ngày hết hạn (nếu có)
            NgayThangNam ngayHetHan = hoaDonThanhToan.getNgayHetHan();
            if (ngayHetHan != null) {
                sb.append(ngayHetHan.getNgay()).append("#")
                  .append(ngayHetHan.getThang()).append("#")
                  .append(ngayHetHan.getNam());
            } else {
                sb.append("null");
            }
            
            // Xuống dòng cho mỗi hóa đơn
            writer.write(System.lineSeparator());
            writer.write(sb.toString());
            this.listHoaDonThanhToan.add(hoaDonThanhToan);
            System.out.println("Ghi file thành công!");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        HoaDonThanhToanDB HoaDonThanhToanDB = new HoaDonThanhToanDB(); 
        for (HoaDonThanhToan x : HoaDonThanhToanDB.getlistHoaDonThanhToan())
            x.show();
    }
}
