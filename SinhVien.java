/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP;

import java.util.Scanner;

/**
 *
 * @author 84346
 */
public class SinhVien {
    private int ma;
    private String ten;
    private double diemLT;
    private double diemTH;
    
    Scanner sc = new Scanner(System.in);
    
    public SinhVien(){
    }
    
    public SinhVien(int ma, String ten, double diemLT, double diemTH){
        this.ma = ma;
        this.ten = ten;
        this.diemLT = diemLT;
        this.diemTH = diemTH;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }
    
    
    public void NhapDuLieu(){
        System.out.println("Nhap ma: ");
        ma = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap Ten: ");
        ten = sc.nextLine();
        System.out.println("Nhap diem ly thuyet: ");
        diemLT = sc.nextDouble();
        System.out.println("Nhap diem thuc hanh: ");
        diemTH = sc.nextDouble();
    
    }
    
    public double tinhDiemTb(){
        double lt = getDiemLT();
        double th = getDiemTH();
        return (lt+th*2)/3;
        
    }

    @Override
    public String toString() {
       String res = "Sinh vien co ma " + ma + "," +"ten "+ ten + "," + "Diem trung binh la: " + tinhDiemTb() ;
        return res;
    }
    
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(1, "Nguyen huu phuc thinh",6.5,6.1);
        SinhVien sv2 = new SinhVien(2, "Nguyen thinh huu",1,1.2);
        SinhVien sv3 = new SinhVien();
        sv3.NhapDuLieu();
        System.out.println(sv1.toString());
        System.out.println(sv2.toString());
        System.out.println(sv3.toString());
        
    }
    
    
}
