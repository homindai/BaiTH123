package Bai1TH4;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyGiaoDich {
    public static void main(String[] args) {
        ArrayList<GiaoDich> danhSachGiaoDich = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng giao dịch: ");
        int soLuongGiaoDich = scanner.nextInt();

        for (int i = 0; i < soLuongGiaoDich; i++) {
            System.out.println("Nhập thông tin giao dịch thứ " + (i + 1) + ":");
            System.out.print("Mã giao dịch: ");
            String maGiaoDich = scanner.next();
            System.out.print("Ngày (ngày tháng năm): ");
            int ngay = scanner.nextInt();
            int thang = scanner.nextInt();
            int nam = scanner.nextInt();
            System.out.print("Đơn giá: ");
            double donGia = scanner.nextDouble();
            System.out.print("Loại (A, B, C): ");
            String loai = scanner.next();

            GiaoDich giaoDich;
            if (loai.equalsIgnoreCase("A") || loai.equalsIgnoreCase("B") || loai.equalsIgnoreCase("C")) {
                System.out.print("Diện tích: ");
                double dienTich = scanner.nextDouble();
                giaoDich = new GiaoDichDat(maGiaoDich, ngay, thang, nam, donGia, loai, dienTich);
            } else {
                System.out.print("Loại nhà (cao cap, thuong): ");
                String loaiNha = scanner.next();
                System.out.print("Địa chỉ: ");
                String diaChi = scanner.next();
                System.out.print("Diện tích: ");
                double dienTich = scanner.nextDouble();
                giaoDich = new GiaoDichNha(maGiaoDich, ngay, thang, nam, donGia, loaiNha, diaChi, dienTich);
            }

            danhSachGiaoDich.add(giaoDich);
            System.out.println("Giao dịch đã được thêm vào danh sách.");
            System.out.println();
        }

        // Tính tổng số lượng cho từng loại
        int soLuongDat = 0;
        int soLuongNha = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                soLuongDat++;
            } else if (giaoDich instanceof GiaoDichNha) {
                soLuongNha++;
            }
        }
        System.out.println("Tổng số lượng giao dịch đất: " + soLuongDat);
        System.out.println("Tổng số lượng giao dịch nhà: " + soLuongNha);

        // Tính trung bình thành tiền của giao dịch đất
        double tongThanhTienDat = 0;
        int soLuongDatCount = 0;
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich instanceof GiaoDichDat) {
                tongThanhTienDat += giaoDich.tinhThanhTien();
                soLuongDatCount++;
            }
        }
        double trungBinhThanhTienDat = tongThanhTienDat / soLuongDatCount;
        System.out.println("Trung bình thành tiền của giao dịch đất: " + trungBinhThanhTienDat);

        // Xuất ra các giao dịch của tháng 9 năm 2013
        System.out.println("Các giao dịch của tháng 5 năm 2023:");
        for (GiaoDich giaoDich : danhSachGiaoDich) {
            if (giaoDich.ngay == 9 && giaoDich.thang == 9 && giaoDich.nam == 2022) {
                giaoDich.xuatThongTin();
                System.out.println();
            }
        }
    }
}