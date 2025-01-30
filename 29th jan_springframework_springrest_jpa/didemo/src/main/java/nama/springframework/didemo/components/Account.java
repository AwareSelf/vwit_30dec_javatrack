package nama.springframework.didemo.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:application.properties")
@Component(value="accbean")
public class Account {
    @Value("${acct.acctid}")
    private int acctId;

    @Value("${acct.acctname}")
    private String acctName;

    @Value("${acct.acctbal}")
    private double acctBal;

    public Account() {
    }

    public Account(int acctId, String acctName, double acctBal) {
        this.acctId = acctId;
        this.acctName = acctName;
        this.acctBal = acctBal;
    }

    public int getAcctId() {
        return acctId;
    }

    public void setAcctId(int acctId) {
        this.acctId = acctId;
    }

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName;
    }

    public double getAcctBal() {
        return acctBal;
    }

    public void setAcctBal(double acctBal) {
        this.acctBal = acctBal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return getAcctId() == account.getAcctId();
    }



    @Override
    public String toString() {
        return "Account{" +
                "acctId=" + acctId +
                ", acctName='" + acctName + '\'' +
                ", acctBal=" + acctBal +
                '}';
    }
}
