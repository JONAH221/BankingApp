public class Account {

    /**
     * New int (lastId = 0) Each time a new account object is created, increments
     * Lastaccountnumber/ lastId then assigning it to new account accountId
     */
    private static int lastId = 0;
    private int id;
    private String firstName;
    private String lastName;




    public Account(String firstName,String lastName) {
        this.id = ++lastId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Setsetname
     * set the last so you cant have a null name so it can assign you an id number
     */
    public void setlastName (String lastName) {
        if (lastName == null || lastName.isEmpty())
            throw new IllegalArgumentException("Invalid last name! Name can't be blank for id: " + id);
        else
            this.lastName = lastName;
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