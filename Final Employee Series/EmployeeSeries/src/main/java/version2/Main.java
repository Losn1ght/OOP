package version2;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        Employee emp2 = new Employee(321);
        Employee emp3 = new Employee("Jane Smith");
        Employee emp4 = new Employee(987, "Garb");
        Employee emp5 = new Employee("Christian", 654);


        emp1.setEmpID(3623);
        emp1.setEmpName("Diego");
        emp2.setEmpName("Ian");
        emp3.setEmpID(947);

       emp1.displayEmployee();
       emp2.displayEmployee();
       emp3.displayEmployee();
       emp4.displayEmployee();
       emp5.displayEmployee();

       HourlyEmployee h1 = new HourlyEmployee();
       HourlyEmployee h2 = new HourlyEmployee(853,"Hiroshi");
       HourlyEmployee h3 = new HourlyEmployee(100,500);
       HourlyEmployee h4 = new HourlyEmployee("Ishi", 100);
       HourlyEmployee h5 = new HourlyEmployee(248, "Nathan", 100, 500);

       h1.setEmpName("Jedd");
       h1.setEmpID(593);
       h1.setTotalHoursWorked(100);
       h1.setRatePerHour(500);

       h2.setTotalHoursWorked(100);
       h2.setRatePerHour(500);

       h3.setEmpID(957);
       h3.setEmpName("Curims");

       h4.setEmpID(732);
       h4.setRatePerHour(500);

       h1.displayHourlyEmployee();
       h2.displayHourlyEmployee();
       h3.displayHourlyEmployee();
       h4.displayHourlyEmployee();
       h5.displayHourlyEmployee();

        PieceWorkerEmployee p1 = new PieceWorkerEmployee();
        PieceWorkerEmployee p2 = new PieceWorkerEmployee(502,"Jan");
        PieceWorkerEmployee p3 = new PieceWorkerEmployee("Christian", 205);
        PieceWorkerEmployee p4 = new PieceWorkerEmployee(500,200);
        PieceWorkerEmployee p5 = new PieceWorkerEmployee(498,"Christian",200,500);

        p1.setEmpName("Marc");
        p1.setEmpID(823);
        p1.setTotalPiecesFinished(200);
        p1.setRatePerPiece(500);

        p2.setRatePerPiece(500);
        p2.setTotalPiecesFinished(200);

        p3.setRatePerPiece(500);
        p3.setTotalPiecesFinished(200);

        p4.setEmpID(872);
        p4.setEmpName("Ivan");

        p1.displayHourlyEmployee();
        p2.displayHourlyEmployee();
        p3.displayHourlyEmployee();
        p4.displayHourlyEmployee();
        p5.displayHourlyEmployee();

        CommissionEmployee c1 = new CommissionEmployee();
        CommissionEmployee c2 = new CommissionEmployee(349);
        CommissionEmployee c3 = new CommissionEmployee("Pan");
        CommissionEmployee c4 = new CommissionEmployee(389,"Carlo");
        CommissionEmployee c5 = new CommissionEmployee(923,"Jake",500);

        c1.setEmpID(921);
        c1.setEmpName("Patrick");
        c1.setTotalSales(500);

        c2.setEmpName("Liza");
        c2.setTotalSales(500);

        c3.setEmpID(538);
        c3.setTotalSales(500);

        c4.setTotalSales(500);

        c1.display();
        c2.display();
        c3.display();
        c4.display();
        c5.display();

        BasedPlusCommissionEmployee b1 = new BasedPlusCommissionEmployee();
        BasedPlusCommissionEmployee b2 = new BasedPlusCommissionEmployee(814,"Kyle");
        BasedPlusCommissionEmployee b3 = new BasedPlusCommissionEmployee(20000,1000);
        BasedPlusCommissionEmployee b4 = new BasedPlusCommissionEmployee("Khalid", 305,500,20000);
        BasedPlusCommissionEmployee b5 = new BasedPlusCommissionEmployee(953,"John",9000,500);

        b1.setEmpName("Nighthound");
        b1.setEmpID(212);
        b1.setBaseSalary(500);
        b1.setTotalSales(9999);

        b2.setBaseSalary(500);
        b2.setTotalSales(10000);

        b3.setEmpID(305);
        b3.setEmpName("Kendrick");

        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();


    }
}
