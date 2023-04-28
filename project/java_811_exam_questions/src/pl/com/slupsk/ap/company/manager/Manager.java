package pl.com.slupsk.ap.company.manager;

import pl.com.slupsk.ap.company.Employee;

import java.time.LocalDate;

public class Manager extends Employee {

    private final Integer managerId;

    public Manager(Integer mngrId, String id, LocalDate dateOfBirth,
                   String name, String surname) {
        super(id, dateOfBirth, name, surname);
        this.managerId = mngrId;
    }

    @Override
    protected void process() {
        System.out.println("id = " + getId()
                + ", dateOfBirth = " + getDateOfBirth()
                + ", firstName = " + getFirstName()
                + ", lastName = " + getLastName()
                + ", managerId = " + managerId);
    }
}
