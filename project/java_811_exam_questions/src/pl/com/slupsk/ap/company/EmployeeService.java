package pl.com.slupsk.ap.company;

import pl.com.slupsk.ap.company.Employee;
import pl.com.slupsk.ap.company.manager.Manager;

import java.time.LocalDate;
import java.time.Month;

public class EmployeeService {

    public void addNewEmployee() {
        Employee employee = new Employee(
                "1",
                LocalDate.of(2023, Month.APRIL, 25),
                "Jan", "Nowak");
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee(
                "1",
                LocalDate.of(2023, Month.APRIL, 25),
                "Jan", "Nowak");
        Employee employee2 = new Employee(
                "1",
                LocalDate.of(2023, Month.MARCH, 25),
                "Jan", "Nowak");

        System.out.println(employee1.equals(employee2));
        System.out.println(employee1.hashCode());
        System.out.println(employee2.hashCode());
//        Employee employee2 = new Employee(
//                "2",
//                LocalDate.of(2021, Month.DECEMBER, 13),
//                "Marcin", "Kowalczyk");



//        Manager manager = new Manager(99, "3",
//
//                LocalDate.of(2019, 2, 15),
//                "Kazimierz", "Pierwszy");
////        System.out.println(employee);
//        processEmployees(employee1, employee2, manager);
    }

    private static void processEmployees(Employee... employees) {
        for (Employee employee : employees) {
            employee.process();
        }
    }
}
