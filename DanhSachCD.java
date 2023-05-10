/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaycd;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachCD {
    ArrayList<CD> menu = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    int chon = 0;
    
    public void Nhap(int n){
        do {
            for(int i=0; i<n;i++){
                System.out.println("0. THOAT !!!");
                System.out.println("1. Nhap CD vao danh sach.");
                chon = sc.nextInt();sc.nextLine();
                switch (chon) {
                    case 1:
                        System.out.print("Nhap ma CD: "); int MaCD = sc.nextInt();sc.nextLine();
                        System.out.print("Nhap ten CD: "); String TenCD = sc.nextLine();
                        System.out.print("So Bai Hat: "); int SoBH =sc.nextInt();
                        System.out.print("Nhap gia CD: "); double Gia = sc.nextDouble();
                        CD c = new CD(MaCD, TenCD, SoBH, Gia);
                        menu.add(c);
                        break;
                }
            }
        } while (chon !=0);
    }
    
    public void TongGia(){
        int t = 0;
        for(CD c : menu){
            t += c.getGia();
        }
        System.out.println("Tong gia tien cua dia CD: " + t);
    }
    
    public void SapXepGiaGiamDan() {
    Collections.sort(menu, new Comparator<CD>() {
        @Override
        public int compare(CD c1, CD c2) {
            if (c1.getGia() < c2.getGia()) {
                return 1;
            } else if (c1.getGia() > c2.getGia()) {
                return -1;
            }
            return 0;
        }
    });
    }

    
    public void SapXepGiaTangDan() {
    Collections.sort(menu, new Comparator<CD>() {
        @Override
        public int compare(CD c1, CD c2) {
            if (c1.getGia() > c2.getGia()) {
                return 1;
            } else if (c1.getGia() < c2.getGia()) {
                return -1;
            }
            return 0;
        }
    });
    }
    
    public int TongCD() {
        return menu.size();
    }
    
    public void XuatTT(){
        for(CD c : menu){
            System.out.println(c.toString());
        }
    }
}
