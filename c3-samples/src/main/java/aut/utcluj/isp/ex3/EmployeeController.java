package aut.utcluj.isp.ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author stefan
 */
public class EmployeeController {
    //private List<Employee> employeeList;
    private List<Employee> employees = new ArrayList<Employee>();

    public EmployeeController() {

    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    /**
     * Add new employee to the list of employees
     *
     * @param employee - employee information
     */
    public void addEmployee(final Employee employee) {
        if (employee != null) {
            employees.add(employee);
        }
        //throw new UnsupportedOperationException("Not supported yet.");

    }

    /**
     * Get employee by cnp
     *
     * @param cnp - unique cnp
     * @return found employee or null if not found
     */
    public Employee getEmployeeByCnp(final String cnp) {
        // throw new UnsupportedOperationException("Not supported yet.");
        for (Employee employee : employees) {
            if (employee.getCnp().equals(cnp)) {
                return employee;
            }
        }

        return null;
    }

    /**
     * Update employee salary by cnp
     *
     * @param cnp    - unique cnp
     * @param salary - salary
     * @return updated employee
     */
    public Employee updateEmployeeSalaryByCnp(final String cnp, final Double salary) {
        //throw new UnsupportedOperationException("Not supported yet.");
        for (Employee employee : employees) {
            if (employee.getCnp().equals(cnp)) {
                employee.setSalary(salary);
                return employee;
            }
        }

        return null;
    }

    /**
     * Delete employee by cnp
     *
     * @param cnp - unique cnp
     * @return deleted employee or null if not found
     */
    public Employee deleteEmployeeByCnp(final String cnp) {
        //throw new UnsupportedOperationException("Not supported yet.");
        for (Employee employee : employees) {
            if (employee.getCnp().equals(cnp)) {
                employees.remove(employee);
                return employee;
            }
        }

        return null;
    }

    /**
     * Return current list of employees
     *
     * @return current list of employees
     */
    public List<Employee> getEmployees() {
        //throw new UnsupportedOperationException("Not supported yet.");
        return employees;
    }

    /**
     * Get number of employees
     *
     * @return - number of registered employees
     */
    public int getNumberOfEmployees() {
        // throw new UnsupportedOperationException("Not supported yet.");
        int numberOfEmployees = 0;
        for (Employee employee : employees) {
            numberOfEmployees++;
        }
        return numberOfEmployees;
    }
}
