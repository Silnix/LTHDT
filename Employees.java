import java.util.Scanner;


public class Employees {
	private String lastName;
    private Date ngaySinh;
    private Date ngayLam;

    public Employees(String lastName, Date ngaySinh, Date ngayLam) {
        this.lastName = lastName;
        this.ngaySinh = ngaySinh;
        this.ngayLam = ngayLam;
    }

    public void Info() {
        System.out.println("Họ: " + lastName);
        System.out.println("Ngày sinh: " + ngaySinh.toString());
        System.out.println("Ngày vào làm: " + ngayLam.toString());
    }
    
    public class Date {
    	private int day;
    	private int month;
    	private int year;
    	
    	public Date (int day, int month, int year) {
    		this.day = day;
    		this.month = month;
    		this.year = year;
    	}

    	public int setDay (int day) {
    		this.day = day;
    	}
    	public int setMonth (int month) {
    		this.month = month;
    	}
    	public int setYear (int year) {
    		this.year = year;
    	}
    	
    	public int getDay () {
    		return this.day;
    	}
    	public int getMonth () {
    		return this.month;
    	}
    	public int getYear () {
    		return this.year;
    	}
    	
    	public String toString () {
    		return day + "/" + month + "/" + year;
    	}
    	
    	public boolean isLeapYear () {
    		return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0); 
    	}
    }
}


