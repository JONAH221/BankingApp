public class Account {

    /**
     * New int (lastId = 0) Each time a new account object is created, increments
     * Lastaccountnumber/ lastId then assigning it to new account accountId
     */
    private static int lastId = 0;
    private int id;
    private String firstName;



    public Account(String Name) {
        lastId++;
        this.id = lastId;
        this.firstName = firstName;
    }

    public int getAccountId() {
        return id;
    }

    public String getAccountName() {
        return firstName;
    }
}