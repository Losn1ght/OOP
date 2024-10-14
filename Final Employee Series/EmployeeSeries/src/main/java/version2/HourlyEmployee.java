package version2;

import java.time.LocalDate;

public class HourlyEmployee extends Employee{
    private float totalHoursWorked;
    private double ratePerHour;


    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour) {
        super();
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public HourlyEmployee(int empID, String empName, LocalDate empDateHired, LocalDate empBirthDate, float totalHoursWorked, float ratePerHour) {
        super(empID, empName, empBirthDate, empDateHired);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public double computeSalary(){
        double salary = 0;

        if(this.totalHoursWorked <= 40){
            salary = this.totalHoursWorked * this.ratePerHour;
        }else if(this.totalHoursWorked > 40){
            double regularPay = 40 * this.ratePerHour;
            double overtimeRate = this.ratePerHour * 1.5;
            double excessTime = this.totalHoursWorked - 40;
            double overtimePay = overtimeRate * excessTime;

            salary = regularPay + overtimePay;
        }


        return salary;
    }

    public void display(){
        System.out.println(this);
    }




    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

         sb.append(super.toString()).append("\n");
         sb.append("Total Hours Worked: ").append(getTotalHoursWorked()).append("\n");
         sb.append("Rate Per Hour: ").append(getRatePerHour()).append("\n");
         sb.append("Salary: $").append(computeSalary()).append("\n");


        return sb.toString();
    }
}
