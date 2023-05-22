package Bai1TH4;

class GiaoDichDat extends GiaoDich {
    protected String loaiDat;
    protected double dienTich;

    public GiaoDichDat(String maGiaoDich, int ngay, int thang, int nam, double donGia, String loaiDat, double dienTich) {
        super(maGiaoDich, ngay, thang, nam, donGia);
        this.loaiDat = loaiDat;
        this.dienTich = dienTich;
    }

    @Override
    public double tinhThanhTien() {
        if (loaiDat.equals("A")) {
            return dienTich * donGia - 1.5;
        } else if (loaiDat.equals("B") || loaiDat.equals("C")) {
            return dienTich * donGia;
        } else {
            return 0;
        }
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.println("Loại đất: " + loaiDat);
        System.out.println("Diện tích: " + dienTich);
        System.out.println("Thành tiền: " + tinhThanhTien());
    }
}