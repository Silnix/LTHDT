import java.util.Scanner;


public class Ptbac2II {
	private double a;
	private double b;
	private double c;
	
	public Ptbac2II (double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Ptbac2II () {
		this.a = 0;
		this.b = 0;
		this.c = 0;
	}
	
	public void setA (double a) {
		this.a = a;
	}
	public void setB (double b) {
		this.b = b;
	}
	public void setC (double c) {
		this.c = c;
	}
	
	public double getA () {
		return this.a;
	}
	public double getB () {
		return this.b;
	}
	public double getC () {
		return this.c;
	}
	
	public double getDelta () {
		return b * b - 4 * a * c;
	}
	
	public void Tinhnghiem () {
		if (a !=  0) {
			double delta = getDelta();
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có 2 nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2);
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm kép: x = " + x);
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else if (b != 0) {
        	double x0 = -c / b;
        	System.out.println("Phương trình có nghiệm duy nhất là: x0 = " + x0);
        }
	}
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tham số a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập tham số b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập tham số c: ");
        double c = scanner.nextDouble();
        Ptbac2II ptbac2 = new Ptbac2II (a,b,c);
        if (a == 0) {
        	if (b != 0) {
        		System.out.println("Phương trính có dạng bậc I: bx + c = 0");
            	System.out.println("Sau khi giải phương trình trên,ta có: ");
            	ptbac2.Tinhnghiem();
        	} else {
        		System.out.println("Phương trính có dạng c = 0");
        		if (c == 0) {
        			System.out.println("Phương trính có nghiệm duy nhất x0 = 0");
        		} else {
        			System.out.println("Phương trính vô nghiệm");
        		}
        	}	
        } else {
        	System.out.println("Phương trính có dạng bậc II: ax^2 + bx + c = 0");
        	System.out.println("Ta có Delta =  " + ptbac2.getDelta()); 
            System.out.println("Sau khi giải phương trình trên,ta có: ");
            ptbac2.Tinhnghiem();
        }    
	}
}
