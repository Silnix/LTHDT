import java.util.Scanner;


public class tamgiac {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Nhập độ dài cạnh a: ");
	    double a = scanner.nextDouble();
	    System.out.print("Nhập độ dài cạnh b: ");
	    double b = scanner.nextDouble();
	    System.out.print("Nhập độ dài cạnh c: ");
	    double c = scanner.nextDouble();

	    if (kiemtra(a, b, c)) {
	    	String loaiTamgiac = getLoaiTamgiac(a, b, c);
	        System.out.println("Đây là một tam giác " + loaiTamgiac);
	    } else {
	        System.out.println("Ba độ dài không tạo thành một tam giác.");
	    }
	}

	public static boolean kiemtra(double a, double b, double c) {
		return a + b > c && a + c > b && b + c > a;
	}

	public static String getLoaiTamgiac(double a, double b, double c) {
		if (a == b && b == c) {
			return "đều";
	    } else if (a == b || a == c || b == c) {
	    	if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
	    		return "vuông cân";
	        } else {
	            return "cân";
	        }
	    } else {
	    	if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
	    		return "vuông";
	        } else {
	            return "thường";
	        }
	     }
	}
}

