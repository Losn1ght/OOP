package version2;

import java.time.LocalDate;

public class BasedPlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasedPlusCommissionEmployee() {
        super();
    }

    public BasedPlusCommissionEmployee(double baseSalary, double totalSales) {
        super(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(int empID, String empName, LocalDate empBirthDate, LocalDate empDateHired, double totalSales, double baseSalary) {
        super(empID, empName, empBirthDate, empDateHired, totalSales);
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

        sb.append(super.toString()).append("\n");
        sb.append("Base Salary: $").append(getBaseSalary()).append("\n");
        sb.append("Salary: $").append(computeSalary()).append("\n");


        return sb.toString();
    }
}
