public class KhoiC extends ThiSinh {
    private double van;
    private double su;
    private double dia;
    public KhoiC (double van, double su, double dia, String soBaodanh, String hoTen, String diaChi, double mucUutien) {
        super(soBaodanh,hoTen,diaChi,mucUutien);
        this.van = van;
        this.su = su;
        this.dia = dia;
    }

    public void setVan(double van) {
        this.van = van;
    }

    public void setSu(double su) {
        this.su = su;
    }

    public void setDia(double dia) {
        this.dia = dia;
    }

    public double getVan() {
        return van;
    }

    public double getSu() {
        return su;
    }

    public double getDia() {
        return dia;
    }

    @Override
    public void in() {
        super.in();
        System.out.println("Điểm Khối C của thí sinh:");
        System.out.println("Văn: " +van);
        System.out.println("Sử: " +su);
        System.out.println("Địa: " +dia);
    }
}
