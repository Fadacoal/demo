

public class UserException extends Exception {
    private double amount;

    public UserException(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}