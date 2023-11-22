public class CommissionEmployee extends Employee {
    private double grossSales;
    private double commissionRate;
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate) {
        super(firstName,lastName,socialSecurityNumber);
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }
    public CommissionEmployee() {
        super();
        this.grossSales = 0;
        this.commissionRate = 0;
    }
    public double getGrossSales() {
        return grossSales;
    }
    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
    public double getCommissionRate() {
        return commissionRate;
    }
    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }
    @Override
    public double earnings() {
        return grossSales * commissionRate;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Type: Commission Employee");
        System.out.println("Gross Sales: $" + grossSales);
        System.out.println("Commission Rate: " + commissionRate);
    }
}
