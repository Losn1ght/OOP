package version2;


import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        HourlyEmployee h1 = new HourlyEmployee();
        HourlyEmployee h2 = new HourlyEmployee(10,100);
        HourlyEmployee h3 = new HourlyEmployee(22102538,"Jedd",LocalDate.of(2003, 2,5), LocalDate.of(2024,5,2), 32,100);

        h1.setEmpName("Garb");
        h1.setEmpID(22102538);
        h1.setRatePerHour(100);
        h1.setTotalHoursWorked(10);
        h1.setEmpDateBirth(LocalDate.of(2003,2,5));
        h1.setEmpDateHired(LocalDate.of(2024,5,2));

        h2.setEmpID(2231532);
        h2.setEmpName("Christian");
        h2.setEmpDateBirth(LocalDate.of(2003,2,5));
        h2.setEmpDateHired(LocalDate.of(2024,5,2));

        System.out.println("----HOURLY EMPLOYEE----\n");
        h1.display();
        System.out.println(" ");
        h2.display();
        System.out.println(" ");
        h3.display();



//        PieceWorkerEmployee p1 = new PieceWorkerEmployee();
//        PieceWorkerEmployee p2 = new PieceWorkerEmployee(50,500);
//        PieceWorkerEmployee p3 = new PieceWorkerEmployee(22102539,"Christian", LocalDate.of(2001,4,2), LocalDate.of(2021,4,3), 50,500);
//
//        p1.setEmpName("Prince");
//        p1.setEmpID(22102541);
//        p1.setRatePerPiece(50);
//        p1.setTotalPiecesFinished(500);
//        p1.setEmpDateBirth(LocalDate.of(2002,5,26));
//        p1.setEmpDateHired(LocalDate.of(2021, 4,13));
//
//        p2.setEmpName("Charles");
//        p2.setEmpID(22102521);
//        p2.setEmpDateBirth(LocalDate.of(2002,5,26));
//        p2.setEmpDateHired(LocalDate.of(2021, 4,30));
//
//
//        System.out.println("\n----PIECE WORKER EMPLOYEE----\n");
//        p1.display();
//        System.out.println(" ");
//        p2.display();
//        System.out.println(" ");
//        p3.display();



//        BasedPlusCommissionEmployee b1 = new BasedPlusCommissionEmployee();
//        BasedPlusCommissionEmployee b2 = new BasedPlusCommissionEmployee(200,1000);
//        BasedPlusCommissionEmployee b3 = new BasedPlusCommissionEmployee(22102540,"Jan", LocalDate.of(2002,7,21), LocalDate.of(2022,10,24), 1000,200);
//
//        b1.setEmpName("Jack");
//        b1.setEmpID(221025348);
//        b1.setTotalSales(1000);
//        b1.setBaseSalary(200);
//        b1.setEmpDateBirth(LocalDate.of(2002,5,19));
//        b1.setEmpDateHired(LocalDate.of(2022,8,22));
//
//        b2.setEmpID(221025349);
//        b2.setEmpName("Sparrow");
//        b2.setEmpDateBirth(LocalDate.of(2002,6,20));
//        b2.setEmpDateHired(LocalDate.of(2022,9,23));
//
//
//        System.out.println("\n----BASED PLUS COMMISSION EMPLOYEE----\n");
//        b1.display();
//        System.out.println(" ");
//        b2.display();
//        System.out.println(" ");
//        b3.display();

//        CommissionEmployee c1 = new CommissionEmployee();
//        CommissionEmployee c2 = new CommissionEmployee(1000);
//        CommissionEmployee c3 = new CommissionEmployee(22102541,"Carlo", LocalDate.of(2004,11,19), LocalDate.of(2020,8,28), 1000);
//
//        c1.setEmpName("Ken");
//        c1.setEmpID(9589674);
//        c1.setTotalSales(1000);
//
//        System.out.println("\n----COMMISSION EMPLOYEE----\n");
//        c1.display();
//        c2.display();
//        c3.display();




//        System.out.println("EMPLOYEE TEST\n\n");
//        Employee testemp1 = new Employee();
//
//        testemp1.setEmpID(22102538);
//        testemp1.setEmpName("Garb");
//        testemp1.setEmpDateBirth(LocalDate.of(2003, 6, 25));
//        testemp1.setEmpDateHired(LocalDate.of(2023, 12,4));
//
//
//        Employee testemp2 = new Employee(22102539, "Hiroshi", LocalDate.of(2003, 10,17), LocalDate.of(2022, 7,  16));
//
//
//        System.out.println("Employee #1");
//        testemp1.display();
//        System.out.println(" ");
//
//        System.out.println("Employee #2");
//        testemp2.display();


    }
}