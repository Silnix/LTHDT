public class CongNhan extends CanBo {
    private int Bac;

    public CongNhan (int Bac, String Hoten, int Tuoi, String Gioitinh, String Diachi) {
        super(Hoten,Tuoi,Gioitinh,Diachi);
        this.Bac = (Bac >= 1 && Bac <= 10) ? Bac : 1;
    }
    public void setBac (int Bac) {
        this.Bac = Bac;
    }
    public int getBac() {
        return Bac;
    }
    @Override

    public void print1() {
        super.print1();
        System.out.println("Loại cán bộ: Công nhân");
        System.out.println("Bậc: " +Bac);
    }
}
