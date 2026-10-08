package dtisoy.ejercicio5;

/**
 *
 * @author dtisoy
 */
public class BankAccount {

    public enum AccountType {
        SAVINGS, CHECKING
    }
    String holderName, holderLastname;
    int accountNumber;
    float balance;
    float interestRate;
    AccountType accountType;

    public BankAccount(String holderName,
            String holderLastname,
            int accountNumber,
            float balance,
            float interestRate,
            AccountType accountType) {
        this.holderName = holderName;
        this.holderLastname = holderLastname;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.interestRate = interestRate;
        this.accountType = accountType;
    }

    public float getBalance() {
        return balance;
    }

    public void showInfo() {
        System.out.println("Account holder's name: " + this.holderName);
        System.out.println("Account holder's lastname: " + this.holderLastname);
        System.out.println("Account number: " + this.accountNumber);
        System.out.println("Account Type: " + this.accountType);
        System.out.println("Balance: " + this.balance);
        System.out.println("Interest Rate: " + this.interestRate);
    }

    public void printBalance() {
        System.out.print("Your Balance is: " + this.balance);
    }

    public boolean deposit(float amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println(this.holderName + " got a deposit of $" + amount);
            return true;
        } else {
            System.out.println(this.holderName + " must deposit amount bigger than 0");
            return false;
        }
    }

    public boolean withdraw(float amount) {
        if ((amount > 0) && (amount <= this.balance)) {
            this.balance -= amount;
            System.out.println(this.holderName +" withdraw an amount of $" + amount);
            return true;
        } else {
            System.out.println(this.holderName + " withdraw limit is $" + this.balance);
            return false;
        }
    }

    public boolean transfer(BankAccount account, float amount) {
        boolean source = this.withdraw(amount);
        if (source) {
            boolean endpoint = account.deposit(amount);
            if (endpoint) {
                System.out.println(this.holderName + " transfered $" + amount + " to " + account.holderName);
                return endpoint;

            } else {
                System.out.println("Ohh, something happened, error with transfer");
                return endpoint;
            }
        } else {
            System.out.println("Ohh, something happened, error with transfer");
            return source;
        }

    }

    public boolean updateWithInterestRate() {
        float increment = this.balance * this.interestRate;
        boolean depo = this.deposit(increment);
        
        return depo;
    }

}
