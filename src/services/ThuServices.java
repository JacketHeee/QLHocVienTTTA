package services;

import database.lichhoc.*;
import model.lichhoc.*;
public class ThuServices {
    private ThuDB thuDB; 

    public ThuServices() {
        thuDB = new ThuDB();
    }

    public Thu getThuById(String id) {
        for (Thu x : thuDB.getlistThu()) 
            if (x.getMaThu().equals(id))
                return x;
        return null;
    }
}
