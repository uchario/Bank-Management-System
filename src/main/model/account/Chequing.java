package src.main.model.account;

public class Chequing extends Account {
    public Chequing(String id, String name, double balance) {
        super(id, name, balance);
    }

    public Chequing(Account source) {
        super(source);
    }
}
