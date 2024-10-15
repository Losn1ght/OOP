package version1;


public class Main {

    public static void main(String[] args) {

         HourlyEmployee h1 = new HourlyEmployee();
         HourlyEmployee h2 = new HourlyEmployee("Gab", 1);
         HourlyEmployee h3 = new HourlyEmployee(42, 100, "Garb", 2);

         h1.setEmpName("Gab");
         h1.setEmpID(12);
         h1.setRatePerHour(100);
         h1.setTotalHoursWorked(100);

         h2.setTotalHoursWorked(200);
         h2.setRatePerHour(100);

         h1.display();
         h2.display();
         h3.display();

         PieceWorkerEmployee p1 = new PieceWorkerEmployee();
         PieceWorkerEmployee p2 = new PieceWorkerEmployee("Hiroshima", 3);
         PieceWorkerEmployee p3 = new PieceWorkerEmployee(200, 100, "Hiroshi", 4);

         p1.setEmpID(234);
         p1.setEmpName("Marc");
         p1.setRatePerPiece(100);
         p1.setTotalPiecesFinished(200);

         p2.setRatePerPiece(200);
         p2.setTotalPiecesFinished(500);

         p1.displayHourlyEmployee();
         p2.displayHourlyEmployee();
         p3.displayHourlyEmployee();


         CommissionEmployee c1 = new CommissionEmployee();
         CommissionEmployee c2 = new CommissionEmployee("Christian", 5);
         CommissionEmployee c3 = new CommissionEmployee(2000000, "En", 6);

         c1.setEmpID(21);
         c1.setEmpName("Darlene");
         c1.setTotalSales(1000);

         c2.setTotalSales(10000);

         c1.displayHourlyEmployee();
         c2.displayHourlyEmployee();
         c3.displayHourlyEmployee();

         BasedPlusCommissionEmployee b1 = new BasedPlusCommissionEmployee();
         BasedPlusCommissionEmployee b2 = new BasedPlusCommissionEmployee("Newt", 7);
         BasedPlusCommissionEmployee b3 = new BasedPlusCommissionEmployee(10000, 500, "Newton", 8);

         b1.setEmpID(934);
         b1.setEmpName("Jeff");
         b1.setBaseSalary(200);
         b1.setTotalSales(20000);

         b2.setTotalSales(100000);
         b2.setBaseSalary(500);

         b1.displayHourlyEmployee();
         b2.displayHourlyEmployee();
         b3.displayHourlyEmployee();

    }
}