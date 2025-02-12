public class Tester {

    public static void main(String[] args) {

        /**
         *  testing for the Account.java file in tester and testing inputs
         *  creates new accounts with names. attach accountId to the name and displays it to the
         *  console.
         *
         */
        Account account1 = new Account("John", "Doe");
        Account account2 = new Account("Jane", "Doe");

        // Test Account 1
        System.out.println("Account 1 Full Name: " + account1.getFullName());
        System.out.println("Account 1 ID: " + account1.getAccountId());
        System.out.println("Account 1 Initial Balance: " + account1.getBalance()); // Should be 0.0

        // Deposit and check balance
        account1.deposit(500.0); // Deposit $500
        System.out.println("Account 1 Balance after deposit: " + account1.getBalance()); // Should be 500.0

        // Withdraw and check balance
        account1.withdrawal(200.0); // Withdraw $200
        System.out.println("Account 1 Balance after withdrawal: " + account1.getBalance()); // Should be 300.0

        // Test error handling: Withdraw more than the balance
        try {
            account1.withdrawal(350.0); // This should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error during withdrawal: " + e.getMessage()); // Expect an error message
        }

        // Test Account 2
        System.out.println("\nAccount 2 Full Name: " + account2.getFullName());
        System.out.println("Account 2 ID: " + account2.getAccountId());
        System.out.println("Account 2 Initial Balance: " + account2.getBalance()); // Should be 0.0

        // Deposit into Account 2 and check balance
        account2.deposit(1000.0); // Deposit $1000
        System.out.println("Account 2 Balance after deposit: " + account2.getBalance()); // Should be 1000.0

        // Try depositing an invalid amount (negative)
        try {
            account2.deposit(-50.0); // This should throw an exception
        } catch (IllegalArgumentException e) {
            System.out.println("Error during deposit: " + e.getMessage()); // Expect an error message
        }

        // Final state of both accounts
        System.out.println("\nFinal Account 1 Balance: " + account1.getBalance()); // 300.0
        System.out.println("Final Account 2 Balance: " + account2.getBalance()); // 1000.0
    }
}
