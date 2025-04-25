import java.util.Date;

public class PaymentAccount extends Bank {
    private String cardNumber;
    private int money;


    public PaymentAccount(int bankID, String code, String bankName, Date creationDate, String cardNumber, int money) {
        super(bankID, code, bankName, creationDate);
        this.cardNumber = cardNumber;
        this.money = money;
    }

    public PaymentAccount(String cardNumber, int money) {
        this.cardNumber = cardNumber;
        this.money = money;
    }

    @Override
    public String toString() {
        return "PaymentAccount{" +
                "cardNumber='" + cardNumber + '\'' +
                ", money=" + money +
                '}';
    }
}
