public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.0);

        System.out.println("Initial Balance : " + account.getBalance());

        account.deposit(500.00);

        account.deposit(250.00, "Salary credit");

    }
}
