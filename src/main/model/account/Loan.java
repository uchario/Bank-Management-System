package src.main.model.account;

public class Loan extends Account {
    public Loan(String id, String name, double balance) {
        super(id, name, balance);
    }

    public Loan(Account source) {
        super(source);
    }
}
