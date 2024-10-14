package version3;

public class PieceWorkerEmployee {

    public int totalPiecesFinished;
    public double ratePerPiece;
    public String empName;
    public int empID;

    public PieceWorkerEmployee(){

    }

    public PieceWorkerEmployee(String empName, int empID){
        this.empName = empName;
        this.empID = empID;
    }

    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece, String empName, int empID) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
        this.empName = empName;
        this.empID = empID;
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

        sb.append("Employee Name: ");
        sb.append(empName);
        sb.append("\n");
        sb.append("Employee ID: ");
        sb.append(empID);
        sb.append("\n");
        sb.append("Total Pieces Finished: ");
        sb.append(totalPiecesFinished);
        sb.append("\n");
        sb.append("Rate per Pieces: ");
        sb.append(ratePerPiece);
        sb.append("\n");
        sb.append("Salary: ");
        sb.append(computeSalary());


        return sb.toString();
    }
}
