package model;

import model.person.*;

public class NguoiDung {

    private int maNguoiDung;       // Mã người dùng
    private String tenNguoiDung;   // Tên người dùng
    private String matKhau;        // Mật khẩu
    private String vaiTro;         // Vai trò (admin, giáo viên, học viên)
    private String trangThai;      // Trạng thái (đang hoạt động, khóa, v.v.)
    private String soDienthoai;    // Số điện thoại
    private String email;          // Email
    private NgayThangNam ngayDangKy;  // Ngày đăng ký

    // Constructor
    public NguoiDung(int maNguoiDung, String tenNguoiDung, String matKhau, String vaiTro, String trangThai, String soDienthoai, String email, NgayThangNam ngayDangKy) {
        this.maNguoiDung = maNguoiDung;
        this.tenNguoiDung = tenNguoiDung;
        this.matKhau = matKhau;
        this.vaiTro = vaiTro;
        this.trangThai = trangThai;
        this.soDienthoai = soDienthoai;
        this.email = email;
        this.ngayDangKy = ngayDangKy;
    }

    // Getter và Setter cho các thuộc tính
    public int getMaNguoiDung() {
        return maNguoiDung;
    }

    public void setMaNguoiDung(int maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(String vaiTro) {
        this.vaiTro = vaiTro;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    public String getSoDienthoai() {
        return soDienthoai;
    }

    public void setSoDienthoai(String soDienthoai) {
        this.soDienthoai = soDienthoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NgayThangNam getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(NgayThangNam ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    // Phương thức để in thông tin người dùng
    public void printInfo() {
        System.out.println("Mã Người Dùng: " + maNguoiDung);
        System.out.println("Tên Người Dùng: " + tenNguoiDung);
        System.out.println("Vai Trò: " + vaiTro);
        System.out.println("Trạng Thái: " + trangThai);
        System.out.println("Số Điện Thoại: " + soDienthoai);
        System.out.println("Email: " + email);
        System.out.println("Ngày Đăng Ký: " + ngayDangKy.getInfor());
    }
}
