public class KhoiB extends ThiSinh {
    private double toan;
    private double hoa;
    private double sinh;
    public KhoiB (double toan, double hoa, double sinh, String soBaodanh, String hoTen, String diaChi, double mucUutien) {
        super(soBaodanh,hoTen,diaChi,mucUutien);
        this.toan = toan;
        this.hoa = hoa;
        this.sinh = sinh;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    public void setSinh(double sinh) {
        this.sinh = sinh;
    }

    public double getToan() {
        return toan;
    }

    public double getHoa() {
        return hoa;
    }

    public double getSinh() {
        return sinh;
    }

    @Override
    public void in() {
        super.in();
        System.out.println("Điểm Khối B của thí sinh:");
        System.out.println("Toán: " +toan);
        System.out.println("Hóa: " +hoa);
        System.out.println("Sinh: " +sinh);
    }
}

