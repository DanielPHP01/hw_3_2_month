public class BankAccount  {

    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum) {
        amount += sum;
        System.out.println("�� ����� " + sum);
    }

    public void withDraw(int sum) throws Exception {
        if (amount < sum) {
            throw new LimitException(" �� ���������� ������� ",amount);
        } else {
            amount -= sum;
            System.out.println("�� ����� -" + sum);

        }
    }
}

