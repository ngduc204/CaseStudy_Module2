import java.util.Date;

public class SavingsAccount extends Bank{
    private int savingsAmount;
    private Date savingsDate;
    private int interestRate;
    private Date period;

    public SavingsAccount(int bankID, String code, String bankName, Date creationDate, int savingsAmount, Date savingsDate, int interestRate, Date period) {
        super(bankID, code, bankName, creationDate);
        this.savingsAmount = savingsAmount;
        this.savingsDate = savingsDate;
        this.interestRate = interestRate;
        this.period = period;
    }

    public SavingsAccount(int savingsAmount, Date savingsDate, int interestRate, Date period) {
        this.savingsAmount = savingsAmount;
        this.savingsDate = savingsDate;
        this.interestRate = interestRate;
        this.period = period;
    }

    public int getSavingsAmount() {
        return savingsAmount;
    }

    public void setSavingsAmount(int savingsAmount) {
        this.savingsAmount = savingsAmount;
    }

    public Date getSavingsDate() {
        return savingsDate;
    }

    public void setSavingsDate(Date savingsDate) {
        this.savingsDate = savingsDate;
    }

    public int getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }

    public Date getPeriod() {
        return period;
    }

    public void setPeriod(Date period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "savingsAmount=" + savingsAmount +
                ", savingsDate=" + savingsDate +
                ", interestRate=" + interestRate +
                ", period=" + period +
                '}';
    }
}
