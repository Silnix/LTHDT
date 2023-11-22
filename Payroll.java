import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng nhân viên: ");
        int n = scanner.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho Nhân viên " + (i + 1) + ":");
            System.out.print("Họ: ");
            String firstName = scanner.next();

            System.out.print("Tên: ");
            String lastName = scanner.next();

            System.out.print("Số Bảo hiểm xã hội: ");
            String socialSecurityNumber = scanner.next();

            System.out.print("Loại Nhân viên (0 - Salaried, 1 - Hourly, 2 - Commission, 3 - BasePlusCommission): ");
            int m = scanner.nextInt();

            if (m == 0) {
                System.out.print("Lương hàng tuần: $");
                double weeklySalary = scanner.nextDouble();
                employees[i] = new SalariedEmployee(firstName, lastName, socialSecurityNumber, weeklySalary);
            } else if (m == 1) {
                System.out.print("Lương theo giờ: $");
                double wage = scanner.nextDouble();

                System.out.print("Số giờ làm việc: ");
                double hours = scanner.nextDouble();

                employees[i] = new HourlyEmployee(firstName, lastName, socialSecurityNumber, wage, hours);
            } else if (m == 2) {
                System.out.print("Doanh số bán được: $");
                double grossSales = scanner.nextDouble();

                System.out.print("Tỉ lệ hoa hồng: ");
                double commissionRate = scanner.nextDouble();

                employees[i] = new CommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
            } else if (m == 3) {
                System.out.print("Doanh số bán được: $");
                double grossSales = scanner.nextDouble();

                System.out.print("Tỉ lệ hoa hồng: ");
                double commissionRate = scanner.nextDouble();

                System.out.print("Lương cơ bản: $");
                double baseSalary = scanner.nextDouble();

                employees[i] = new BasePlusCommissionEmployee(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, baseSalary);
            }
        }

        System.out.println("\nThông tin Nhân viên và Lương:");
        for (Employee employee : employees) {
            System.out.println("------------------------------");
            employee.print();
            System.out.println("Lương: $" + employee.earnings());
        }
    }
}