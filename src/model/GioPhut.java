package model;

public class GioPhut {
    private int gio;   // Giờ
    private int phut;  // Phút

    // Constructor
    public GioPhut(int gio, int phut) {
        this.gio = gio;
        this.phut = phut;
    }

    // Getter and Setter for gio
    public int getGio() {
        return gio;
    }

    public void setGio(int gio) {
        this.gio = gio;
    }

    // Getter and Setter for phut
    public int getPhut() {
        return phut;
    }

    public void setPhut(int phut) {
        this.phut = phut;
    }

    // Method to get the time in string format (HH:mm)
    public String getFormattedTime() {
        return String.format("%02d:%02d", gio, phut);
    }
}

