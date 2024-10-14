package version3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Employee {
    private int empID;
    private String empName;
    private LocalDate empDateBirth;
    private LocalDate empDateHired;

    public Employee(){

    }

    public Employee(int empID,  String empName, LocalDate empDateBirth, LocalDate empDateHired ){
        this.empID = empID;
        this.empName = empName;
        this.empDateBirth = empDateBirth;
        this.empDateHired = empDateHired;
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

    public LocalDate getEmpDateBirth() {
        return empDateBirth;
    }

    public void setEmpDateBirth(LocalDate empDateBirth) {
        this.empDateBirth = empDateBirth;
    }

    public LocalDate getEmpDateHired() {
        return empDateHired;
    }

    public void setEmpDateHired(LocalDate empDateHired) {
        this.empDateHired = empDateHired;
    }

    public void display(){
        System.out.println(this);
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        sb.append("Employee Name: ");
        sb.append(empName);
        sb.append("\nEmployee ID: ");
        sb.append(empID);
        sb.append("\nBirth Date: ");
        sb.append(empDateBirth.format(df));
        sb.append("\nDate Hired: ");
        sb.append(empDateHired.format(df));

        return sb.toString();
    }
}
