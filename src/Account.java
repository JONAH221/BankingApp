/**
 * Represents a bank account with a unique ID, a first and last name, and a balance.
 *
 * This class provides functionality to deposit, withdraw, and check balance.
 * Each time an account is created it receives a unique account ID. The ID increments
 * each new account created.
 *
 * GitHub Repository: https://github.com/JONAH221/BankingApp
 *
 * @author Jonah Zuehlke, Garrett Finke
 * @version 2.0
 */
public class Account {

    /**
     * New int (lastId = 0) Each time a new account object is created, increments
     * Lastaccountnumber/ lastId then assigning it to new account accountId
     */

    private static int lastId = 0;
    private int id;
    private String firstName;
    private String lastName;
    private double balance = 0.0; // set the default balance to 0


    public Account() {
        this.id = ++Account.lastId;
        this.firstName = "Unknown";
    }




    public Account(String firstName,String lastName) {
        this();
        setFirstName(firstName);
        setLastName(lastName);
        this.lastName = lastName;
    }

    /**
     * Setsetname
     * set the last so you cant have a null name so it can assign you an id number
     */

    public void setFirstName (String firstName) {
        if (firstName == null || firstName.isEmpty())
            throw new IllegalArgumentException("Invalid last name! Name can't be blank for id: " + id);
        else
            this.firstName = firstName;
    }


    public void setLastName (String lastName) {
        if (lastName == null || lastName.isEmpty())
            throw new IllegalArgumentException("Invalid last name! Name can't be blank for id: " + id);
        else
            this.lastName = lastName;
    }

    /**
     * Retrieves the current balance of the account.
     * @return The balance of the account.
     */

    public double getBalance() {
        return balance;
    }

    /**
     * Deposits an amount into the account. The amount must be greater than zero.
     * @param amount The amount to deposit.
     * @throws IllegalArgumentException if the amount is less than or equal to zero.
     */

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount! Deposit amount must be greater than zero.");
        }
        balance += amount;
    }

    /**
     * Withdraws an amount from the account. The amount must be greater than zero and less than
     * or equal to the balance.
     * @param amount The amount to withdraw
     * @throws IllegalArgumentException if the amount is less than or equal to zero or greater
     * than the current balance.
     */

    public void withdrawal(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount! Withdrawal amount must be greater" +
                    " than zero.");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds! Withdrawal amount cannot be " +
                    "greater than account balance.");
        }
        balance -= amount;
    }

    /**
     * Returns a string representation of the account, including the account ID and full name.
     *@return A string representation of the account.
     */

    @Override
    public String toString() {
        return "Account ID: " + id + ", Name: " + getFullName();
    }

    /**
     * Retrieves the full name of the account holder (first and last name).
     * @return The full name of the account holder.
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }

    /**
     * Retrieves the account ID.
     * @return The account ID.
     */
    public int getAccountId() {
        return id;
    }

}