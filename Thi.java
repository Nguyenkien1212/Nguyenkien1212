/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Thi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Thongtin k1= new Thongtin();
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap ten khach 1:");
        k1.setName(sc.nextLine());
        System.out.println("nhap que quan khach 1:");
        k1.setAddress(sc.nextLine());
        System.out.println("nhap sdt khach 1:");
        k1.setPhone(sc.nextInt());
        System.out.println("nhap tien chua chiet khau khach1:");
        k1.setMoney(sc.nextInt());
        System.out.println("nhap chiet khau khach 1:");
        k1.setPercentage(sc.nextInt());
        System.out.println("nhap thue khach 1:");
        k1.setTax(sc.nextInt());
        
        
           Thongtin k2= new Thongtin();
        System.out.println("nhap ten khach 2:");
        k2.setName(sc.nextLine());sc.nextLine();
        System.out.println("nhap que quan khach 2:");
        k2.setAddress(sc.nextLine());
        System.out.println("nhap sdt khach 2:");
        k2.setPhone(sc.nextInt());
        System.out.println("nhap tien chua chiet khau khach2:");
        k2.setMoney(sc.nextInt());
        System.out.println("nhap chiet khau khach 2:");
        k2.setPercentage(sc.nextInt());
        System.out.println("nhap thue khach 2:");
        k2.setTax(sc.nextInt());
        
        
          Thongtin k3= new Thongtin();
        System.out.println("nhap ten khach 3:");
        k3.setName(sc.nextLine());sc.nextLine();
        System.out.println("nhap que quan khach 3:");
        k3.setAddress(sc.nextLine());
        System.out.println("nhap sdt khach 3:");
        k3.setPhone(sc.nextInt());
        System.out.println("nhap tien chua chiet khau khach3:");
        k3.setMoney(sc.nextInt());
        System.out.println("nhap chiet khau khach 3:");
        k3.setPercentage(sc.nextInt());
        System.out.println("nhap thue khach 3:");
        k3.setTax(sc.nextInt());
        
        
        
          Thongtin k4= new Thongtin();
        System.out.println("nhap ten khach 4:");
        k4.setName(sc.nextLine());sc.nextLine();
        System.out.println("nhap que quan khach 4:");
        k4.setAddress(sc.nextLine());
        System.out.println("nhap sdt khach 4:");
        k4.setPhone(sc.nextInt());
        System.out.println("nhap tien chua chiet khau khach4:");
        k4.setMoney(sc.nextInt());
        System.out.println("nhap chiet khau khach 4:");
        k4.setPercentage(sc.nextInt());
        System.out.println("nhap thue khach 4:");
        k4.setTax(sc.nextInt());
        
        
        
          Thongtin k5= new Thongtin();
        System.out.println("nhap ten khach 5:");
        k5.setName(sc.nextLine());sc.nextLine();
        System.out.println("nhap que quan khach 5:");
        k5.setAddress(sc.nextLine());
        System.out.println("nhap sdt khach 5:");
        k5.setPhone(sc.nextInt());
        System.out.println("nhap tien chua chiet khau khach5:");
        k5.setMoney(sc.nextInt());
        System.out.println("nhap chiet khau khach 5:");
        k5.setPercentage(sc.nextInt());
        System.out.println("nhap thue khach 5:");
        k5.setTax(sc.nextInt());
        
        System.out.printf("%20s %20s %10s %15s %10s %5s","ten khach","que quan","sdt","tien","chiet khau","thue");
        k1.inthongtin();
        k2.inthongtin();
        k3.inthongtin();
        k4.inthongtin();
        k5.inthongtin();
        
        System.out.print("_____________________________");
        
    }
    
}