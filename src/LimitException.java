public class LimitException extends Exception {
    private double remainingAmount;

    public LimitException(String message, double amount) {
        super(message);
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }


}
