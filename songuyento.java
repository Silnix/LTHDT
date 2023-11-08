import java.util.Scanner;


public class songuyento {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số n cần kiểm tra: ");
        int n = scanner.nextInt();
        if (n < 2) {
        	System.out.print("Số n = " + n + " không phải là số nguyên tố");
        } else {
        	int check = 0;
        	for ( int i = 2; i < (n - 1); i ++) {
        		if ((n % i) == 0) {
        			check ++;
        		}
        	}
        	if (check > 0) {
        		System.out.print("Số n = " + n + " không phải là số nguyên tố");
        	} else {
        		System.out.print("Số n = " + n + " là số nguyên tố");
        	}
        }
	}
}
