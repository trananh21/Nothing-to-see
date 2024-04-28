/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanhLapTrinhMang.Lab4;

import java.util.Scanner;

/**
 *
 * @author 84346
 */
public class OOP {

    private double chieuDai;
    private double chieuRong;
    Scanner sc = new Scanner(System.in);

    public OOP() {

    }

    public OOP(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public void nhapdulieu() {
        System.out.println("Nhap vao chieu dai: ");
        this.chieuDai = sc.nextDouble();
        System.out.println("Nhap vao chieu rong: ");
        this.chieuRong = sc.nextDouble();
    }

    public double DienTich(){
        double dai = getChieuDai();
        double rong = getChieuRong();
        return dai * rong;
    }
    
    public double Chuvi(){
        double dai = getChieuDai();
        double rong = getChieuRong();
        return (dai + rong) * 2;
    }

    @Override
        public String toString() {
        String res = "Chieu dai: " + getChieuDai() + "\n"
                + "Chieu rong: " + getChieuRong() + "\n"
                + "Dien tich: " + DienTich() + "\n"
                + "Chu vi: " + Chuvi();
        return res;
    }
    
    public static void main(String[] args) {
        OOP hcn = new OOP();
        hcn.nhapdulieu();
        System.out.println(hcn.toString());
    }
}
