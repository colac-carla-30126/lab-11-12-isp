package aut.utcluj.isp.ex4;

public class SalaryInfo {
    private Double totalRevenue;
    private Double monthlyRevenue;

    /**
     * If is not positive, an {@link NegativeAmountException} exception should be thrown
     *
     * @param monthlyRevenue
     */
    public SalaryInfo(Double monthlyRevenue) throws NegativeAmountException {
        this.monthlyRevenue = monthlyRevenue;
        this.totalRevenue = 0d;
        if (this.monthlyRevenue < 0) {
            throw new NegativeAmountException();
        }

    }

    /**
     * Add incoming salary to total revenue
     */
    public void addSalary() {
        this.totalRevenue = totalRevenue + monthlyRevenue;
    }

    /**
     * Add certain amount of money as bonus
     * If is not positive, an {@link NegativeAmountException} exception should be thrown
     *
     * @param value - money to be added
     */
    public void addMoney(final Double value) throws  NegativeAmountException{
        if (value < 0) {
            throw new NegativeAmountException();
        }
        else
        {
            this.totalRevenue=totalRevenue+value;
        }
        // throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Pay certain amount of money as tax
     * If is not positive, an {@link NegativeAmountException} exception should be thrown
     * If not enough revenue found, an {@link NegativeBalanceException } exception should be thrown
     *
     * @param value - value to be paid
     */
    public void payTax(final Double value) throws Exception{
        // throw new UnsupportedOperationException("Not supported yet.");
        if( value<0) {
            throw new NegativeAmountException();
        }
        if(value>totalRevenue){
            throw  new NegativeBalanceException();
        }
        this.totalRevenue=totalRevenue-value;
    }

    public Double getTotalRevenue() {
        return totalRevenue;
    }

    public Double getMonthlyRevenue() {
        return monthlyRevenue;
    }
}

