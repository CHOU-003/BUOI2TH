/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chaynh;

/**
 *
 * @author DINH CHAU
 */
import java.util.Scanner;
public class ChayNH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    AccountList ac = new AccountList();
    int chon = 0;

    do {
        System.out.println("Chon chuc nang:");
        System.out.println("0. Thoat khoi man hinh nhap.");
        System.out.println("1. Them tai khoan vao danh sach.");
        System.out.println("2. Xuat danh sach tai khoan.");
        System.out.println("3. Xoa mot tai khoan khoi danh sach.");
        System.out.println("4. Tim kiem tai khoan.");
        System.out.println("5. Tong tai khoan trong danh sach.");
        System.out.println("6. Rut tien tu tai khoan.");
        System.out.println("7. Chuyen tien tai khoan.");
        System.out.println("8. So du tai khoan dai han.");
        System.out.println("9. Nap tỉn vao tai khoan.");
        System.out.print("Lua chon cua ban la: ");
        chon = sc.nextInt();
        sc.nextLine();

        switch (chon) {
            case 1: 
                ac.Nhap();
                break;
            case 2: 
                ac.Xuat();
                break;
            case 3: // Xóa tài khoản
                System.out.print("Nhap so tai khoan can xoa: ");
                int soTK = sc.nextInt();
                boolean ketQua = ac.XoaTK(soTK);
                if (ketQua) {
                    System.out.println("Xoa tai khoan thanh cong.");
                } else {
                    System.out.println("Khong tim thay tai khoan can xoa.");
                }
                break;
            case 4: 
                System.out.print("Nhap so tai khoan can tim: ");
                soTK = sc.nextInt();
                ac.TimTK(soTK);
                break;
            case 5:    
                System.err.println("Tong so tai khoan: "+ac.TongTK());
                break;
            case 6:
                 ac.RutTien();
                break;
            case 7: 
                ac.ChuyenTien();
                break;
            case 8:
                ac.Dao();
                break;
            case 9:
                ac.Nap();
                break;
            case 0:
                System.out.println("KET THUC !");
                break;
            default:
                System.out.println("Khong co chuc nang phu hop. Vui long chon lai.");
                break;
        }
    } while (chon != 0);
}
}
