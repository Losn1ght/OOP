package version2;


public class BasedPlusCommissionEmployee extends CommissionEmployee {

    private double baseSalary;

    public BasedPlusCommissionEmployee() {

    }

    public BasedPlusCommissionEmployee(double totalSales, double baseSalary) {
        super();
        this.setTotalSales(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(int empID, String empName) {
        super(empID, empName);
    }

    public BasedPlusCommissionEmployee(String empName, int empID, double baseSalary, double totalSales) {
        super(empID,empName);
        this.setTotalSales(totalSales);
        this.baseSalary = baseSalary;
    }

    public BasedPlusCommissionEmployee(int empID, String empName, double totalSales, double baseSalary) {
        super(empID, empName, totalSales);
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

    public void displayHourlyEmployee() {
        System.out.println(this);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee ID: ").append(getEmpID()).append("\n");
        sb.append("Employee name: ").append(getEmpName()).append("\n");
        sb.append("Base salary: ").append(getBaseSalary()).append("\n");
        sb.append("Total sales: ").append(getTotalSales()).append("\n");
        sb.append("Salary: $").append(computeSalary()).append("\n");


        return sb.toString();
    }
}
