//(Accounts Payable System Modification) It’s possible to include the functionality of the pay-
//roll application (Figs. 10.4–10.9) in the accounts payable application without modifying Employee
//subclasses SalariedEmployee, HourlyEmployee, CommissionEmployee or BasePlusCommission-
//Employee. To do so, you can modify class Employee (Fig. 10.4) to implement interface Payable and
//declare method getPaymentAmount to invoke method earnings. Method getPaymentAmount would
//then be inherited by the subclasses in the Employee hierarchy. When getPaymentAmount is called for
//a particular subclass object, it polymorphically invokes the appropriate earnings method for that
//subclass. Reimplement Exercise 10.15 using the original Employee hierarchy from the payroll appli-
//cation of Figs. 10.4–10.9. Modify class Employee as described in this exercise, and do not modify any
//of class Employee’s subclasses.

package JavaHowToProgram.Chapter10;

public class Salaried extends EmployeeImplementsPayable {

    private double weeklySalary;

    public Salaried(String firstName, String lastName, String socialSecurityNumber, double weeklySalary)
    {
        super(firstName, lastName, socialSecurityNumber);
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");
        this.weeklySalary = weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary)
    {
        if (weeklySalary < 0.0)
            throw new IllegalArgumentException(
                    "Weekly salary must be >= 0.0");
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary()
    {
        return weeklySalary;
    }

    public double earnings()
    {
        return getWeeklySalary();
    }

    @Override
    public String toString()
    {
        return String.format("salaried employee: %s%n%s: $%,.2f", super.toString(), "weekly salary", getWeeklySalary());
    }


}


