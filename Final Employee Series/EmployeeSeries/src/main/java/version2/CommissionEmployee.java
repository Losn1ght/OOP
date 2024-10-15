package version2;



public class CommissionEmployee extends Employee{
    private double totalSales;

    public CommissionEmployee() {

    }

    public CommissionEmployee(int empID) {
        super(empID);
    }

    public CommissionEmployee(String empName) {
        super(empName);
    }

    public CommissionEmployee(int empID, String empName) {
        super(empID, empName);
    }

    public CommissionEmployee(int empID, String empName, double totalSales) {
        super(empID, empName);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double computeSalary(){
        double rate;

        if(this.totalSales < 10000){
            rate = 0.05;
        }else if(this.totalSales >= 10000 && this.totalSales < 100000){
            rate = 0.10;
        }else if(this.totalSales < 1000000){
            rate = 0.20;
        }else{
            rate = 0.30;
        }


        return rate * totalSales;

    }


    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Employee ID: ").append(getEmpID()).append("\n");
        sb.append("Employee name: ").append(getEmpName()).append("\n");
        sb.append("Total sales: ").append(getTotalSales()).append("\n");
        sb.append("Salary: $").append(computeSalary()).append("\n");

        return sb.toString();
    }
}
