package dtisoy.ejercicio5;

/**
 *
 * @author dtisoy
 */
public class Ejercicio5 {

    public static void main(String[] args) {

        BankAccount daniel = new BankAccount("Daniel", "Tisoy", 1230394, 1000, (float) 0.1, BankAccount.AccountType.CHECKING);
        BankAccount luis = new BankAccount("Luis", "Cordoba", 45556, 5000000, (float) 0.12, BankAccount.AccountType.SAVINGS);

        // print accounts info
        System.out.println("========== Daniel ===========");
        daniel.showInfo();
        System.out.println();

        System.out.println("========== Luis ===========");
        luis.showInfo();
        System.out.println();

        // testing methods
        daniel.deposit(300000);

        luis.withdraw((float) 1459.9);

        separator();
        System.out.println("update balance with interest rate");
        System.out.println();
        System.out.println("Daniel: ");
        System.out.print("Before ");
        System.out.println(daniel.getBalance());

        daniel.updateWithInterestRate();
        System.out.print("After ");
        System.out.println(daniel.getBalance());

        separator();
        daniel.transfer(luis, 45000);
        System.out.println();
        // print accounts info
        System.out.println("========== Daniel ===========");
        daniel.showInfo();
        System.out.println();

        System.out.println("========== Luis ===========");
        luis.showInfo();
        System.out.println();

    }

    private static void separator() {
        System.out.println();
        System.out.println("-----------------------");
    }
}
