public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;
    public BasePlusCommissionEmployee (String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary) {
        super(firstName,lastName,socialSecurityNumber,grossSales,commissionRate);
        this.baseSalary = baseSalary;
    }
    public  BasePlusCommissionEmployee () {
        this.baseSalary = 0;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    @Override
    public double earnings() {
        return super.earnings() + baseSalary;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Type: Base Plus Commission Employee");
        System.out.println("Base Salary: $" + baseSalary);
    }
}