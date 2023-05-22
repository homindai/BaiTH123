package Bai1TH4;

import java.util.ArrayList;
import java.util.Scanner;

class GiaoDich {
    protected String maGiaoDich;
    protected int ngay;
    protected int thang;
    protected int nam;
    protected double donGia;

    public GiaoDich(String maGiaoDich, int ngay, int thang, int nam, double donGia) {
        this.maGiaoDich = maGiaoDich;
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
        this.donGia = donGia;
    }

    public double tinhThanhTien() {
        return 0;
    }

    public void xuatThongTin() {
        System.out.println("Mã giao dịch: " + maGiaoDich);
        System.out.println("Ngày giao dịch: " + ngay + "/" + thang + "/" + nam);
        System.out.println("Đơn giá: " + donGia);
    }
}