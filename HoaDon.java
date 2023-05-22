package Bai2TH4;

class HoaDon {
    protected String maKhachHang;
    protected String hoTen;
    protected String ngayRaHoaDon;

    public HoaDon(String maKhachHang, String hoTen, String ngayRaHoaDon) {
        this.maKhachHang = maKhachHang;
        this.hoTen = hoTen;
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public double tinhThanhTien() {
        return 0;
    }

    public void xuatThongTin() {
        System.out.println("Mã khách hàng: " + maKhachHang);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Ngày ra hoá đơn: " + ngayRaHoaDon);
    }
}