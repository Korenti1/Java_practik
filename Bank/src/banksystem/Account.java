package banksystem;

public class Account {

    private Person accountHolder;

    private Bill bill;

    public Account(Person accountHolder, Bill billl){
        this.accountHolder = accountHolder;
        this.bill = billl;
    }

    public Person getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Person accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Bill getBilll() {
        return bill;
    }

    public void setBilll(Bill billl) {
        this.bill = billl;
    }

}
