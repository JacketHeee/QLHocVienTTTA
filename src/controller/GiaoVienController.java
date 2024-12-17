package controller;

import java.util.Scanner;

import model.user.GiaoVien;
import services.GiaoVienServices;
import ui.GiaoVienUI;
import utils.Console;
import utils.Sleep;

public class GiaoVienController {
    private GiaoVien giaoVien; // Thuộc tính chứa thông tin học viên
    GiaoVienServices giaoVienServices;
    public GiaoVienController(GiaoVien giaoVien) {
        this.giaoVien = giaoVien; // Nhận đối tượng học viên khi tạo controller
        giaoVienServices = new GiaoVienServices();
    }
    
    public void showMenu() {
        Scanner sc =  new Scanner(System.in);
        char choose;
        while (true) {
            Console.clearConsole();
            GiaoVienUI.menu();
            System.out.print("Lua chon cua ban la: ");      
            choose = sc.nextLine().charAt(0); 
            switch (choose) {
                case '1':
                break;
                case '2':
                break;
                case '3': 
                break;
            }
            if (choose == 'x') {
                Console.clearConsole();
                Sleep.dangXuat();
                break;
            }
            System.out.print("-------Enter de tiep tuc-----");
            sc.nextLine();
        }
    }
}
