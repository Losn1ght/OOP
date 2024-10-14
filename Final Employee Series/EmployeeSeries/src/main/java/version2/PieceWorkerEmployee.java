package version2;

import java.time.LocalDate;

public class PieceWorkerEmployee extends Employee{

    private int totalPiecesFinished;
    private double ratePerPiece;


    public PieceWorkerEmployee(){
        super();
    }

    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece){
        super();
       this.totalPiecesFinished = totalPiecesFinished;
       this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empId, String empName, LocalDate empDateHired,LocalDate empBirthDate, int totalPiecesFinished, double ratePerPiece) {
        super(empId, empName, empBirthDate, empDateHired);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public double getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }



    public double computeSalary() {
        double salary = 0;

        if (this.totalPiecesFinished <= 100) {
            salary = this.totalPiecesFinished * this.ratePerPiece;
        } else {
            salary = this.totalPiecesFinished * this.ratePerPiece;
            int hundredPieces = this.totalPiecesFinished / 100;
            double bonus = hundredPieces * 10 * this.ratePerPiece;
            salary += bonus;
        }

        return salary;
    }


    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString()).append("\n");
        sb.append("Total Pieces Finished: ").append(getTotalPiecesFinished()).append("\n");
        sb.append("Rate Per Pieces: ").append(getRatePerPiece()).append("\n");
        sb.append("Salary: $").append(computeSalary());


        return sb.toString();
    }
}
