public class SalariedEmployee extends Employee {
    private double weeklySalary;
    public SalariedEmployee (String firstName, String lastName, String socialSecurityNumber  , double weeklySalary) {
        super(firstName,lastName,socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }
    public SalariedEmployee () {
        super();
        this.weeklySalary = 0;
    }
    public double getWeeklySalary() {
        return weeklySalary;
    }
    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
    @Override
    public double earnings() {
        return weeklySalary;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Type: Salaried Employee");
        System.out.println("Weekly Salary: $ " + weeklySalary);
    }
}
