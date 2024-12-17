package controller;

import java.util.Scanner;

import ui.HocVienUI;
import ui.HomeUI;
import utils.Console;
import utils.Sleep;
import model.user.HocVien; // Lớp model chứa thông tin học viên
import services.HocVienServices;

public class HocVienController {
    private HocVien hocVien; // Thuộc tính chứa thông tin học viên
    private HocVienServices hocVienServices;
    public HocVienController(HocVien hocVien) {
        this.hocVien = hocVien; // Nhận đối tượng học viên khi tạo controller
        hocVienServices = new HocVienServices();
    }
    
    public void showMenu() {
        Scanner sc =  new Scanner(System.in);
        char choose;
        while (true) {
            Console.clearConsole();
            HocVienUI.menu();
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

