public class KySu extends CanBo {
    private String Nganhdaotao;
    public KySu (String Nganhdaotao, String Hoten, int Tuoi, String Gioitinh, String Diachi) {
        super(Hoten,Tuoi,Gioitinh,Diachi);
        this.Nganhdaotao = Nganhdaotao;
    }
    public void setNganhdaotao (String Nganhdaotao) {
        this.Nganhdaotao = Nganhdaotao;
    }
    public String getNganhdaotao() {
        return Nganhdaotao;
    }
    @Override
    public void print1() {
        super.print1();
        System.out.println("Loại cán bộ: Kỹ sư");
        System.out.println("Ngành đào tạo: " +Nganhdaotao);
    }
}
