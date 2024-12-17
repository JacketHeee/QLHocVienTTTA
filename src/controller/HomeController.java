package controller;

import java.util.Scanner;

import services.HomeServices;
import services.UserServices;
import ui.HomeUI;
import utils.Console;

public class HomeController {
    private HomeServices homeServices;
    public HomeController() {
        homeServices = new HomeServices();
    }
    public void showMenu() {
        Scanner sc =  new Scanner(System.in);
        char choose;
        while (true) {
            Console.clearConsole();
            HomeUI.menu();
            System.out.print("Lua chon cua ban la: ");      
            choose = sc.nextLine().charAt(0); 
            switch (choose) {
                case '1':   
                    UserController userController = new UserController();
                    userController.login();
                break;
                case '2':
                break;
                case '3': 
                break;
            }
            if (choose == 'x') 
                break;
            System.out.print("-------Enter de tiep tuc-----");
            sc.nextLine();
        }
    }
}   
