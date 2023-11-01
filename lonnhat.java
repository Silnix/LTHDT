import java.util.Scanner;


public class lonnhat {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương thứ nhất: ");
        int num1 = scanner.nextInt();
        System.out.print("Nhập số nguyên dương thứ hai: ");
        int num2 = scanner.nextInt();
        System.out.print("Nhập số nguyên dương thứ ba: ");
        int num3 = scanner.nextInt();
        System.out.print("Nhập số nguyên dương thứ tư: ");
        int num4 = scanner.nextInt();

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        if (num4 > max) {
            max = num4;
        }
        System.out.println("Số lớn nhất trong 4 số là: " + max);
    }
}
    

