package version2;



public class HourlyEmployee extends Employee{
    private float totalHoursWorked;
    private double ratePerHour;


    public HourlyEmployee() {
    }

    public HourlyEmployee(int empID, String empName) {
        super(empID, empName);
    }

    public HourlyEmployee(float totalHoursWorked, double ratePerHour) {
        this(0, "", totalHoursWorked,ratePerHour);
    }

    public HourlyEmployee(String empName, float totalHoursWorked) {
        super(empName);
        this.totalHoursWorked = totalHoursWorked;
    }

    public HourlyEmployee(int empID, String empName, float totalHoursWorked, double ratePerHour) {
        super(empID, empName);
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

        if(totalHoursWorked <= 40){
            salary = totalHoursWorked * ratePerHour;
        }else{
            salary += ratePerHour * 40;
            totalHoursWorked -= 40;
            salary += 1.5 * totalHoursWorked;
        }

        return salary;
    }

    public void displayHourlyEmployee() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee ID: ").append(getEmpID()).append("\n");
        sb.append("Employee name: ").append(getEmpName()).append("\n");
        sb.append("Total hours worked: ").append(getTotalHoursWorked()).append("\n");
        sb.append("Rate per hour: ").append(getRatePerHour()).append("\n");
        sb.append("Salary: $").append(computeSalary()).append("\n");

        return sb.toString();
    }
}
