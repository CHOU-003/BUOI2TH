/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaynh;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Objects;
public class Acount {
    private int SoTK;
    private String TenTK;
    private double SoTien;
    private String TrangThai;
    
    public Acount (){}

    public Acount(int SoTK, String TenTK, double SoTien) {
        this.SoTK = SoTK;
        this.TenTK = TenTK;
        this.SoTien = SoTien;
    }
 
    public int getSoTK() {
        return SoTK;
    }

    public void setSoTK(int SoTK) {
        if(SoTK > 0 && SoTK != 999999)
        {
        this.SoTK = SoTK;
        }
        else{
            System.out.println("Nhap lai So Tai Khoan.");
        }
    }

    public String getTenTK() {
        return TenTK;
    }

    public void setTenTK(String TenTK) {
        if(TenTK != null)
        {
        this.TenTK = TenTK;
        }
        else{
            System.out.println("Ten không duoc rong.");
        }
    }

    public double getSoTien() {
        return SoTien;
    }

    public void setSoTien(double SoTien) {
        if(SoTien >=50)
        {
        this.SoTien = SoTien;
        } else{
            System.out.println("So tien không hop le.");
        }
    }

    public String getTrangThai() {
        return TrangThai;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    Locale local = new Locale("vi", "VN");
    NumberFormat formatter = NumberFormat.getCurrencyInstance(local);
    String curency = formatter.format(this.SoTien);
    
    double LaiXuat = 0.035;
    
    public void NapTien(double TienNap){
        if(TienNap > 0){
         double Tien = TienNap + SoTien;
         System.out.println("Tien trong tai khoan hien tai: "+Tien);}else{
            System.out.println("So tien nap vao khong hop le.");
        }
    }
    
    public void RutTien(double TienRut){
        if(TienRut > SoTien){
        double Tien = SoTien - TienRut;
        System.out.println("Tien con lai trong tai khoan la: "+Tien);
        }else{
            System.out.println("So tien rut khong hop le.");
        }
    }
    
    public void ChuyenTien(Acount ac, double TienChuyen){
            if(this.SoTien >= TienChuyen){
                    this.SoTien -= TienChuyen;
                    ac.NapTien(TienChuyen);
                    System.out.println("Chuyen tien thanh cong.");
                    System.out.println("So tien con lai trong tai khoan la: "+formatter.format(this.SoTien));
            }
            else{
                System.out.println("Khong du tien trong tai khoan de thuc hien giao dich.");
            }
    }
    
    public void DaoHan(double SoDu){
        SoDu = SoDu + SoDu * LaiXuat;
        System.out.println("So tien dao han: " + SoDu);
    }

    @Override
    public String toString() {
        return "Acount{" + "SoTK=" + SoTK + ", TenTK=" + TenTK + ", SoTien=" + SoTien + '}';
    }
    
    
}
