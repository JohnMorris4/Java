package Morrisje.com;

public class Main {

    public static void main(String[] args) {
        VIPCustomer testuser = new VIPCustomer();
        System.out.println(testuser.getName());

        VIPCustomer testuser2 = new VIPCustomer("John",200.00);
        System.out.println(testuser2.getName() + testuser2.getEmail());

        VIPCustomer Sysco = new VIPCustomer("Sysco", 20000, "user@sysco.com");
        System.out.println(Sysco.getName() + " " + Sysco.getCreditLimit() + " " + Sysco.getEmail());

        // Create a new class for a bank account
        // Create fields for the account number, balance, customer name, email and phone number.
        //
        // Create getters and setters for each field
        // Create two additional methods
        // 1. To allow the customer to deposit funds (this should increment the balance field).
        // 2. To allow the customer to withdraw funds. This should deduct from the balance field,
        // but not allow the withdrawal to complete if their are insufficient funds.
        // You will want to create various code in the Main class (the one created by IntelliJ) to
        // confirm your code is working.
        // Add some System.out.println's in the two methods above as well.

    /*BankAccount johnsAccount = new BankAccount(1751857, 1000, "John Morris", "johnmorris@je.com", "(803)729-3253");
        System.out.println("Customer Name: "  +johnsAccount.getCustomerName());
        System.out.println("Customer Email: " + johnsAccount.getCustomerEmail());
        System.out.println("Customer Phone: " +johnsAccount.getCustomerPhone());
        System.out.println("Balance: "+johnsAccount.getBalance());
    johnsAccount.deposit(500);
    johnsAccount.withdrawal(100.00);

    BankAccount katiesAccount = new BankAccount("Katie Morris", "kittykat","12345");
        System.out.println(katiesAccount.getCustomerName());
        System.out.println(katiesAccount.getCustomerEmail());
        System.out.println(katiesAccount.getCustomerPhone());
*/

        // Create a new class VipCustomer
        // it should have 3 fields name, credit limit, and email address.
        // create 3 constructors
        // 1st constructor empty should call the constructor with 3 parameters with default values
        // 2nd constructor should pass on the 2 values it receives and add a default value for the 3rd
        // 3rd constructor should save all fields.
        // create getters only for this using code generation of intellij as setters wont be needed
        // test and confirm it works.
    }
}
