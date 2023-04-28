package pl.com.slupsk.ap.company;

import java.time.LocalDate;
import java.time.Month;
import java.util.Objects;

public class Employee {

    private final String id;
    //            = "1";
    private final LocalDate dateOfBirth;
    //            = LocalDate.of(2023, Month.APRIL, 25);
    private String firstName;
    private String lastName;

    protected Employee(String id, LocalDate dateOfBirth,
                       String name, String surname) {
        this.id = id;
        this.dateOfBirth = dateOfBirth;
        this.firstName = name;
        this.lastName = surname;
    }

    public String getId() {
        return id;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    protected void process() {
        System.out.println("id = " + id
                + ", dateOfBirth = " + dateOfBirth
                + ", firstName = " + firstName
                + ", lastName = " + lastName);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        if (!Objects.equals(id, employee.id)) return false;
//        if (!Objects.equals(dateOfBirth, employee.dateOfBirth))
//            return false;
        if (!Objects.equals(firstName, employee.firstName)) return false;
        return Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }
}
