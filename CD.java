/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaycd;

/**
 *
 * @author DINH CHAU
 */
public class CD {
    private int MaCD;
    private String TenCD;
    private int SoBH;
    private double Gia;

    public CD(){}

    public CD(int MaCD, String TenCD, int SoBH, double Gia) {
        this.MaCD = MaCD;
        this.TenCD = TenCD;
        this.SoBH = SoBH;
        this.Gia = Gia;
    }
    public int getMaCD() {
        return MaCD;
    }

    public void setMaCD(int MaCD) {
        this.MaCD = MaCD;
    }

    public String getTenCD() {
        return TenCD;
    }

    public void setTenCD(String TenCD) {
        this.TenCD = TenCD;
    }

    public int getSoBH() {
        return SoBH;
    }

    public void setSoBH(int SoBH) {
        this.SoBH = SoBH;
    }

    public double getGia() {
        return Gia;
    }

    public void setGia(double Gia) {
        this.Gia = Gia;
    }

    @Override
    public String toString() {
        return "CD{" + "MaCD=" + MaCD + ", TenCD=" + TenCD + ", SoBH=" + SoBH + ", Gia=" + Gia + '}';
    }
     
}
