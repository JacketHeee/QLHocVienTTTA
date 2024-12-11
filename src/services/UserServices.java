package services;

import database.users.UserDB;
import model.user.NguoiDung;

public class UserServices {
    private UserDB userDB; 

    public UserServices() {
        this.userDB = new UserDB();
    }

    public NguoiDung getUserByID(String id) {
        for (NguoiDung x : userDB.getListUser()) 
            if (x.getMaNguoiDung().equals(id)) 
                return x;
        return null;
    }

    public NguoiDung checkLogin(String username, String password) {
        for (NguoiDung x : userDB.getListUser()) 
        // Kiểm tra nếu thông tin đăng nhập đúng
            if (username.equals(x.getTenNguoiDung()) && password.equals(x.getMatKhau())) {
            // Tạo đối tượng User với thông tin đăng nhập
            return x;
        }
        return null;  // Trả về null nếu đăng nhập sai
    }
}
