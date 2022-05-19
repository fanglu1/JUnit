public class BankAcc {
    private static double balance;
    private String name;

    public BankAcc(double balance, String name) {
        BankAcc.balance = balance;
        this.name = name;
    }
    public static double deposit(double dep) {
        balance += dep;
        return dep;
    }
    public static double withdrawal(double with) {
        balance -= with;
        return with;
    }
    public double transfer(BankAcc transferMoney, double money) {
        double giveMoney = this.withdrawal(money);
    return transferMoney.deposit(giveMoney);
    }
    public void total() {
        System.out.println(name + ", your account balance is: " + balance);
    }

}
