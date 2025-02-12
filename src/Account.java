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
     * new method to get balance
     * @return
     */

    public double getBalance() {
        return balance;
    }

    /**
     * deposit method
     * takes amount from the input.
     * if the amount is less than or equal to zero it will throw an IllegalArgumentException.
     * if the input is valid it adds deposit amount to the balance.
     * @param amount
     */

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid amount! Deposit amount must be greater than zero.");
        }
        balance += amount;
    }

    /**
     * takes in a amount as input.
     * if the amount is less than or equal to zero throws an IllegalArgumentException
     * it will throw another error if the withdrawal amount is greater than the current balance.
     * if the input is valid it will subttract the withdrawal amount from the balance.
     * @param amount
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

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public int getAccountId() {
        return id;
    }

    public String getAccountName() {
        return firstName;
    }
}