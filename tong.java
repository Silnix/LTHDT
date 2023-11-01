import java.util.Scanner;


public class tong {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Nhập số nguyên dương n: ");
	        int n = scanner.nextInt();
	        while (n <= 0) {
	        	System.out.println("Không hợp lệ! Vui lòng nhập lại n: ");
	        	n = scanner.nextInt();
	        }
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	        		sum += i;
	        }
	        System.out.println("Tổng của dãy số từ 1 đến " + n + " là " + sum);
	    }	  
}
