public class KhoiA extends ThiSinh {
    private double toan;
    private double ly;
    private double hoa;
    public KhoiA (double toan, double ly, double hoa, String soBaodanh, String hoTen, String diaChi, double mucUutien) {
        super(soBaodanh,hoTen,diaChi,mucUutien);
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public double getToan() {
        return toan;
    }

    public double getLy() {
        return ly;
    }

    public double getHoa() {
        return hoa;
    }
    @Override
    public void in() {
        super.in();
        System.out.println("Điểm Khối A của thí sinh:");
        System.out.println("Toán: " +toan);
        System.out.println("Lý: " +ly);
        System.out.println("Hóa: " +hoa);
    }
}
