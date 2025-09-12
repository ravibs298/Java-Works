class BankAccount {
    protected double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public void display() {
        System.out.println("Current balance: " + balance);
    }
}
class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied. Balance cannot fall below 100.");
        } else {
            super.withdraw(amount);
        }
    }
}
public class CWR_45 {
    public static void main(String[] args) {
        SavingsAccount accountHolder1 = new SavingsAccount(1000);
        System.out.println("Account Holder 1:");
        accountHolder1.display();
        accountHolder1.deposit(500);
        accountHolder1.withdraw(300);
        accountHolder1.display();
        accountHolder1.withdraw(1200);
        accountHolder1.display();
    }
}