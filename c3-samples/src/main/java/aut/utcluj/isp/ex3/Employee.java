package aut.utcluj.isp.ex3;

import java.util.Objects;

/**
 * @author stefan
 */
public class Employee {
    private String firstName;
    private String lastName;
    private Double salary;
    private String cnp;

    public Employee() {
    }

    public Employee(String firstName, String lastName, Double salary, String cnp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.cnp = cnp;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public String getCnp() {
        return cnp;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getFirstName(), employee.getFirstName()) &&
                Objects.equals(getLastName(), employee.getLastName()) &&
                Objects.equals(getSalary(), employee.getSalary()) &&
                Objects.equals(getCnp(), employee.getCnp());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFirstName(), getLastName(), getSalary(), getCnp());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", cnp='" + cnp + '\'' +
                '}';
    }
}
