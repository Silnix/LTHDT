abstract class ThiSinh {
    private String soBaodanh;
    private String hoTen;
    private String diaChi;
    private double mucUutien;

    public ThiSinh (String soBaodanh, String hoTen, String diaChi, double mucUutien) {
        this.soBaodanh = soBaodanh;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.mucUutien = mucUutien;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setSoBaodanh(String soBaodanh) {
        this.soBaodanh = soBaodanh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setMucUutien(double mucUutien) {
        this.mucUutien = mucUutien;
    }

    public String getSoBaodanh() {
        return soBaodanh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public Double getMucUutien() {
        return mucUutien;
    }
    public void in() {
        System.out.println("Số báo danh: " +soBaodanh);
        System.out.println("Họ tên: " +hoTen);
        System.out.println("Địa chỉ: " +diaChi);
        System.out.println("Mức ưu tiên: " +mucUutien);
    }
}