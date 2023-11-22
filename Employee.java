abstract class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }
    public Employee() {
        this.firstName = "unknown";
        this.lastName = "unknown";
        this.socialSecurityNumber = "unknown";
    }
    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    private void setLastName(String lastName) {
        this.lastName = lastName;
    }
    private void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
    private String getFirstName() {
        return this.firstName;
    }
    private String getLastName() {
        return this.lastName;
    }
    private String getSocialSecurityNumber() {
        return  this.socialSecurityNumber;
    }
    public abstract double earnings();
    public void print() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("SSN: " + socialSecurityNumber);
    }
}
