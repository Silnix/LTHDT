import java.util.Scanner;

public class QLCB {
    private CanBo[] canBo;
    public QLCB() {
        canBo = new CanBo[0];
    }

    public void Themcanbo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng cán bộ: ");
        int n = scanner.nextInt();
        canBo = new CanBo[n];
        scanner.nextLine();
        for (int i = 0; i < n; i++) {

            System.out.println("Nhập thông tin cho Cán bộ thứ " + (i + 1) + ":");
            System.out.println("Họ tên: ");
            String Hoten = scanner.nextLine();

            System.out.println("Tuổi: ");
            int Tuoi = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Giới tính: ");
            String Gioitinh = scanner.nextLine();


            System.out.println("Địa chỉ: ");
            String Diachi = scanner.nextLine();


            System.out.print("Loại Cán bộ (0 - Công nhân, 1 - Kỹ sư, 2 - Nhân viên): ");
            int m = scanner.nextInt();

            if (m == 0) {
                System.out.print("Bậc: ");
                int Bac = scanner.nextInt();
                scanner.nextLine();
                canBo[i] = new CongNhan(Bac, Hoten, Tuoi, Gioitinh, Diachi);
            } else if (m == 1) {
                System.out.print("Ngành đào tạo: ");
                String Nganhdaotao = scanner.next();
                scanner.nextLine();
                canBo[i] = new KySu(Nganhdaotao, Hoten, Tuoi, Gioitinh, Diachi);
            } else if (m == 2) {
                System.out.print("Công việc: ");
                String Congviec = scanner.nextLine();
                scanner.nextLine();
                canBo[i] = new NhanVien(Congviec, Hoten, Tuoi, Gioitinh, Diachi);
            }
        }
    }

    public void Timkiemtheohoten() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập họ tên cần tìm: ");
        String Hoten = scanner.nextLine();
        scanner.nextLine();
        boolean found = false;

        for (CanBo cb : canBo) {
            if (cb.getHoten().equals(Hoten)) {
                System.out.println("------------------------------");
                cb.print1();
                found = true;
                break; // Dừng tìm sau khi có kq
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy cán bộ có họ tên là " + Hoten);
        }
    }

    public void Thongtincanbo() {
        System.out.println("\nThông tin Cán bộ:");
        for (CanBo cb : canBo) {
            System.out.println("------------------------------");
            cb.print1();
        }
    }

    public static void main(String[] args) {
        QLCB qlcb = new QLCB();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChọn chức năng:");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("++  1. Thêm mới cán bộ             ++");
            System.out.println("++  2. Tìm kiếm theo họ tên        ++");
            System.out.println("++  3. Hiển thị thông tin cán bộ   ++");
            System.out.println("++  4. Thoát                       ++");
            System.out.println("+++++++++++++++++++++++++++++++++++++");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    qlcb.Themcanbo();
                    break;
                case 2:
                    qlcb.Timkiemtheohoten();
                    break;
                case 3:
                    qlcb.Thongtincanbo();
                    break;
                case 4:
                    System.out.println("Thoát khỏi chương trình.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
