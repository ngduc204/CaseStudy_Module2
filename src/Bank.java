import java.util.Date;

public abstract class Bank {
    private int bankID;
    private String code;
    private String bankName;
    private Date creationDate;

    public Bank(int bankID, String code, String bankName, Date creationDate) {
        this.bankID = bankID;
        this.code = code;
        this.bankName = bankName;
        this.creationDate = creationDate;
    }

    public Bank() {
    }

    public int getBankID() {
        return bankID;
    }

    public void setBankID(int bankID) {
        this.bankID = bankID;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankID=" + bankID +
                ", code='" + code + '\'' +
                ", bankName='" + bankName + '\'' +
                ", creationDate=" + creationDate +
                '}';
    }
}
