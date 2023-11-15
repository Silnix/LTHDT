import java.util.Scanner;


public class Circle {
	public double bankinh;
	
	public Circle (double bankinh) {
		this.bankinh = bankinh;
	}
	
	public Circle () {
		this.bankinh = 0;
	}
	public void setBankinh (double bankinh) {
		this.bankinh = bankinh;
	}

	public double getBankinh () {
		return this.bankinh;
	}

	public double getChuvi () {
		return Math.PI * (2 * this.bankinh);
	}
	
	public double getDientich () {
		return Math.PI * (this.bankinh * this.bankinh);
	}
	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính của hình tròn: ");
        double bankinh  = scanner.nextDouble();
        while (bankinh <= 0) {
        	System.out.println("Nhập sai! Vui lòng nhập lại!");
        	System.out.println("Nhập lại bán kính của hình tròn: ");
            bankinh = scanner.nextDouble();
        }
        Circle circle = new Circle (bankinh); 
        System.out.println("Chu vi của hình tròn là: " + circle.getChuvi());
        System.out.println("Diện tích của hình tròn là: " + circle.getDientich());
	}
}
