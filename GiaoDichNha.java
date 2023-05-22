package Bai1TH4;

class GiaoDichNha extends GiaoDich {
    protected String loaiNha;
    protected String diaChi;
    protected double dienTich;

    public GiaoDichNha(String maGiaoDich, int ngay, int thang, int nam, double donGia, String loaiNha, String diaChi, double dienTich) {
        super(maGiaoDich, ngay, thang, nam, donGia);
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
        this.dienTich = dienTich;
    }

    @Override
    public double tinhThanhTien() {
        if (loaiNha.equals("cao cap")) {
            return dienTich - donGia;
        } else if (loaiNha.equals("thuong")) {
            return dienTich * donGia * 0.9;
        } else {
            return 0;
        }
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Loại nhà: " + loaiNha);
        System.out.println("Địa chỉ: " + diaChi);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Thành tiền: " + tinhThanhTien());
    }
}
