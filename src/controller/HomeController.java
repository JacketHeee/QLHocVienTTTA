package controller;

import services.KhoaHocServices;
import services.LopHocServices;

public class HomeController {
    KhoaHocServices khoaHocServices; 
    LopHocServices lopHocServices; 

    public HomeController() {
        khoaHocServices = new KhoaHocServices(); 
        lopHocServices = new LopHocServices(); 
    }

    public void xemKhoaHocHienCo() {
        khoaHocServices.displayAllKhoaHoc();
    }
}   
