package version2;

import java.time.LocalDate;

public class CommissionEmployee extends Employee{
    private double totalSales;


    public CommissionEmployee() {
        super();
    }

    public CommissionEmployee(double totalSales) {
        super();
        this.totalSales = totalSales;
    }

    public CommissionEmployee(int empID, String empName, LocalDate empBirthDate, LocalDate empDateHired, double totalSales) {
        super(empID, empName, empBirthDate, empDateHired);
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

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString()).append("\n");
        sb.append("Total Sales: ").append(getTotalSales());




        return sb.toString();
    }
}
