package aut.utcluj.isp.ex4;


public class SalaryInfo {
    private Double totalRevenue;
    private Double monthlyRevenue;

    public SalaryInfo(Double totalRevenue, Double monthlyRevenue) {
        this.totalRevenue = totalRevenue;
        this.monthlyRevenue = monthlyRevenue;
    }

    /**
     * If is not positive, an {@link NegativeAmountException} exception should be thrown
     *
     * @param monthlyRevenue
     */
    public SalaryInfo(Double monthlyRevenue) {
        this.monthlyRevenue = monthlyRevenue;
        this.totalRevenue = 0.0;


    }

    public SalaryInfo() {

    }

    /**
     * Add incoming salary to total revenue
     */
    public void addSalary() {
        //throw new UnsupportedOperationException("Not supported yet.");
        totalRevenue = totalRevenue + monthlyRevenue;
        System.out.println("Total revenue after adding salary: " + totalRevenue);
    }

    /**
     * Add certain amount of money as bonus
     * If is not positive, an {@link NegativeAmountException} exception should be thrown
     *
     * @param value - money to be added
     */
    public void addMoney(final Double value) {
       // throw new UnsupportedOperationException("Not supported yet.");
        totalRevenue = totalRevenue + value;
        System.out.println("" + totalRevenue);
    }

    /**
     * Pay certain amount of money as tax
     * If is not positive, an {@link NegativeAmountException} exception should be thrown
     * If not enough revenue found, an {@link NegativeBalanceException } exception should be thrown
     *
     * @param value - value to be paid
     */
    public void payTax(final Double value) {
        //throw new UnsupportedOperationException("Not supported yet.");
        totalRevenue = totalRevenue - value;
        System.out.println("" + totalRevenue);

    }

    public Double getTotalRevenue() {
        return totalRevenue;
    }

    public Double getMonthlyRevenue() {
        return monthlyRevenue;
    }
}