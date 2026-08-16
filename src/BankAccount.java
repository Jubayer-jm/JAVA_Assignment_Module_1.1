public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    //getter method-controll read access
    public double getBalance(){
        return balance;
    }
    //polymorphisom:overloading
    //simple deposit

    public void deposit(double amount){
        if(amount>0) {
            balance += amount;
            System.out.println("Deposited: " + amount + " | New Balance: " + balance);
        }
            else {
                System.out.println("Invalid deposit amount.");
            }
        }
        public void deposit(double amount,String remarks){
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposited: " + amount +
                        " | Remarks: " + remarks +
                        " | New Balance: " + balance);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }
    }

