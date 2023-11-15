
import java.util.Scanner;

public class EmployeeII {
    private String ten;
    private String chucvu;
    private double mucluong;

    public EmployeeII(String ten, String chucvu, double mucluong) {
        this.ten = ten;
        this.chucvu = chucvu;
        this.mucluong = mucluong;
    }

    public EmployeeII() {
        this.mucluong = 0;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setChucvu(String chucvu) {
        this.chucvu = chucvu;
    }

    public void setMucluong(double mucluong) {
        this.mucluong = mucluong;
    }

    public String getTen() {
        return this.ten;
    }

    public String getChucvu() {
        return this.chucvu;
    }

    public double getMucluong() {
        return this.mucluong;
    }

    public static int getSongaylamquydinh() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Số ngày trong tháng này có là: ");
        int songaytrongthang = scanner.nextInt();
        System.out.print("Số ngày nghỉ tháng này có là: ");
        int songaynghi = scanner.nextInt();
        return songaytrongthang - songaynghi;
    }

    public static double getLuongphaitra() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lương tháng theo thỏa thuận là: ");
        double luongcodinh = scanner.nextDouble();
        System.out.print("Số ngày đi làm thực tế trong tháng này có là: ");
        int songaylamthucte = scanner.nextInt();
        int songaylamquydinh = getSongaylamquydinh();
        return luongcodinh / songaylamquydinh * songaylamthucte;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng nhân viên: ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
        	scanner.nextLine();
            System.out.print("Tên nhân viên thứ " + i + ": ");
            String ten = scanner.nextLine();
            System.out.print("Chức vụ nhân viên thứ " + i + ": ");
            String chucvu = scanner.nextLine();
            
            EmployeeII e = new EmployeeII();
            e.setTen(ten);
            e.setChucvu(chucvu);
            double luongphaitra = getLuongphaitra();
            e.setMucluong(luongphaitra);
            
            System.out.println("Mức lương phải trả: " + e.getMucluong() + " VNĐ");
            System.out.println("--------------------------------------------------");
        }
    }
}

