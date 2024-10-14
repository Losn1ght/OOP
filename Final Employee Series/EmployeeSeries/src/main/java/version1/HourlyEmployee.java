package version1;

public class HourlyEmployee {
    public float totalHoursWorked;
    public double ratePerHour;
    public String empName;
    public int empID;

    public HourlyEmployee() {

    }

    public HourlyEmployee( String empName, int empID) {
        this.empName = empName;
        this.empID = empID;
    }

    public HourlyEmployee(float totalHoursworked, double ratePerHour, String empName, int empID) {
        this.totalHoursWorked = totalHoursworked;
        this.ratePerHour = ratePerHour;
        this.empName = empName;
        this.empID = empID;
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

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }




    public double copmuteSalary(){
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

        sb.append("Employee Name: ");
        sb.append(empName);
        sb.append("\n");
        sb.append("Employee ID: ");
        sb.append(empID);
        sb.append("\n");
        sb.append("Total Hours Worked: ");
        sb.append(totalHoursWorked);
        sb.append("\n");
        sb.append("Rate Per Hour: ");
        sb.append(ratePerHour);
        sb.append("\n");
        sb.append("Salary: ");
        sb.append(copmuteSalary());


        return sb.toString();
    }
}
