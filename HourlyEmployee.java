public class HourlyEmployee extends Employee {
    private double wage;
    private double hours;
    public HourlyEmployee (String firstName, String lastName, String socialSecurityNumber, double wage, double hours) {
        super(firstName,lastName,socialSecurityNumber);
        this.wage = wage;
        this.hours = hours;
    }
    public HourlyEmployee() {
        super();
        this.wage = 0;
        this.hours = 0;
    }
    public double getWage() {
        return wage;
    }
    public double getHours() {
        return hours;
    }
    public void setWage(double wage) {
        this.wage = wage;
    }
    public void setHours(double hours) {
        this.hours = hours;
    }
    @Override
    public double earnings() {
        if (hours <= 40) {
            return wage * hours;
        } else {
        return wage * 40 + (hours - 40) * 1.5 * wage;
        }
    }
    @Override
    public void print() {
        super.print();
        System.out.println("Type: Hourly Employee");
        System.out.println("Hourly Wage: $" + wage);
        System.out.println("Hours Worked: " + hours);
    }
}
