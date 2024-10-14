package version3;


public class BasedPlusCommissionEmployee extends CommissionEmployee {

    public double baseSalary;

    public BasedPlusCommissionEmployee() {
        super();
    }

    public BasedPlusCommissionEmployee(String empName, int empID) {
        super(empName, empID);
    }

    public BasedPlusCommissionEmployee(double totalSales, double baseSalary, String empName, int empID) {
        super(totalSales, empName, empID);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }


    @Override
    public double computeSalary() {
        return super.computeSalary() + baseSalary;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append("\nBase Salary: $");
        sb.append(getBaseSalary());
        sb.append("\nSalary: $");
        sb.append(computeSalary());
        return sb.toString();
    }
}
