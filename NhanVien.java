public class NhanVien extends CanBo {
    private String Congviec;
    public NhanVien (String Congviec, String Hoten, int Tuoi, String Gioitinh, String Diachi) {
        super(Hoten,Tuoi,Gioitinh,Diachi);
        this.Congviec = Congviec;
    }
    public void setCongviec (String Congviec) {
        this.Congviec = Congviec;
    }
    public String getCongviec() {
        return Congviec;
    }
    @Override
    public void print1() {
        super.print1();
        System.out.println("Loại cán bộ: Nhan vien");
        System.out.println("Công việc: " +Congviec);
    }
}
