import java.util.Scanner;


public class Rectangle {
	private int len;
	private int wid;
	
	
	public Rectangle (int len, int wid) {
		this.len = (len >= 0 && len <= 20) ? len : 10;
		this.wid = (wid >= 0 && wid <= 20) ? wid : 10;
	}
	public void setLen (int len) {
		this.len = len;
	}
	public void setWid (int wid) {
		this.wid = wid;
	}
	
	public int getLen () {
		return this.len;
	}
	public int getWid () {
		return this.wid;
	}
	
	public double getChuvi () {
		return 2*(this.len + this.wid);
	}
	public double getDuongcheo () {
		return Math.sqrt(this.len * this.len + this.wid * this.wid);
	}
	public int getDientich () {
		return this.len * this.wid;
	}
	
	public void InhinhRong () {
		for (int i = 0; i < this.len; i ++) {
			for (int j = 0; j < this.wid; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public boolean Hinhvuong () {
		return this.len == this.wid;
	}
	
	public void InhinhDac (char chidinh) {
		for (int i = 0; i < this.len; i ++) {
			for (int j = 0; j < this.wid; j ++) {
				System.out.print(chidinh);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài len: ");
        int len = scanner.nextInt();
        System.out.println("Nhập chiều rộng wid: ");
        int wid = scanner.nextInt();
        while (len < wid) {
        	System.out.println("Nhập sai! Vui lòng nhập lại!");
        	System.out.println("Nhập lại chiều dài len: ");
            len = scanner.nextInt();
            System.out.println("Nhập lại chiều rộng wid: ");
            wid = scanner.nextInt();
        }
        Rectangle rectangle = new Rectangle (len,wid); 
        System.out.println("Chu vi của hình là: " + rectangle.getChuvi());
        System.out.println("Đường chéo của hình là: " + rectangle.getDuongcheo());
        System.out.println("Diện tích của hình là: " + rectangle.getDientich());
        System.out.println("Hình chữ nhật rỗng: ");
        System.out.println();
        rectangle.InhinhRong();
        System.out.println("Hình chữ nhật này la hình vuông ?: " + rectangle.Hinhvuong());
        System.out.println("Nhập chữ chỉ định để tạo hình: ");
        char chidinh = scanner.next().charAt(0);
        System.out.println("Hình chữ nhật đặc:");
        System.out.println();
        rectangle.InhinhDac(chidinh);
	}
}