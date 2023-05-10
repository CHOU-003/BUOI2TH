/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chaycd;

import java.util.Scanner;
/**
 *
 * @author DINH CHAU
 */
public class ChayCD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DanhSachCD dd = new DanhSachCD();
       Scanner sc  = new Scanner(System.in);
       int chon = 0;
       
        do {
             System.out.println("0. Thoat khoi man hinh nhap.\n"
            + "1. Them CD vao Menu.\n"
            + "2. Xuat menu CD.\n"
            + "3. Tong gia thanh cua danh sach CD. \n"
            + "4. Sap xep san pham giam dan theo gia thanh.\n"
            + "5. Sap xep san pham tang dan theo gia thanh.\n"
            + "6. Tong CD co trong danh sach. \n");
         System.out.print("Lua chon cua ban la: ");
          chon = sc.nextInt();
          sc.nextLine();
          
          if(chon == 1){
              dd.Nhap(chon);
          }
          else if(chon == 2){
              dd.XuatTT();
          }
          else if(chon == 3){
              dd.TongGia();
          }
          else if(chon == 4){
              dd.SapXepGiaGiamDan();
              dd.XuatTT();
          }
          else if(chon == 5){
              dd.SapXepGiaTangDan();
              dd.XuatTT();
          }
          else if(chon == 6){
              dd.TongCD();
          }
        } while (chon != 0);
    }
    
}
