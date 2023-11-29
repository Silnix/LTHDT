 abstract class CanBo {
     private  String Hoten;
     private  int Tuoi;
     private  String Gioitinh;
     private  String Diachi;

     public CanBo (String Hoten, int Tuoi, String Gioitinh, String Diachi) {
         this.Hoten = Hoten;
         this.Tuoi = Tuoi;
         this.Gioitinh = Gioitinh;
         this.Diachi = Diachi;
     }
     public CanBo() {
         this.Hoten = "unknown";
         this.Tuoi = 0;
         this.Gioitinh = "unknown";
         this.Diachi = "unknown";
     }
    private void setHoten (String Hoten) {
         this.Hoten = Hoten;
    }
    String getHoten() {
         return this.Hoten;
    }
     private void setTuoi (int Tuoi) {
         this.Tuoi = Tuoi;
     }
     private int getTuoi() {
         return this.Tuoi;
     }
     private void setGioitinh (String Gioitinh) {
         this.Gioitinh = Gioitinh;
     }
     private String getGioitinh() {
         return this.Gioitinh;
     }
     private void setDiachi (String Diachi) {
         this.Diachi = Diachi;
     }
     private String getDiachi() {
         return this.Diachi;
     }
     public void print1() {
         System.out.println("Họ tên: " +Hoten);
         System.out.println("Tuổi: " +Tuoi);
         System.out.println("Giới tính: " +Gioitinh);
         System.out.println("Địa chỉ: " +Diachi);
     }
 }