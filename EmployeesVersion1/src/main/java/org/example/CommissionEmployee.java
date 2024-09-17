package org.example;

public class CommissionEmployee {
    public double totalSales;
    public String empName;
    public int empID;


    public CommissionEmployee(double totalSales, String empName, int empID) {
        this.empName = empName;
        this.totalSales = totalSales;
        this.empID = empID;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double computeSalary(){
        double salary = 0;

        if(this.totalSales < 10000){
            salary = 0.05 * totalSales;
        }else if(this.totalSales >= 10000 && this.totalSales < 100000){
            salary = 0.10 * totalSales;
        }else if(this.totalSales < 1000000){
            salary = 0.20 * totalSales;
        }else{
            salary = 0.30 * totalSales;
        }


        return salary;

    }



    public void displayHourlyEmployee() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Employee Name: ");
        sb.append(empName);
        sb.append("\n");
        sb.append("Employee ID: ");
        sb.append(empID);
        sb.append("\n");
        sb.append("Total Sales:");
        sb.append(totalSales);
        sb.append("\n");
        sb.append("Salary: ");
        sb.append(computeSalary());


        return sb.toString();
    }
}
