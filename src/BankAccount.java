public class BankAccount {
    
    private String accountHolderName;
    private double accountBalance;

    public BankAccount (String name, double balance) {
        this.accountHolderName = name;
        this.accountBalance = balance;
    }

    public double deposit(double amount) {
        System.out.println(accountHolderName + " deposited $" + amount);
        return accountBalance += amount;
    }

    public void withdrawal(double amount) {
        if (amount > accountBalance) {
            System.out.println(accountHolderName + " has insufficient funds!");
        } else {
            System.out.println(accountHolderName + " withdrew $" + amount);
            accountBalance -= amount;
        }
    }

    public void getAccountInfo() {
        System.out.println(accountHolderName + "'s account balance: $" + accountBalance);
    }
}
