/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thi;

/**
 *
 * @author ADMIN
 */
public class Thongtin {
    private String name;
    private String address;
    private int phone;
    private int money;
    private int percentage;
    private int tax;

    public Thongtin() {
    }
    public Thongtin(String name, String address, int phone, int money, int percentage, int tax) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.money = money;
        this.percentage = percentage;
        this.tax = tax;
    }

   
   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

   
    public float tienthucte(){
        return (money-(money*percentage)-tax);
    }
  public void inthongtin() {
        System.out.printf("%-20s %-18s %10.2d %12.2d %12.2d %12.2d %12.2f \n", name, address, phone, money, percentage ,tax, tienthucte());
    }

    void ink1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void inThongtin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
