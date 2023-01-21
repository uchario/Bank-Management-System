package src.main.model.account;

public class Savings extends Account {
    public Savings(String id, String name, double balance) {
        super(id, name, balance);
    }

    public Savings(Account source) {
        super(source);
    }
}
