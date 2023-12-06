import java.util.Scanner;
import java.util.ArrayList;


public class TuyenSinh {
    private ArrayList<ThiSinh> danhSachThiSinh = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void themMoiThiSinh() {

        System.out.print("Nhập số lượng thí sinh: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho thí sinh thứ " + (i + 1) + ":");
            System.out.println("Nhập Số báo danh: ");
            String soBaodanh = scanner.nextLine();
            System.out.println("Nhập Họ tên thí sinh: ");
            String hoTen = scanner.nextLine();
            System.out.println("Nhập Địa chỉ thí sinh: ");
            String diaChi = scanner.nextLine();
            System.out.println("Nhập Mức ưu tiên của thí sinh: ");
            double mucUutien = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Khối thi của thí sinh dự thi đại học (A, B hoặc  C): ");
            String m = scanner.nextLine();

            switch (m.toUpperCase()) {
                case "A":
                    System.out.println("Điểm Khối A:");
                    System.out.println("Toán =  ");
                    double toan = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Lý =  ");
                    double ly = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Hóa =  ");
                    double hoa = scanner.nextDouble();
                    scanner.nextLine();

                    KhoiA thiSinhMoiA = new KhoiA(toan, ly, hoa, soBaodanh, hoTen, diaChi, mucUutien);
                    danhSachThiSinh.add(thiSinhMoiA);

                    System.out.println("Thêm mới thành công!");
                    System.out.println("------------------------------");
                    break;
                case "B":
                    System.out.println("Điểm Khối B:");
                    System.out.println("Toán =  ");
                    toan = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Hóa =  ");
                    hoa = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Sinh =  ");
                    double sinh = scanner.nextDouble();
                    scanner.nextLine();

                    KhoiB thiSinhMoiB = new KhoiB(toan, hoa, sinh, soBaodanh, hoTen, diaChi, mucUutien);
                    danhSachThiSinh.add(thiSinhMoiB);

                    System.out.println("Thêm mới thành công!");
                    System.out.println("------------------------------");
                    break;
                case "C":
                    System.out.println("Điểm Khối C:");
                    System.out.println("Văn =  ");
                    double van = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Sử =  ");
                    double su = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Địa =  ");
                    double dia = scanner.nextDouble();
                    scanner.nextLine();

                    KhoiC thiSinhMoiC = new KhoiC(van, su, dia, soBaodanh, hoTen, diaChi, mucUutien);
                    danhSachThiSinh.add(thiSinhMoiC);

                    System.out.println("Thêm mới thành công!");
                    System.out.println("------------------------------");
                    break;
                default:
                    System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
                    System.out.println("------------------------------");
            }

        }
    }

    private void hienThiThongTinThiSinh() {
        System.out.println("Có tất cả " +danhSachThiSinh.size() +" thí sinh dự thi.");
        for (ThiSinh thiSinh : danhSachThiSinh) {
            System.out.println("------------------------------");
            thiSinh.in();
        }
    }

    private void timKiemTheoSoBaoDanh() {
        System.out.println("Nhập số báo danh cần tìm kiếm: ");
        String soBaodanh = scanner.nextLine();

        for (ThiSinh thiSinh : danhSachThiSinh) {
            if (thiSinh.getSoBaodanh().equals(soBaodanh)) {
                System.out.println("Thí sinh được tìm thấy:");
                thiSinh.in();
                return;
            }
        }

        System.out.println("Không tìm thấy thí sinh với số báo danh " + soBaodanh);
    }

    private void thoatChuongTrinh() {
        System.out.println("Chương trình kết thúc.");
        System.exit(0);
    }
    private void xoaThongtinThiSinh() {
        System.out.println("Bạn muốn:");
        System.out.println("1.  Xóa thông tin của tất cả các thí sinh.");
        System.out.println("2.  Xóa thông tin theo Số báo danh.");
        System.out.println("3.  Quay trở lại.");

        int chon = scanner.nextInt();
        scanner.nextLine();

        switch (chon) {
            case 1:
                danhSachThiSinh.clear();
                System.out.println("Xóa thành công!");
                System.out.println("-----------------------------");
                break;
            case 2:
                System.out.println("Nhập số báo danh cần tìm kiếm: ");
                String soBaodanh = scanner.nextLine();

                for (ThiSinh thiSinh : danhSachThiSinh) {
                    if (thiSinh.getSoBaodanh().equals(soBaodanh)) {
                        System.out.println("Thí sinh được tìm thấy:");
                        danhSachThiSinh.remove(thiSinh);
                        System.out.println("Xóa thành công!");
                        System.out.println("Hiện tại còn " +danhSachThiSinh.size() +" thí sinh dự thi.");
                        return;
                    }
                }
                System.out.println("Không tìm thấy thí sinh với số báo danh " + soBaodanh);

                System.out.println("-----------------------------");
                break;
            case 3:
                System.out.println("Quay lại thành công!");
                System.out.println("-----------------------------");
                return;
            default:
                System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
                System.out.println("-----------------------------");
        }
    }

    public static void main(String[] args) {
        TuyenSinh tuyenSinh = new TuyenSinh();

        while (true) {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("+   Chọn chức năng chính:           +");
            System.out.println("+   1. Thêm mới thí sinh            +");
            System.out.println("+   2. Hiển thị thông tin thí sinh  +");
            System.out.println("+   3. Tìm kiếm theo số báo danh    +");
            System.out.println("+   4. Thoát chương trình           +");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("=   Chức năng mở rộng:              =");
            System.out.println("=   5.  Xóa thông tin thí sinh      =");
            System.out.println("=====================================");

            System.out.println("Chức năng bạn muốn thực hiện: ");
            int choice = tuyenSinh.scanner.nextInt();
            tuyenSinh.scanner.nextLine();

            switch (choice) {
                case 1:
                    tuyenSinh.themMoiThiSinh();
                    break;
                case 2:
                    tuyenSinh.hienThiThongTinThiSinh();
                    System.out.println("-----------------------------");
                    break;
                case 3:
                    tuyenSinh.timKiemTheoSoBaoDanh();
                    System.out.println("-----------------------------");
                    break;
                case 4:
                    tuyenSinh.thoatChuongTrinh();
                    System.out.println("-----------------------------");
                    break;
                case 5:
                    tuyenSinh.xoaThongtinThiSinh();
                    System.out.println("-----------------------------");
                    break;
                default:
                    System.out.println("Chọn không hợp lệ. Vui lòng chọn lại.");
                    System.out.println("-----------------------------");
            }
        }
    }
}