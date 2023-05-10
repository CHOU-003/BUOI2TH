/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaynh;

import java.util.ArrayList;
import chaynh.Acount;
import java.util.Scanner;
import java.util.Collection;
public class AccountList {
   Scanner sc = new Scanner(System.in);
   private  ArrayList<Acount> ds = new ArrayList<>();
   public int count = 0;
   
     public AccountList() {
        for (int i = 0; i < 10; i++) {
            ds.add(null);
        }
        count = 0;
    }
     
    public AccountList(int n) {
    if (n > 0) {
        ds = new ArrayList<Acount>(n);
        for (int i = 0; i < n; i++) {
            ds.add(null);
        }
    } else {
        ds = new ArrayList<Acount>(10);
        for (int i = 0; i < 10; i++) {
            ds.add(null);
        }
    }
    count = 0;
    }
    
    public void Nhap() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Nhap so tai khoan: ");
    int SoTK = sc.nextInt();
    sc.nextLine(); 
    System.out.print("Nhap ten tai khoan: ");
    String TenTK = sc.nextLine();
    System.out.print("Nhap so tien: ");
    double SoTien = sc.nextDouble();
    sc.nextLine();
    Acount a = new Acount(SoTK, TenTK, SoTien);
    ds.add(a);
}

    
    public void TimTK(int stk) {
    for(Acount ac : ds) {
        if(ac.getSoTK() == stk) { 
           System.out.println(ac.toString());
        }
    }
    }
    
    public boolean XoaTK(int stk){
        for(Acount a : ds){
            if(a.getSoTK() == stk){
                return this.ds.remove(a);
            }
            else{
                return false;
            }
        }
        return  false;
    }
    
    public int TongTK(){
        return count;
    }
    
    public void Xuat(){
        for(Acount a :  ds){
            System.out.println(a.toString());
        }
    }
    
    public void RutTien(){
        for(Acount a:ds){
            a.RutTien(count);
        }
    }
    
    public void Nap(){
        for(Acount a : ds){
            a.NapTien(count);
        }
    }
    
    public void ChuyenTien(){
        for(Acount a: ds){
            a.ChuyenTien(a, count);
        }
    }
    public void Dao(){
        for(Acount a : ds){
            a.DaoHan(count);
        }
    }
}

