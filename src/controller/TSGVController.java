package controller;

import java.util.Scanner;

import services.TSGVServices;
import ui.HocVienUI;
import ui.TS_GiaoVuUI;
import utils.Console;
import utils.Sleep;

public class TSGVController {
    private TSGVServices tsgvServices;
    
    public TSGVController() {
        tsgvServices = new TSGVServices();
    }
    
    public void showMenu() {
        Scanner sc =  new Scanner(System.in);
        char choose;
        while (true) {
            Console.clearConsole();
            TS_GiaoVuUI.menu();
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
