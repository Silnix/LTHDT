import java.util.Scanner;


public class Uocchung {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số a:");
        int a = scanner.nextInt();
        System.out.println("Nhập số b: ");
        int b = scanner.nextInt();
        System.out.println("Nhập ước chung d cần kiểm tra: ");
        int d = scanner.nextInt();
        
        if ((a % d == 0) && (b % d == 0)) {
        	System.out.println("Vậy d = " + d + " là ước chung của hai số a và b, với a = " + a + ", b = " + b);
        } else {
        	System.out.println("Vậy d = " + d + " không là ước chung của hai số a và b, với a = " + a + ", b = " + b);
        }
	}
}
