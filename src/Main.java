public class Main {

    public static void main(String[] args) throws Exception {
        
        BankAccount account1 = new BankAccount("Mike", 500);
        BankAccount account2 = new BankAccount("Larry", 5000);
        BankAccount account3 = new BankAccount("Mary", 300);

        account1.deposit(100);
        account1.getAccountInfo();

        account2.withdrawal(100);
        account2.getAccountInfo();
        account3.deposit(100);
        account3.getAccountInfo();

    }
}