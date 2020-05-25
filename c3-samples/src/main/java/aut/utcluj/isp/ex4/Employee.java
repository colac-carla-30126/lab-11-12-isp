package aut.utcluj.isp.ex4;



import java.util.ArrayList;

/**
 * @author stefan
 */
public class Employee implements  IdentityManager{
    private String firstName;
    private String lastName;
    private String cnp;
    private SalaryInfo employeeSalaryInfo;

    public Employee(String firstName, String lastName, String cnp, Double monthlyRevenue)  {
        //throw new UnsupportedOperationException("Not supported yet.");
        this.firstName=firstName;
        this.lastName=lastName;
        this.cnp=cnp;
        try {
            this.employeeSalaryInfo= new SalaryInfo(monthlyRevenue);
        } catch (NegativeAmountException e) {
            e.printStackTrace();
        }

    }

  /*  public List<SalaryInfo> getEmployeeSalaryInfo() {
        return employeeSalaryInfo;
    }*/

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCnp() {
        return cnp;
    }

    @Override
    public String getIdentity() {
        return this.firstName+"_"+this.lastName+"_"+this.cnp;
    }

    /**
     * Add salary to the employee
     */
    public void addSalary() {
      /*if(getEmployeeSalaryInfo()== null){
          this.employeeSalaryInfo= new ArrayList<>();
      }*/
        this.employeeSalaryInfo.addSalary();
        // throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Add money as bonus to the employee
     * Value added should be positive
     *
     * @param money - money to be added
     */
    public void addMoney(final Double money) {
        try {
            this.employeeSalaryInfo.addMoney(money);
        } catch (NegativeAmountException e) {
            e.printStackTrace();
        }
        // throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Pay tax from salary
     *
     * @param tax - tax to be paid
     */
    public void payTax(final Double tax) {
        try {
            this.employeeSalaryInfo.payTax(tax);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Get salary info
     *
     * @return salary info
     */
    public SalaryInfo getSalaryInfo() {
        return this.employeeSalaryInfo;
        //throw new UnsupportedOperationException("Not supported yet.");
    }
}