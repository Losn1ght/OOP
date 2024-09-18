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
         h1.display();




         PieceWorkerEmployee p1 = new PieceWorkerEmployee();
         PieceWorkerEmployee p2 = new PieceWorkerEmployee("Hiroshima", 3);
         PieceWorkerEmployee p3 = new PieceWorkerEmployee(200, 100, "Hiroshi", 4);

         CommissionEmployee c1 = new CommissionEmployee();
         CommissionEmployee c2 = new CommissionEmployee("Christian", 5);
         CommissionEmployee c3 = new CommissionEmployee(2000000, "En", 6);

         BasedPlusCommissionEmployee b1 = new BasedPlusCommissionEmployee();
         BasedPlusCommissionEmployee b2 = new BasedPlusCommissionEmployee("Newt", 7);
         BasedPlusCommissionEmployee b3 = new BasedPlusCommissionEmployee(10000, 500, "Newton", 8);






    }
}