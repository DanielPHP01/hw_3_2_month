public class BankAccount  {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("На счету " + sum);
    }

    public void withDraw(int sum) throws Exception {
        if (amount < sum) {
            throw new LimitException(" Не достаточно средств ",amount);
        } else {
            amount -= sum;
            System.out.println("вы сняли -" + sum);

        }
    }
}

